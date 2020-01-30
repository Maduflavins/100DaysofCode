prompt = int(input("Choose 1 for kg per msquare or 2 for pd per isquare: "))
if prompt == 1:
    weight = float(input("Enter your weight: "))
    height = float(input("Enter your height: "))
    bmi_value = float (weight / height**2)
    print(bmi_value)
else:
    weight = float(input("Enter weight in pounds: "))
    height = float(input("Enter height in inches: "))
    bmi_value = float (weight / height**2)
    print(bmi_value)


if bmi_value in range(0, 19):
    print("Underweight")
elif bmi_value in range(19, 25):
    print("Normal")
elif bmi_value in range(25, 30):
    print("Overweight")
else:
    print("Obese")
