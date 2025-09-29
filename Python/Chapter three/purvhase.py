   

        purchase_price_cents = int(round(purchase_price_dollars * 100))
    
        print("Error: Invalid input for purchase price.")
        

   
    if not 0 < purchase_price_cents <= 100:
        print("Error: Purchase price must be between $0.01 and $1.00.")
        
    
    
    payment_cents = 100
    
   
    change_due_cents = payment_cents - purchase_price_cents

    
    change_coins = {
        "quarters": 0,
        "dimes": 0,
        "nickels": 0,
        "pennies": 0
    }

    
    change_coins["quarters"] = change_due_cents // 25
    change_due_cents %= 25 # Get the remainder

    
    change_coins["dimes"] = change_due_cents // 10
    change_due_cents %= 10    
    change_coins["nickels"] = change_due_cents // 5
    change_due_cents %= 5

   
    change_coins["pennies"] = change_due_cents 
    
    print(f"\nYour purchase price was: ${purchase_price_dollars:.2f}")
    print(f"Your total change due is: {payment_cents - purchase_price_cents} cents\n")
    print("Your change is:")
    
   
    for coin, count in change_coins.items():
        if count > 0:
            
            coin_name = coin if count > 1 else coin[:-1] 
            print(f"{count} {coin_name}")


while True:
   
        
        price_input = input("Enter the purchase price (e.g., 0.27 or .49): $")
        
       
        price_float = float(price_input)
        
        
        if 0 < price_float <= 1.00:
            calculate_change(price_float)
            break 
        else:
            print("Price must be between $0.01 and $1.00. Please try again.")
    
  
        print("Invalid input. Please enter a numerical value (e.g., 0.73).")
  
        print(f"An unexpected error occurred: {e}")