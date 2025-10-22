def new_list():
	words = ["lamb", "kit", "yam", "kings", "dogs", "man"]
	my_words = []
	for word in words:
		if len(word) > 3:
			Add  = my_words.append(word)

	return my_words

print(new_list())