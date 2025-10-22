def colors_change():
	colors = ['red', 'green', 'blue']
	remove = colors.pop(2)
	add = colors.append('yellow')

	return colors
print(colors_change())