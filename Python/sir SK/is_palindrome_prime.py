def is_palindrome_prime(n: int):
	if n < 2:
		return False
	if str(n)!= str(n)[ -1]:
		return False
	for count in range (2, int (n**0.5) + 1):
		if n % count == 0:
		
			return False

			return True

print(is_palindrome_prime(2))
print(is_palindrome_prime(11))
print(is_palindrome_prime(121))
print(is_palindrome_prime(13))
print(is_palindrome_prime(-7))