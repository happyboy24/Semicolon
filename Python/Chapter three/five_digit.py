# Function to get a valid five-digit integer from the user
def get_five_digit_integer():
    while True:
        try:
            number_input = input("Enter a five-digit integer: ")
            number = int(number_input)
            
            # Check if the number is exactly five digits (between 10000 and 99999)
            if 10000 <= number <= 99999:
                return number
            else:
                print("Error: The number must be exactly five digits.")
        except ValueError:
            print("Error: Invalid input. Please enter a whole number.")

# Get the five-digit number
number = get_five_digit_integer()
original_number = number # Keep a copy for the final output

# --- Logic to separate and compare digits ---

# 1. Extract the First Digit (Ten-Thousands Place)
# Divide by 10000 (integer division)
digit1 = number // 10000

# 2. Extract the Fifth Digit (Ones Place)
# Modulo 10
digit5 = number % 10

# 3. Extract the Second Digit (Thousands Place)
# First, remove the 1st digit: number % 10000 
# Then, divide by 1000
remaining_4_digits = number % 10000 
digit2 = remaining_4_digits // 1000

# 4. Extract the Fourth Digit (Tens Place)
# First, remove the 5th digit: number // 10 
# Then, take modulo 10
remaining_digits = number // 10
digit4 = remaining_digits % 10

# 5. Determine if it's a palindrome
# A 5-digit number is a palindrome if (Digit 1 == Digit 5) AND (Digit 2 == Digit 4)

if digit1 == digit5 and digit2 == digit4:
    print(f"\nThe number {original_number} IS a palindrome.")
else:
    print(f"\nThe number {original_number} is NOT a palindrome.")

# Optional: Print the separated digits for verification (uncomment to see)
# print(f"Digits: {digit1}, {digit2}, {number % 1000 // 100}, {digit4}, {digit5}")