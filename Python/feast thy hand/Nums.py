def nums():
	numbers = [1,2,3,4,5,6,7,8,9,10]
	my_list = []
	for num in numbers:
		if num % 2 ==0:
			Add  = my_list.append(num)
		
	return my_list

print(nums())