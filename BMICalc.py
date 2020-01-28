prompt = int(input("Choose 1 for kg per msquare or 2 for pd per isquare: "))
if prompt == 1:
    weight = float(input("Enter your weight: "))
    height = float(input("Enter your height: "))
    bmi_value = (weight / height**2)
    print(bmi_value)
else:
    weight = float(input("Enter weight in pounds: "))
    height = float(input("Enter height in inches: "))
    bmi_value = (weight / height**2)
    print(bmi_value)
