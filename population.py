#A birth every 7 seconds
#A death every 13 seconds
#A new immigrant every 35 seconds
#Seconds in a year 31536000

est_population = int(input("Enter estimated population: "))
births = 31536000 * (1/7)
deaths = 31536000 * (1/13)
immigrants = 31536000 * (1/35)

new_est_population = (est_population + (births + immigrants)) - deaths
print("Estimated births: ", end="")
print(births)
print("Estimated deaths: ", end="")
print(deaths)
print("Estimated migrants: ", end="")
print(immigrants)
print("Estimated new population: ", end="")
print(new_est_population)
