class Player:
    def __init__(self, id, name):
        self.id = id
        self.name = name
        self.score = 0

    def __str__(self):
        return f'Player {self.id} {self.name} {self.score}'

class Dice:
    def __init__(self, sides):
        self.sides = sides

    def rollTheDice(self):
        import random as _random
        return _random.randint(1, self.sides)

player1 = Player(1, "Abdul")
player2 = Player(2, "Aziz")

dice1 = Dice(6)
dice2 = Dice(6)

print(player1.__str__())
print(player2.__str__())

player1.score = dice1.rollTheDice() + dice2.rollTheDice()
player2.score = dice1.rollTheDice() + dice2.rollTheDice()

print(player1)
print(player2)

