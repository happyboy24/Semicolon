<<<<<<< HEAD
def only_floats(a,b):
	count = 0
	if  (a, float):
		count += 1
	if  (b, float):
		count += 1
=======
def only_float(a, b):
    if isinstance(a, float) and isinstance(b, float):
        return 2
    elif isinstance(a, float) or isinstance(b, float):
        return 1
    else:
        return 0
>>>>>>> 56434165a97230fe38439b9402e13b2d8e0eb75a


number1 = float(input("Enter number one: "));
number2 = float(input("Enter number two: "));
output = number1, number2

print(output);
