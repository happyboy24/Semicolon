SIZE = 5

print("Pattern 1:")
for i in range(1, SIZE + 1):
    
    for j in range(i):
        print('*', end='')
   
    print()

print()

print("Pattern 2:")
for i in range(SIZE, 0, -1):
    
    for j in range(i):
        print('*', end='')
    
    print()

print() 


print("Pattern 3:")
for i in range(1, SIZE + 1):
   
    for j in range(SIZE - i):
        print(' ', end='')
    
    for k in range(i):
        print('*', end='')
    
    print()

print() 


print("Pattern 4:")
for i in range(SIZE, 0, -1):
    
    for j in range(SIZE - i):
        print(' ', end='')
  
    for k in range(i):
        print('*', end='')
  
    print()