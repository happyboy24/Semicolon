numbers = []
total = 0
product = 1
NUM_INTEGERS = 4
print(f"Please enter {NUM_INTEGERS} integers.")

for i in range(NUM_INTEGERS):
    while True:
       
            num_input = int(input(f"Enter integer {i + 1}: "))
            
                        numbers.append(num_input)
            
           
            total += num_input
            product *= num_input
            
               print("Invalid input. Please enter a whole number (integer).")

average = total / NUM_INTEGERS

smallest = min(numbers)

largest = max(numbers)

print("\n--- Results ---")
print(f"The numbers entered were: {numbers}")
print(f"Sum: {total}")
print(f"Average: {average:.2f}")  print(f"Smallest: {smallest}")
print(f"Largest: {largest}")