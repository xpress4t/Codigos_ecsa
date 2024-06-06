import turtle

a = turtle.Turtle()

a.fillcolor('red')
a.begin_fill()
a.left(140)
a.forward(113)

for i in range(200):
    a.right(1)
    a.forward(1)
a.left(120)

for i in range(200):
    a.right(1)
    a.forward(1)
a.forward(112)

a.end_fill()
a.ht()
a.penup()
a.goto(-40,50)
a.pendown()

a.color('white')
a.write("\n\tTe quiero\n\t mucho\n\t Alanis",align = "center",font = ("comic sans ms",16,"bold"))
turtle.done()