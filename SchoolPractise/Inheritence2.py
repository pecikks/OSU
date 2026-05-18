class A:
    def __init__(self, id):
        self.id = id
    def __str__(self):
        return f"{self.id}"

class B:
    def __init__(self, name):
        self.name = name
    def __str__(self):
        return f"{self.name}"

class C(A, B):
    def __init__(self, id, name, value):
        A.__init__(self, id)
        B.__init__(self, name)
        self.value = value
    def __str__(self):
        return f"{A.__str__(self)} {B.__str__(self)} {self.value}"

objC = C(1, "Karel", 5.6)
objC2 = C(2, "Petr", 8.4)

print(objC)
print(objC2)
