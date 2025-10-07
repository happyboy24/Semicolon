def factor_of(number):
	divisor = 1
	count_Factors = 0
	while divisor <= number :
		sum = number % divisor
		if sum == 0:
			countFactors += 1
		divisor += 1
	return count_Factors
print(factor_of(30))

def is_prime_number(number):
	divisor = 1
	Count = 0
	while divisor <= number :
		divide = number % divisor
		if divide == 0:
			Count += 1
		divisor += 1
	if Count == 2:
		return True
	if Count > 2:
		return False
print(is_prime_number(30))


def is_even(number):
	if number % 2 == 0:
		return True
	if number % 2 != 0:
		return False
print(is_even(30))


def subtract(first_number, second_number):
	sum = second_number - first_number
	if first_number > second_number:
		sum = sum * -1
	return answer
print(subtract(30))


def divide(first_number, second_number):
	if second_number == 0:
		return 0
	if second_number != 0:
		return first_number / second_number
print(divide(30))


def is_square(number):
	divisor = 1
	Count = 0
	while divisor <= number :
		divide = number % divisor
		if divide == 0 :
			Count += 1;
		divisor += 1;
	

	if factorCount % 2 != 0 :
		return True
	return False
print(is_square(30))

def is_palindrome(number):
	if number <= 99999 and number >= 10000:
		digit_1 = number // 10000
		digit_2 = (number % 10000) // 1000
		digit_3 = (number % 1000) // 100
		digit_4 = (number % 100) // 10
		digit_5 = number % 10

	new_number = str(digit_5) + str(digit_4) + str(digit_3) + str(digit_2) + str(digit_1)


	if int(new_number) == number:
		return True
	return False
print(is_palindrome(30))


def factorial_of(number):
	factorial = 1
	counter = 1
	while counter <= number :
		factorial *= counter
		counter += 1
	return factorial
print(factorial_of(30))


def square_of(number):
	return number ** 2
print(square_of(30))
