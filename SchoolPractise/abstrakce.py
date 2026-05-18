from abc import ABC, abstractmethod

class Animal(ABC):
    def __init__(self, id):
        self.__id = id

    def get_id(self):
        return self.__id
    @abstractmethod
    def feed(self):
        pass

class Elephant(Animal):
    def __init__(self, id):
        super().__init__(id)

    def feed(self):
        return f"Nakrm slona číslo {self.get_id()} senem a ovocem"

elephant = Elephant(1)
print(elephant.feed())

class Pinguin(Animal):
    def __init__(self, id):
        super().__init__(id)

    def feed(self):
        return f"Nakrm tučňáka číslo {self.get_id()} lososem"

pinguin = Pinguin(9)
print(pinguin.feed())

seznamAnimals = []
seznamAnimals.append(Elephant(2))
seznamAnimals.append(Elephant(9))
seznamAnimals.append(Elephant(5))
seznamAnimals.append(Pinguin(2))
seznamAnimals.append(Pinguin(1))

for animal in seznamAnimals:
    print(animal.feed())
