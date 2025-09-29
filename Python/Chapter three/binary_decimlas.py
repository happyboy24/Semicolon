   

    decimal_value = 0
    power_of_2 = 1 
    
    temp_binary = binary_int
    
    print(f"Converting binary integer: {binary_int}")
    print("-" * 30)

    
    while temp_binary > 0:
        
        digit = temp_binary % 10
        
        if digit not in (0, 1):
            return f"Invalid binary digit '{digit}' found in the input. Please ensure the integer contains only 0s and 1s."
        
        
        contribution = digit * power_of_2
        decimal_value += contribution
        
        
        print(f"Digit: {digit}, Power of 2: {power_of_2} ({digit} * {power_of_2} = {contribution})")
        
        
        temp_binary //= 10
        
       
        power_of_2 *= 2
        
    print("-" * 30)
  

