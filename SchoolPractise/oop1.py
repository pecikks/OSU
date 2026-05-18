class Address:
    def __init__(self):
        self.street = ""
        self.number = ""
        self.city = ""
        self.country = ""
        self.postal_code = ""

    def __str__(self):
        return f"{self.street}, {self.number}, {self.city}, {self.country}, {self.postal_code}"

my_address = Address()

my_address.street = "30.dubna"
my_address.number = "22"
my_address.city = "Ostrava"
my_address.postal_code = "700 01"
my_address.country = "CZ"

class Person:
    def __init__(self, id):
        self.id = id
        self.name = ""
        self.age = 0
        self.address = Address()

    def __str__(self):
        return f"{self.id}, {self.name}, {self.age}, {self.age}"

my_person = Person(1)
my_person.name = "Adolf"
my_person.age = "22"
my_person.address.street = "30.dubna"
my_person.address.number = "22"
my_person.address.city = "Ostrava"
my_person.address.postal_code = "700 01"
my_person.address.country = "CZ"