completion_per_attempt = int(input("Enter completion per attempt: "))
c = (completion_per_attempt * 100 - 30) / 20

yards_per_attempt = int(input("Enter yards covered: "))
y = (yards_per_attempt - 3) / 4

touchdowns = int(input("Enter the touchdowns: "))
t = touchdowns * 20

interception = float(input("Enter number of interceptions: "))
i = 2.375 - (interception * 35)

#average = int

player_rating = ((c + y + t + i) / 6) * 100

print("Player ratings is ", player_rating)
