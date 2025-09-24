# prompt the user to enter three scores
# store the three scores with different variable names
# initialize a variable "average " and assign it value to zero
# calculate the average  of the scores by adding them and dividing three
# check if the average value against the conditions:
​	#If the average  is between 90 and 100, display the letter "A".
	​#if not, if the average score is between 80 and 89, display the letter "B".
	​#if not, if the average score is between 70 and 79, display the letter "C".
	​#if not, if the average score is between 60 and 69, display the letter "D".
	​#if not, display the letter "F".



score1 = int(input("Enter the first score:"))
score2 = int(input("Enter the second score:"))
score3 = int(input("Enter the third score:"))

average_score = (score1 + score2 + score3) / 3
print(average_score)

if 90 <= average_score <= 100:
	print("A")
elif 80 <= average_score < 90:
	print("B")
elif 70 <= average_score < 80:
	print("C")
elif 60 <= average_score < 70:
	print("D")
else:
	print("F")
