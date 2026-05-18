slovnik = dict({1:"auto", 2:"kamion", 3:"autobus", 4:"letadlo"})
print(slovnik)

print(slovnik.keys())
print(slovnik.values())

for element in slovnik.items():
    print(element[0], element[1])

slovnik.update({4:"lod"})
print(slovnik)