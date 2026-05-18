import random

# Naplni seznam randomem (interval 1-100)
listNumbers = [random.randint(1, 100) for i in range(10)]

print(f"Původní seznam:   {listNumbers}")

listNumbers.sort()

print(f"Setříděný seznam: {listNumbers}")