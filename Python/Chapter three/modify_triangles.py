
SIZE = 5

print("All Four Patterns Displayed Side-by-Side:")

 
for i in range(1, SIZE + 1):
    
   
    for j in range(i):
        print('*', end='')
   
    for j in range(SIZE - i):
        print(' ', end='')
        
    
    print('   ', end='')
    
   
    for j in range(SIZE - i + 1):
        print('*', end='')
  
    for j in range(i - 1):
        print(' ', end='')

    
    print('   ', end='')

    
    for j in range(SIZE - i):
        print(' ', end='')
   
    for j in range(i):
        print('*', end='')

   

 print('   ', end='')
    
  
    for j in range(i - 1):
        print(' ', end='')
    
    for j in range(SIZE - i + 1):
        print('*', end='')

       print()