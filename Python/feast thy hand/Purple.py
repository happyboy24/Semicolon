def change():
	colors = ['red', 'green', 'blue']
	remove = colors.pop(2)
	add = colors.append('yellow')
	fix = colors.append('purple')
	return colors

print(change())