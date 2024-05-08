class Producto:
    #constructor
    def __init__(self, nombre:str, precio:float, cantidad:int):
        self.nombre = nombre
        self.precio = precio
        self.cantidad = cantidad
    
    
    #devuelve la informacion del prodcuto
    def __str__(self) -> str:
        return f"nombre: {self.nombre}|precio: {self.precio}|cantidad: {self.cantidad}"
    
    
    #reduce la cantidad de producto menos 1
    def reducir_cantidad(self):
        self.cantidad = self.cantidad - 1
    
    
    #devuelve el nombre
    def get_nombre(self) -> str:
        return self.nombre.lower()
    
    
    #devuelve el precio
    def get_precio(self) -> float:
        return self.precio
    
    
    #devuelve la cantidad
    def get_cantidad(self) -> int:
        return self.cantidad
