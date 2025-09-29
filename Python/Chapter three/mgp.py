
total_miles = 0.0
total_gallons = 0.0



print("Enter the miles driven for a tankful, or enter -1 to quit: ")
miles_input = input()


    miles_driven = float(miles_input)

    miles_driven = -1.0 


while miles_driven != -1.0:
    
    
    print("Enter the gallons used for this tankful: ")
    gallons_input = input()
    
    
        gallons_used = float(gallons_input)
        

        if gallons_used > 0:
            
            mpg = miles_driven / gallons_used
            
            
            print(f"MPG for this tankful: {mpg:.2f}")
            
            
            total_miles += miles_driven
            total_gallons += gallons_used
        else:
            print("Gallons used must be a positive number. This entry will be ignored.")

    
        print("Invalid input for gallons. This entry will be ignored.")
    
    
    print("\nEnter the miles driven for the next tankful, or enter -1 to quit: ")
    miles_input = input()

    
        miles_driven = float(miles_input)
    
        
        miles_driven = -1.0 


print("\n--- Summary ---")


if total_gallons > 0:
    
    combined_mpg = total_miles / total_gallons
    
    print(f"Total Miles Driven: {total_miles:.2f}")
    print(f"Total Gallons Used: {total_gallons:.2f}")
    print(f"Combined Miles Per Gallon (Overall MPG): {combined_mpg:.2f}")
else:
    print("No valid data was entered.")