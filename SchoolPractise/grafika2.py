import tkinter
from random import randint

widthCanvas = 800
canvas = tkinter.Canvas(bg='white', width=widthCanvas, height=600)
canvas.pack()

def let_opile_mouchy():
    x = 0
    y = 0

    for i in range(50):
        nove_x = x + randint(-30, 30)
        nove_y = y + randint(-30, 30)

        canvas.create_line(x, y, nove_x, nove_y)

        x = nove_x
        y = nove_y


let_opile_mouchy()

canvas.mainloop()
