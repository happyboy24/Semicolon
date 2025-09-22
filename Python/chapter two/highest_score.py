score_a  = int(input("Enter num1:"))
score_b= int(input("Enter num2:"))
score_c = int(input("Enter num3:"))

highest = score_a

if  score_b > highest:
	highest = score_b
print(f"The highest number is: {highest}")

if score_c > highest:
	highest = score_c
print(f"The highest number is: {highest}")