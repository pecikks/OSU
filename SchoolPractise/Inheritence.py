class Person:
    def __init__(self, id, name, surname):
        self.id = id
        self.name = name
        self.surname = surname
    def __str__(self):
        return f"{self.id} {self.name} {self.surname}"

person = Person(11, "Doe", "Smith")
print(person)

class Student(Person):
    def __init__(self, id, name, surname, average):
        super().__init__(id, name, surname)
        self.average = average
    def __str__(self):
        return f"{self.id} {self.name} {self.surname}"

student = Student(1, "John", "Black", 1.4)
print(student)