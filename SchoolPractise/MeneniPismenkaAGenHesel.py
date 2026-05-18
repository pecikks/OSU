from random import randint


def Capslock(item):
    if (ord(item) >= ord('a')) and (ord(item) <= ord('z')):
        item = chr(ord(item) - (ord('a') - ord('A')))
    return item

print(Capslock('a'))

def genPassword():
    lenPassword = randint(8, 20)
    password = ""
    for i in range(0, lenPassword-1):
        password = password + chr(randint(33, 127)) #0-32 -> bíle znaky (TAB. mezera)
    return password

print(genPassword())