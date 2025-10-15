for even in range(1, 101):
    if even % 2 == 0:
        print("Even numbers from 1 to 100:", even, end=" ")


for odd in range(50, 101):
    if odd % 2 != 0:
    
    print("Odd numbers from 50 to 100:", odd)

for numbers in range(1, 101):
    print("Numbers from 1 to 100:", numbers, end=" ")


for count in range(0, 21):
    square = count * count
    print("Square of numbers from 1 to 200:", square, end=" ")


for number in range(1, 51):
    if number % 3 == 0:
        print("Multiples of 3 between 1 and 50:", number)


for number in range(0, 101):
    if number % 3 == 0 and number % 5 == 0:
        print(number, end=" ")


counter = 0
for count in range(1, 101):
    if count % 7 == 0:
        counter += 1
print(counter)


sum = 0
for number in range(1, 51):
    sum += number
print(sum)


product = 0
for number in range(1, 11):
    product *= number
print(product)




number = 0
multiplication = 0
for count in range(0, 13):
    multiplication = count * 4
    print(multiplication)

