rating = int(input('Enter an integer rating between 1 and 10: '))
if 1 <= rating and rating <= 10:
	print("You entered a valid rating of: ")
            
if rating >= 10:
	print("Invalid rating. Please enter a number between 1 and 10.")
if  rating < 1:
	print("Invalid input. Please enter a whole number.")