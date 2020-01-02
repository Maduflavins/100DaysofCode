from flask import Flask, jsonify, request
from flask_restful import Api, Resource
from pymongo import MongoClient
import bcrypt
import spacy


app = Flask(__name__)
api = Api(app)

client = MongoClient("mongodb://:27017")
db = client.SimDB
users = db["Users"]


def UserExist(username):
    if users.find({"Username":username}).count() == 0:
        return False
    else:
        return True


def verifyPw(username, password):
    if not UserExist(username):
        return False
    hashed_pw = users.find({
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

        users.insert({
            "Username": username,
            "Password": hashed_pw,
            "Tokens": 6
        })

        retJson = {
            "status code": 200,
            "message": "You have successfully signed up to the API"
        }
        return jsonify(retJson)

class DetectSimilarity(Resource):
    def post(self):
        postedData = request.get_json()
        username = postedData["username"]
        password = postedData["password"]
        text1 = postedDat["text1"]
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