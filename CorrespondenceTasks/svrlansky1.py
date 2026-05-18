# inicialiazce prázdného seznamu
numbers = []

# načtení 10 čísel
print ("Zadejte 10 čísel.")
for i in range(10):
    user_input = int(input(f"Zadejde číslo {i + 1}: "))
    numbers.append(user_input)

# jednotlive výpočty
total_sum = sum(numbers)
average = total_sum / len(numbers)
minimum = min(numbers)
maximum = max(numbers)

# sudé or liché
even_count = 0
odd_count = 0

for num in numbers:
    if num % 2 == 0: # % -> modulo
        even_count += 1
    else:
        odd_count += 1

# finall výpis do konzole
print("-" * 30)
print(f"Součet všech čísel: {total_sum}")
print(f"Aritmetický průměr: {average}")
print(f"Nejmenší číslo: {minimum}")
print(f"Největší číslo: {maximum}")
print(f"Počet sudých čísel: {even_count}")
print(f"Počet lichých čísel: {odd_count}")