import tkinter
from random import randint

widthCanvas = 800
canvas = tkinter.Canvas(bg='white', width=widthCanvas, height=600)
canvas.pack()

class PrikazovaZnacka:
    def __init__(self, x, y, text):
        self.x = x
        self.y = y
        self.text = text
        self.velikost = 120

    def vykresli(self):
        canvas.create_oval(
            self.x,
            self.y,
            self.x + self.velikost,
            self.y + self.velikost,
            fill='white',
            outline='red',
            width=8
        )
        canvas.create_text(
            self.x + self.velikost / 2,
            self.y + self.velikost / 2,
            text=self.text,
            font='Arial 34 bold'
        )


znacka50 = PrikazovaZnacka(150, 220, '50')
znacka90 = PrikazovaZnacka(340, 220, '90')
znacka120 = PrikazovaZnacka(530, 220, '120')

znacka50.vykresli()
znacka90.vykresli()
znacka120.vykresli()

canvas.mainloop()

