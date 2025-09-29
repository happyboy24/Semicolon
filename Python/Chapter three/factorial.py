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





print("--- User Input Factorial Calculator ---")
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



print("\n--- Observation on Python's Limit ---")
print("Did you find any integer input for which Python could not produce an integer factorial value?")
print("\nAnswer:")
print("Python's standard integer type (`int`) automatically handles arbitrarily large integers, limited only by the system's memory.")
print("Unlike languages with fixed-size integers (e.g., a 64-bit integer), Python will not overflow and fail to produce an *integer* factorial for any of these values (10, 20, 30, 100, 1000, etc.).")
print("The calculated results for 100! and 1000! are huge but perfectly accurate integer values.")
print("You would need to calculate a factorial so large that it consumed all available RAM before Python would genuinely fail to produce the integer result.")