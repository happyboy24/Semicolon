from payment_function import *

deliveries = int(input("Driver enter the number of packages successfully delivered : "))
if deliveries <= 100 and deliveries >= 0:
	print("The driver earned: N" + str(payment_new(deliveries)))

print(payment_new(deliveries))