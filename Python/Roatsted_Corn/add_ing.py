def add_ing(word):
	f len(word) >= 3 and "ing" not in word:
		word += "ing"
	elif "ing" in word:
		word += "ly"
	elif len(word) < 3:
		return word

		return word


print(add_ing("Ebunoluwa"))
