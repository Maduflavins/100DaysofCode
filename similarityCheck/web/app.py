from flask import Flask, jsonify, request
from flask_restful import Api, Resource
from pymongo import MongoClient
#from flask_pymongo import PyMongo
from bson.json_util import dumps
from bson.objectid import ObjectId
from werkzeug.security import generate_password_hash,check_password_hash
import bcrypt
import spacy
#import PyMongo 
from pymongo.errors import ConnectionFailure


app = Flask(__name__)
api = Api(app)

app.secret_key = "secretkey"

#app.config["MONGO_URI"] = "mongodb://madu:bigdata123@ds141108.mlab.com:41108/db2020"
#client = MongoClient()
# try:
#    # The ismaster command is cheap and does not require auth.
#    client.admin.command('ismaster')
#    print("Server is connected")
# except ConnectionFailure:
#    print("Server not available")
# try:
#     client = MongoClient('mongodb://localhost:27017/')
#     #client = pymongo.MongoClient("someInvalidURIOrNonExistantHost",
#                                      #serverSelectionTimeoutMS=maxSevSelDelay)
#     client.server_info() # force connection on a request as the
#                          # connect=True parameter of MongoClient seems
#                          # to be useless here 
#     print("connected")
# except ConnectionFailure.ServerSelectionTimeoutError as err:
#     print(err)
# try:
#     client = MongoClient()
#     client = MongoClient("mongodb://madu:bigdata123@ds141108.mlab.com:41108/db2020")
#     print('connected')
# except ConnectionFailure:
#     print("Not connected")
#db = client.SimDB#

try:
    client = MongoClient("mongodb://madu:bigdata123@ds141108.mlab.com:41108/db2020")
    print("connetion runing")
except ConnectionFailure:
    print("Connection failed")
# create database
db = client["simcheckdb"]
#user connection
users = db["users"]

#for admin collenction
admin = db["admin"]


def UserExist(username):
    #count =  users.count_documents({})
    count =  users.count_documents({"Username": username})
    if count <= 0:
        return False
    else:
        return True


def verifyPw(username, password):
    if not UserExist(username):
        return False
    hashed_pw = db.users.find({
        "Username": username
    })[0]["Password"]

    if bcrypt.hashpw(password.encode('utf8'), hashed_pw)==hashed_pw:
        return True
    else:
        return False

def countTokens(username):
    tokens = users.find({
        "Username": username
    })[0]["Tokens"]

    return tokens

def AdminExist(username):
    if admin.find({"Username":username}).count() == 0:
        return False
    else:
        return True


def verifyAdminPw(username, password):
    if not AdminExist:
        return False
    hashed_pw = admin.find({
        "Username" : username
    })[0]["Password"]

    if bcrypt.hashpw(password.encode('utf8'), hashed_pw) == hashed_pw:
        return True
    else:
        return False


class RegisterAdmin(Resource):
    def post(self):
        postedData = request.get_json()
        username = postedData["username"]
        password = postedData["password"]

        if AdminExist(username):
            retJson={
                "status code": 301,
                "message": "Invalid username"
            }
            return jsonify(retJson)
        
        hashed_pw = bcrypt.hashpw(password.encode('utf8'), bcrypt.gensalt())

        admin.insert({
            "Username": username,
            "Password": password
        })

        retJson = {
            "status code": 200,
            "message": "successfully registered"
        }
        return jsonify(retJson)


class Register(Resource):
    def post(self):
        postedData = request.get_json()
        username = postedData["username"]
        password = postedData["password"]

        if UserExist(username):
            retJson = {
                "status code": 301,
                "message": "Invalid username"
            }
            return jsonify(retJson)
        hashed_pw = bcrypt.hashpw(password.encode('utf8'), bcrypt.gensalt())
        users.inser({
            "Username":  username,
            "Password": hashed_pw
        })
        retJson = {
            "status code": 200,
            "message": "successfully registered"
        }

        return jsonify(retJson)

class DetectSimilarity(Resource):
    def post(self):
        postedData = request.get_json()
        username = postedData["username"]
        password = postedData["password"]
        text1 = postedData["text1"]
        text2 = postedData["text2"]

        if not UserExist(username):
            retJson = {
                "status code" : 301,
                "message" : "Invalid Username"
            }
            return jsonify(retJson)

        
        correct_pw = verifyPw(username, password)

        if not correct_pw:
            retJson={
                "status code": 302,
                "message": "Incorrect password"
            }
            return jsonify(retJson)


        num_Of_Tokens = countTokens(username)

        if num_Of_Tokens <= 0:
            retJson = {
                "status code" : 303,
                "message" : "Out of Tokens"
            }
            return jsonify(retJson)    

        #calculate similarity
        nlp = spacy.load('en_core_web_sm')

        text1 = nlp(text1)
        text2 = nlp(text2)

        ratio = text1.similarity(text2)
        #NB: the closer to 1 ratio is the more similar the texts are

        retJson = {
            "status code" : 200,
            "similarity" : ratio,
            "message": "Similarity score calculated successfully"
        }
        
        current_tokens = countTokens(username)

        users.update({
            "Username": username
        },{
            "$set":{
                "Tokens":current_tokens-1
            }
        })

        return jsonify(retJson)


class Refill(Resource):
    def post(self):
        postedData = request.get_json()

        username = postedData["username"]
        password = postedData["password"]
        refill_amount = postedData["refill"]

        if not AdminExist(username):
            retJson = {
                "status code": 301,
                "message": "Invalid Usenrname"
            }
            return jsonify(retJson)
        

        
        correct_pw = verifyAdminPw(username, password)

        if not correct_pw:
            retJson = {
                "status code" : 304,
                "message" : "Incorrect password"
            }
            return jsonify(retJson)
        
        current_tokens = countTokens(username)
        users.update({
            "Username": username
        },{
            "$set":{
                "Tokens": current_tokens + refill_amount
            }
        })

        retJson = {
            "status code" : 200,
            "message": "Refilled successfully"
        }
        return jsonify(retJson)


api.add_resource(RegisterAdmin, '/admin')
api.add_resource(Register, '/register')
api.add_resource(DetectSimilarity, '/detect')
api.add_resource(Refill, '/refil')


if __name__ == '__main__':
    app.run(host='0.0.0.0')