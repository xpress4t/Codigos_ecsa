'''
Las clases necesitan atributos para poder funcionar
aunque no siempre es necesario
Lo que si se debe poner es el constructor 
Los atributos en python se ponen dentro del constructor
constructor __init__():

Almacen
    |
    |__ > p.AñadirElemento ==> cualquier dato menos diccionario
    |__ > p.getAlmacen ==> { tipoDato [           ]

Almacen.AE("hola....")

'''


class Almacen:

    # La clave es el tipo de dato de item
    def __init__(self):
        self.dictElemento = dict()

    def auxAñadir(self, item):
        if isinstance(item, dict):
            return
        nombreClase = item.__class__.__name__
        if nombreClase in self.dictElemento.keys():
            # El .keys() nos devuelve una lista de todas las claves que esten almacenadas en el diccionario
            aux = self.dictElemento[nombreClase]
            aux.append(item)
            self.dictElemento[nombreClase] = aux
        else:
            aux = [item]
            self.dictElemento[nombreClase] = aux

    def añadirElemento(self, item):
        self.auxAñadir(item)

    def añadirTodosLosElementos(self, *items):
        for item in items:
            self.auxAñadir(item)

    def getAlmacen(self):
        return self.dictElemento


almacen = Almacen()
almacen.añadirTodosLosElementos("Hola",1,3,"Adios",[1,2,3])
'''
almacen.añadirElemento("Hola")
almacen.añadirElemento(2)
almacen.añadirElemento("Hola1")
almacen.añadirElemento("Hola2")
almacen.añadirElemento(1)
'''
print(almacen.getAlmacen())

print(type("asasas"))
print("asdwqr".__class__.__name__)