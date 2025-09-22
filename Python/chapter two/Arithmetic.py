num1 = int(input("Enter the first integer: "))
num2 = int(input("Enter the second integer: "))
num3 = int(input("Enter the third integer: "))

total_sum = num1 + num2 + num3
product = num1 * num2 * num3
average = total_sum / 3

smallest = min(num1, num2, num3)
largest = max(num1, num2, num3)


print(f"\nThe sum is: {total_sum}")
print(f"The average is: {average}")
print(f"The product is: {product}")
print(f"The smallest number is: {smallest}")
print(f"The largest number is: {largest}")