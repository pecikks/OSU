seznam = [1, 26, 456, 56, 4869, 75, 3]
print(seznam)
print(len(seznam))
print(seznam[0])

for element in seznam:
    print(element)

seznam.append(999)
seznam.insert(4, 888)
seznam.remove(4869)
print(seznam.index(26))
seznam[0] = 4444
print(seznam)
print(len(seznam))

pocet_lichych = 0
for element in seznam:
    if element % 2 != 0:
        pocet_lichych += 1
print(pocet_lichych)

seznam.append("aHa")
seznam.append(5.5)
print(seznam)