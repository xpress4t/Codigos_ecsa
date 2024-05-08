from producto import Producto

class MaquinaExpendedora():
    def __init__(self):
        self.inventario = dict()
        
    def añadirProducto(self, producto):
        if producto.nombre in self.inventario:
            self.inventario[producto.nombre].cantidad += producto.cantidad
        else:
            self.inventario[producto.nombre] = producto
            
    def restarEnUno(self, nombreProducto):
        if nombreProducto in self.inventario:
            self.inventario[nombreProducto].cantidad -= 1
        else:
            print("Ese producto no existe")
            
    def comprarProducto(self, nombreProducto, cantidad):
        if nombreProducto in self.inventario:
            if self.inventario[nombreProducto].cantidad >= cantidad:
                for x in range(cantidad):
                    self.restarEnUno(nombreProducto)
            else:
                print("no hay cantidad suficiente de ese producto")
        else:
            print("el bucle no existe")
            
    def info(self):
        for x in self.inventario.values():
            print(x)