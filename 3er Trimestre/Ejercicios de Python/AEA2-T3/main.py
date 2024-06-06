from Producto import Producto
from MaquinaExpendedora import MaquinaExpendedora
maquina = MaquinaExpendedora()
while True:
    #Interfaz menu
    print('''Bienvenido a la maquina expendedora
        1. Comprar Producto
        2. Agregar Producto
        3. Salir
        ''')
    maquina.imprimir_inventario()
    #bucle para asegurarse que opcion sea valida
    while True:
        try:
            opcion = int(input('Elija una opción: '))
            if opcion != 1 and opcion != 2 and opcion != 3:
                raise Exception
            break
        except:
            print('Porfavor elija una de las opciones')
    #dependiendo de cada opcion se hace una funcion
    if opcion == 1:
        maquina.comprar_producto()
    elif opcion == 2:
        maquina.agregar_producto()
    elif opcion == 3: 
        print("TERMINANDO PROGRAMA...")
        break
    print("")