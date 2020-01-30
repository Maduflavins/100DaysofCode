"""10. Write a short program that will:
    prompt the user for a number
    print out whether the number is a perfect square
    prompt the user for another number if the input was not a perfect square"""


    
num = int(input("Enter any integer: "))
sum = 0
sum_two = 0
if sum != num:
    for i in range(1, num):
        if num % i == 0:
            print (i)
            sum += i
    if num == sum:
        print("Number is a prime")
    elif num != sum:
        print("Number is not perfect")
        num_two = int(input("Enter any integer: "))
        for i in range(1, num_two):
            if num_two % i == 0:
                print (i)
                sum_two += i
        print(sum_two)
        if num_two == sum_two:
            print("Number is a perfect")
        else:
            print("Number is not a perfect")
    
