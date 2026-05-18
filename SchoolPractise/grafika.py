import tkinter
from random import randint

widthCanvas = 800
canvas = tkinter.Canvas(bg='white', width=widthCanvas, height=600)
canvas.pack()

##canvas.create_rectangle(10, 10, 50, 50, fill='red')
##canvas.create_arc(60, 60, 100, 100, fill='blue')

def nahodny_ctverec():
    velkost = randint(20, 100)
    x = randint(0, widthCanvas - velkost)
    y = randint(0, 500 - velkost)
    farba = f'#{randint(0, 255):02x}{randint(0, 255):02x}{randint(0, 255):02x}'
    canvas.create_rectangle(x, y, x + velkost, y + velkost, fill=farba)

for i in range(1,10):
    nahodny_ctverec()

canvas.mainloop()
