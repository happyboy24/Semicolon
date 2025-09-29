import math

    e_estimate = 0.0
    
       for n in range(num_terms):
        term = 1.0 / math.factorial(n)
        e_estimate += term
        
    return e_estimate


num_terms = 10
e_approximation = estimate_e(num_terms)


print(f"Number of terms summed (n=0 to n={num_terms - 1}): {num_terms}")
print(f"Estimated value of e: {e_approximation}")
print(f"Actual value of e (from math module): {math.e}") 