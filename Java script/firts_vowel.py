word = "six"
vowels = "m","o","n","d,"a","y"
count = 0
for letter in word:
	for vowel in vowels:
		if letter == vowel:
			print(count)
	count += 1
					