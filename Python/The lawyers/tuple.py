numbers = (1, 2, [3, 4], 5)

def add_to_tuple(tuple,*increase):
	tuple +=  increase
	return tuple



def change_tuple(*numbers):
	numbers = list(numbers)
	numbers[2][1] = 99
	return numbers



def unpack(*numbers):
	a, b, *c = numbers
	print(a,b,c)


def covert_to_ string():
	fruits = ("apple", "banana", "cherry")
	my_fruits = list(fruits)
	my_fruits.append("mango")
	fruits = tuple(my_fruits)
	print(fruits)
