from Producto import Producto

class MaquinaExpendedora:
    #constructor
    def __init__(self):
        self.inventario = []
        #produtos iniciales
        l_nombres = ["papas","chocolate","agua","galletas","gaseosa"]
        l_precios = [1.2,0.5,1,1.5,0.8]
        for n,p in zip(l_nombres,l_precios):
            producto = Producto(n,p,10)
            self.inventario.append(producto)
    
    
    #fucnion para agrefar producto
    def agregar_producto(self):
        nombre = input('+Dame el nombre del producto a agregar: ')
        for item in self.inventario:
            if item.get_nombre().__eq__(nombre.lower()):
                print('-El producto ya existe')
                return
        precio = float(input('+Dame el precio de dicho producto:  '))
        cantidad = int(input('+Dime la cantidad de producto que quieres agregar: '))
        producto = Producto(nombre,precio,cantidad)
        self.inventario.append(producto)
    
    
    def imprimir_inventario(self):
        for item in self.inventario:
            print(item)
        print("")
    
    
    #reduce la cantidad del item asociado al nombre
    def reducir_cantidad(self,nombre:str):
        for item in self.inventario:
            if item.get_nombre().__eq__(nombre.lower()):
                item.reducir_cantidad()
                break
    
    
    #funcion que permite comprar producto 
    def comprar_producto(self):
        nombre = input('Dame el nombre del producto que quieres comprar: ')
        if self.__producto_disponible(nombre):
            item = self.__get_producto(nombre)
            dinero = float(input('Ingresa la cantidad de dinero: '))
            #calcular si hay que devolver cambio
            if dinero < item.get_precio():
                print('Cantidad insuficiente')
                return
            elif dinero > item.get_precio():
                cambio = dinero - item.get_precio()
                print(f'Su cambio es {cambio}')
            self.reducir_cantidad(nombre)
        else:
            print('Producto no disponible.')
    
    
    #si el producto existe o si la cantidad es mayor a 0
    def __producto_disponible(self,nombre:str) -> bool:
        for item in self.inventario:
            if item.get_nombre().__eq__(nombre.lower()) and item.get_cantidad() > 0:
                return True
        return False
    
    
    #devuelve el producto asociado al nombre
    def __get_producto(self,nombre:str) -> Producto:
        for item in self.inventario:
            if item.get_nombre().__eq__(nombre.lower()):
                return item
