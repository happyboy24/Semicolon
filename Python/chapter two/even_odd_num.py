# Prompt the user to enter an integer
number = int(input("Enter an integer: "))

# Use the remainder operator (%) to check if the number is even or odd
# An even number divided by 2 has a remainder of 0
if number % 2 == 0:
    print("The number {number} is even.")
else:
    print("The number {number} is odd.")