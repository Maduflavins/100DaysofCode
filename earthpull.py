import math

earth_radius = 6378 * math.pow(10, 3)
earth_mass = 5.9742 * math.pow(10, 24)
constant_gee = 6.67300 * math.pow(10, -11)

jones_mass = float(input("Mr. Jones! Please enter your mass: "))

gravitational_force = (constant_gee * earth_mass * jones_mass) / math.pow(earth_radius, 2)
acc_due_grav = gravitational_force / jones_mass

print(gravitational_force)
print(acc_due_grav)
