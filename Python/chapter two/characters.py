characters = "BCD bcd 012 $*+"

print("Character\tInteger Equivalent")
print("--------------------------------")

for char in characters:
    print(f"'{char}'\t\t{ord(char)}")

print(f"' '\t\t{ord(' ')}")