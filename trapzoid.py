"""If the lengths of the two parallel sides of a trapezoid are X meters and Y meters,
respectively, and the height is H meters, what is the area of the trapezoid?Write Python
code to output the area."""

x = int(input("Enter the length: "))
y = int(input("Enter the width: "))
h = int(input("Enter the height: "))

trapezoid = ((1 / 2) * (x + y)) + h
print("the area of the trapezoid is :", end='')
print(trapezoid)
