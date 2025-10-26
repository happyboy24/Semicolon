from functools import reduce


def add(input):
	for count in range(len(input)):
		input[count] = sum(input[count])
	return input
		
input = [[2,3,4],[1,5,7],[4,6,8]]
print(add(input))

def sum_all_index(numbers):
	index_sum = 0
	for row in numbers:
		for column in numbers:
			index_sum += (row + column)
	return index_sum
print(index_sum)


def even(numbers):
	return numbers % 2 == 0
numbers = (number for number in range(1,22))
result = (list(filter(get_even,numbers)))
print(result)


def bigger_strings(words):
	return len(words) > 5
words = ["cat", "elephant", "tiger", "lion"]
result = (list(filter(get_some_strings,words)))
print(result)


def greater_values(list):
	for row in range(list.length):
		for column in range(list[row].length):
			return list[row][column] > 2
list = [(1,"A"), (4, "B"), (2, "C")] 
result = (list(filter(get_some_tuples,list)))
print(result)


def multiples_of_three_and_five(numbers):
	return numbers % 15 == 0 
numbers = [number for number in range(1,52)]
result = (list(filter(get_multiples_of_three_and_five,numbers)))
print(result)

def palindromes(words):
	return words == words[-1::-1]
words = ["level", "world", "madam", "python"]
result = (list(filter(get_palindromes,words)))
print(result)

def convert(strings):
	return strings.upper()
strings = ["python", "java", "c++"]
result = (list(map(convert,strings)))
print(result)


def square(numbers):
	return numbers ** 2
numbers = [1,2,3,4,5,6,7,8,9,10]
result = (list(map(get_square,numbers)))
print(result)


def first_letter(names):
	return names[0].upper() + names[1:]
names = ["john", "mary", "steve"]
result = (list(map(first_letter,names)))
print(result)


def inflate(prices):
	return prices + (0.1 * prices)
prices = [100,200,300]
result = (list(map(inflate,prices)))


def sum(numbers,next_number):
	return numbers + next_number
numbers = (number for number in range(1,51))
result = (reduce(get_sum,numbers))
print(result)

def maximum(numbers,next_number):
	max = numbers
	if next_number > max:
		max = next_number
	return max
numbers = [3,5,9,2,8]
result = (reduce(get_maximum,numbers))
print(result)

def concatenate_strings(words,next_word):
	return words + " " + next_word
words = ["I", "love", "Python"]
result = (reduce(join_strings,words))
print(result)

def the_squares(numbers):
	return numbers ** 2
numbers = [1,2,3,4]
squares = list(map(get_squares,numbers))
print(squares)

def the_product(squares,next_square):
	return squares + next_square
result = (reduce(get_product,squares))
