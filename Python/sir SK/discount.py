def oga_discount(price,discount):
	discount_amount = price - (price*discount/100)
	return discount_amount
user1 = int(input("Enter discount: "))
user2 = int(input("Enter price: "))
result = oga_discount(user1,user2)



print(result)