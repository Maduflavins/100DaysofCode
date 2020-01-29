time = int(input("Enter the number of seconds in the day: "))
a = time / 3600
a = int(a)
time = time % 3600
b = time / 60
b = int(b)
time = time % 60
#c = time / 60

print(a, "Hours", end=" ")
print(b, "Minutes", end=" ")
print(time, "seconds")
