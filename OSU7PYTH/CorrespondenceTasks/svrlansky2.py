def triangle(a, b, c):

# Kontrola trojúhelníkové nerovnosti
    if a + b > c and a + c > b and b + c > a:
        return True
    else:
        return False

# Testing funkcionality
test = [
    (3, 4, 5),      # Funkční pravoúhlý trojúhelník
    (10, 10, 10),   # Funkční rovnostraný trojúhelník
    (1, 2, 3),      # Nefunkční (1+2 neni > 3)
    (5, 1, 1),      # Nefunkční (1+1 není > 5)
    (7, 10, 5)      # Funkční obecný trojúhelník
]

print("Výsledky testování:")
for s1, s2, s3 in test:
    result = triangle(s1, s2, s3)
    print(f"Strany {s1}, {s2}, {s3} -> Může být trojúhelník? {result}")