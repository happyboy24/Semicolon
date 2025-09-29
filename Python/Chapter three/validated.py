passes = 0
failures = 0

for student in range(10):
       while True:
       
            result = int(input(f"Enter result for student {student + 1} (1=pass, 2=fail): "))

            
            if result == 1:
                passes = passes + 1
                 
            elif result == 2:
                failures = failures + 1
                
            else:
                
                print("Invalid input. Please enter 1 for pass or 2 for fail.")

        
            print("Invalid input. Please enter a whole number (1 or 2).")

print("\n--- Summary ---")
print("Passed:", passes)
print("Failed:", failures)


if passes > 8:
    print("Bonus to instructor")