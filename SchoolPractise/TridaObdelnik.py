class Rectangle:
    def __init__(self, base, height):
        self.base = base
        self.height = height

    def dejObvod(self):
        return 2 * (self.base + self.height)

    def dejObsah(self):
        return (self.base * self.height)

obdelnik1 = Rectangle(2, 3)
print(obdelnik1.dejObvod())
print(obdelnik1.dejObsah())