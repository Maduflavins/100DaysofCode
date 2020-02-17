import math
counter = 0

num = int(input("Enter an integer greater than 2: "))
#square_root

while num <= 2:
    num = int(input("Wrong! Enter an integer greater than 2: "))
else:
    square_root = math.sqrt(num)
    counter += 1
    print(counter,':',square_root)
    while square_root >= 2:
        square_root = math.sqrt(square_root)
        counter += 1
        print(counter,':',square_root)
