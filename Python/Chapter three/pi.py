import math

targets = {
    3.14: 0,
    3.141: 0,
    3.1415: 0,
    3.14159: 0
}


current_pi = 0.0
term_count = 0
print("")
print("| Terms | Approximation of Pi |")
print("")

while True:
    term_count += 1
   
    denominator = 2 * (term_count - 1) + 1
    
        
    term = sign * (4.0 / denominator)
    current_pi += term
    
    print(f"| {term_count:5} | {current_pi:<19.15f} |")
    
    
    all_targets_met = True
    for target, terms_needed in targets.items():
        if terms_needed == 0:
                        
            
            precision = len(str(target).split('.')[1])
            rounded_pi = round(current_pi, precision)
            
            if rounded_pi == target:
                targets[target] = term_count
        
        if targets[target] == 0:
            all_targets_met = False
            
    if all_targets_met and term_count > 1:
        
        
  
    if term_count >= 14000:
        break

print("")

print("\nNumber of terms required to first achieve the target precision:")
for target, terms_needed in sorted(targets.items()):
    if terms_needed > 0:
        print(f"  {target}: {terms_needed} terms")
    else:
        print(f"  {target}: More than {term_count} terms (limit reached)")