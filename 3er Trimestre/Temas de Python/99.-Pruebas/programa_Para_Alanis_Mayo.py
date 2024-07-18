from turtle import *
import colorsys

nombre="              Alanis"
color("white") 
penup()
goto(-180,250)  
pendown()
write(nombre,align="left",font=("Comic Sans MS",26,"normal"))

speed(40)
bgcolor("black")
h = 0

penup()
goto(0,-100)
pendown()
color("green")
begin_fill()
rt(90)
fd(400)
lt(90)
fd(20)
# el lt(90) lo puedo cmbiar a lt(85) y se verá el tallo inclinado una parte
lt(90)
fd(400)
lt(90)
fd(20)
end_fill()

penup()
goto(0,0)
pendown()
for i in range(16):
    # for j in range (18): se puede cambiar con 25 tambien
    for j in range(16):
        color("pink")
        h += 0.005
        rt(90)
        circle(150 - j*6,90)
        lt(90)
        circle(150 - j*6,90)
        rt(180)
    circle(40,24)

penup()
goto(-20,0)
pendown()

begin_fill()
circle(44)  
end_fill()
done()