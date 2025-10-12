def only_floats(a,b):
	count = 0
	if  (a, float):
		count += 1
	if  (b, float):
		count += 1

	return count

print(only_floats(12.1,23))
print(only_floats(12.1,23.5))
print(only_floats(12,23))