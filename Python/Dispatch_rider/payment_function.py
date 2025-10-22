def payment_new(number_of_deliveries):
	payment = 0
	if type(number_of_deliveries) == int:
		if number_of_deliveries >= 0 and number_of_deliveries <= 49:		
			payment = (160 * number_of_deliveries) + 5000
		elif number_of_deliveries >= 50 and number_of_deliveries <= 59:	
			payment = (200 * number_of_deliveries) + 5000
		elif number_of_deliveries >= 60 and number_of_deliveries <= 69:	
			payment = (250 * number_of_deliveries) + 5000
		elif number_of_deliveries >= 70 and number_of_deliveries <= 100:
			payment = (500 * number_of_deliveries) + 5000
		else: 
			return TypeError ("Invalid input!")
	

	return payment