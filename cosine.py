import math

a = 3
b = 7
c = 9

value_one = ((math.pow(b, 2) + math.pow(c, 2)) - math.pow(a, 2)) / (2 * c * b)
angle_a = math.acos(value_one) * 57.2958
value_two = ((math.pow(a, 2) + math.pow(c, 2)) - math.pow(b, 2)) / (2 * a * c)
angle_b = math.acos(value_two) * 57.2958
value = ((math.pow(a, 2) + math.pow(b, 2)) - math.pow(c, 2)) / (2 * a * b)
angle_c = math.acos(value) * 57.2958


print(angle_a)
print(angle_c)
print(angle_b)

print(angle_a + angle_b + angle_c)
