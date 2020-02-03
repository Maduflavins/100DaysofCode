"""13. Write a program that prompts for an integer and prints the integer, but if something
other than an integer is input, the program keeps asking for an integer. Here is a sample
session:
Input an integer: abc
Error: try again. Input an integer: 4a
Error: try again. Input an integer: 2.5
Error: try again. Input an integer: 123
The integer is : 123
Hint: the string isdigit method will be useful.



while !(num.isDigit()):
    num = int(int("Error: try again. Input an Integer:" )
else:
    print("The integer is ", num)

num = int(input("Input and integer: "))

while num.isDigit() == False:
    num2 = input("Input and integer: ")
else:
    print (num2)

while True:
    try:
        k = input("integer:")    # gets a string
        k = int(k)               # tries integer conversion
        break                    # if success: break while True loop
    except ValueError:
        print("Try again.")      # int() failed

print(k)"""
