"""Sum of consecutive integers
(a) Write a program that prompts for an integer—let’s call it X—and then finds the
sum of X consecutive integers starting at 1. That is, if X = 5, you will find the sum
of 1 + 2 + 3 + 4 + 5 = 15.
(b) Modify your program by"""

total = 0

x = int(input("Enter any integer: "))
for i in range(1, x+1):
    
    print(total, " + ", i, " = ", total + i)
    total += i
    print(i)
    #print(len[i])


"""b) Modify your program by enclosing your loop in another loop so that you can find
consecutive sums. For example, if 5 is entered, you will find five sums of consecutive
numbers:"""
