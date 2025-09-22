score_a  = int(input("Enter num1:"))
score_b= int(input("Enter num2:"))
score_c = int(input("Enter num3:"))

second_highest = ("")

if  score_a > score_b:
	if score_b > score_c:
		second_highest = score_b
 
if score_b > score_c:
	if score_c > score_a:
		second_highest = score_c

if score_c > score_a:
	if score_a > score_b:
		second_highest = score_a

print("The second highest number is:" , second_highest)

