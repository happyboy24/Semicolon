def get_color_change(color):
 
	if len(color) < 3:
		print('need 3 or more colors')
		return

	for count in range(len(color)):
 		if count == 2:
		print('third color is:' color[count])

color.pop()
color.append('yellow')

	colors = ['red', 'green', 'blue']

	
	

#print(colors)
#get_color_change(colors)