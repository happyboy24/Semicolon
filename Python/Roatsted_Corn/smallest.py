def get_smallest(numbers):
	min = numbers[0]
	for number in range(len(numbers)):
		if numbers < min:
			min = numbers[number]
		return min

print(get_largest_number(8,4,9,2,5,6,3))