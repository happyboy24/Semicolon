def divide_or_square(number):
	
	if number % 5 == 0:		
		return number ** 0.5
	if number % 5 != 0:	
		return number % 5
#user1 = int(input("Enter number: "))

print(divide_or_square(10))