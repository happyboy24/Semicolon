import math 

    while True:
      
            n_input = input("Enter a non-negative integer (e.g., 5, 10, 30): ")
            n = int(n_input)
            
            if n < 0:
                print("Factorial is not defined for negative integers. Please enter a non-negative integer.")
                continue
            break 

    if n == 0:
        factorial = 1
    else:
       
        factorial = 1
        
      
        for i in range(1, n + 1):
            factorial = factorial * i

    
    print(f"\n{n}! = {factorial:,}")





print(" ")
calculate_and_display_factorial()
print("\n" + "="*50 + "\n")


print("--- Specified Test Cases ---")
test_values = [10, 20, 30, 100, 170, 1000]

for n in test_values:
    
    result = math.factorial(n)
    
    
    print(f"{n}! is a {len(str(result))} digit number.")
    
   
    if n <= 30:
        print(f"{n}! = {result:,}")
    else:
        print(f"{n}! starts with {str(result)[:10]}...")



