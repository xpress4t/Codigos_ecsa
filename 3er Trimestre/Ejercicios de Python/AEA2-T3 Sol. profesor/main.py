from maquinaExpendedora import MaquinaExpendedora
from producto import Producto

p1 = Producto("p1",5.23,40)
p2 = Producto("p2",6.23,41)
p3 = Producto("p3",7.23,42)
p4 = Producto("p4",8.23,43)
p5 = Producto("p5",9.23,44)
p6 = Producto("p6",2.23,45)
p11 = Producto("p11",1.23,47)

mx = MaquinaExpendedora()

mx.añadirProducto(p1)
mx.añadirProducto(p2)
mx.añadirProducto(p3)
mx.añadirProducto(p4)
mx.añadirProducto(p11)
mx.comprarProducto("p1",40)
mx.info()