number = int(input("Enter a five-digit integer: "))

d5 = number % 10
number = number // 10


d4 = number % 10
number = number // 10

d3 = number % 10
number = number // 10

d2 = number % 10
number = number // 10

d1 = number % 10

print(f"{d1}   {d2}   {d3}   {d4}   {d5}")