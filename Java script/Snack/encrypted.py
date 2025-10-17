encrypted_numbers = input("Enter encrypted number: ")

deflation = []
for number in encrypted_numbers:
	encrypt = ((int(digit) - 7) + 10) % 10
	encryption.append(deflate)

arrange = []
arrange.append(encryption[2])
arrange.append(encryption[3])
arrange.append(encryption[0])
arrange.append(encryption[1])

decrypted = ""
for elements in arrange:
	decrypted += str(elements)
print(decrypted)