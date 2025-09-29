principal = 1000.00  
rate = 0.05          
years = 30          

print(f"{'Year':<5}{'Amount on Deposit':>20}")
print("-" * 25)


for year in range(1, years + 1):
   
    principal = principal * (1 + rate)
    
    
    print(f"{year:<5}{principal:>20.2f}")