father_age = int(input("Enter the father's age(1-80):"))
son_age = int(input("Enter the son's age(1-80):"))

if father_age <= son_age:
	print("invalid!, the father's age should be greater ")


age_difference = father_age - son_age

twice_son_age = age_difference

the_year = (son_age - twice_son_age)

if son_age > age_difference:
	print(" The father was twice as old as his son" , the_year , "years ago")

elif son_age < age_difference:
	print(" The father will be twice as old as his son in" , the_year , "years time" )

else:
	print(" The father is currently twice as old as his son")