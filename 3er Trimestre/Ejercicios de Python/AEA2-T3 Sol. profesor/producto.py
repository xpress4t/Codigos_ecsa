class Producto:
    def __init__(self, nombre, precio, cantidad):
        self.nombre = nombre
        self.precio = precio
        self.cantidad = cantidad
        
    def __str__(self):
        return f"Nombre: {self.nombre}, precio: {self.precio}, cantidad: {self.cantidad}"
    
    def __eq__(self, value):
        return value.nombre.lower() == self.nombre.lower()