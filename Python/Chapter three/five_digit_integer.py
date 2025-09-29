number = 42339

divisor = 10000 

print(f"The digits of {number} are:")

while divisor >= 1:
    
    digit = number // divisor
    
    
    print(digit)
    
    
    number = number % divisor
    
    divisor = divisor // 10