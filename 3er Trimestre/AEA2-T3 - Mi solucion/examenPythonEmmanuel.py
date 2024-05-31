'''
Desarrollo de Clases en Python

La clase Producto en Python está diseñada para representar productos en una máquina expendedora.
Cuenta con tres atributos principales: nombre, que es un string para el nombre del producto; 
precio, que es un float que indica el precio del producto; y cantidad, que es un integer que representa 
la cantidad disponible del producto. Los métodos de esta clase incluyen el para inicializar un producto,
modificar la función que devuelve una cadena que representa la información del producto (se pueden añadir todas las funciones que se deseen). 
Se considerará que dos Productos son iguales si su nombre es igual, indistintamente de si está escrito en mayúsculas como si está en minúsculas

Por otro lado, la clase MaquinaExpendedora maneja el conjunto de productos disponibles para la venta. 
Esta clase tiene un solo atributo: inventario de productos. Esta clase Incluye varios métodos: un constructor para inicializar
la máquina sin productos, una función para añadir un producto al inventario en una cantidad concreta, 
una función para reducir en 1 un producto en concreto y una función que imprime la lista de productos 
disponibles con su información detallada, por último, una función que permite a los usuarios comprar un 
producto realizando las comprobaciones necesarias y lógicas de una máquina de estas características.

En el main se deben hacer todas las comprobaciones necesarias, para probar todas las funciones realizadas.
Cada clase tiene que estar en un fichero diferente, así como el main.py
'''
from functools import reduce

lista_de_personas = [
    {'nombre': 'Ana', 'edad': 28, 'hobbies': ['leer']},
    {'nombre': 'Carlos', 'edad': 34, 'hobbies': ['pintar', 'escalar']},
    {'nombre': 'Diana', 'edad': 21, 'hobbies': ['nadar', 'correr', 'cocinar']},
    {'nombre': 'Elena', 'edad': 26, 'hobbies': ['viajar']},
    {'nombre': 'Fernando', 'edad': 31, 'hobbies': ['videojuegos', 'dibujo', 'guitarra', 'canto']},
    {'nombre': 'Gloria', 'edad': 23, 'hobbies': ['yoga', 'meditación']},
    {'nombre': 'Héctor', 'edad': 29, 'hobbies': ['fotografía']},
    {'nombre': 'Irene', 'edad': 35, 'hobbies': ['ciclismo', 'lectura', 'escribir']},
    {'nombre': 'Jorge', 'edad': 30, 'hobbies': ['teatro', 'cine', 'baile', 'escultura']},
    {'nombre': 'Laura', 'edad': 24, 'hobbies': ['ajedrez']}
]

'''
Los siguientes ejercicios solo se pueden realizar con map, filter y reduce. Se puede usar otras funciones pero no ningún tipo de bucle

- Dame la persona de más edad
- Dame la persona con mayor número de hobbies
- De cada una de las personas dame el hobbie con nombre más largo
- Dame todos los nombres las personas y sus edades con la siguiente estructura:
    - nombre1 , edad1 <-> nombre2 , edad3 <-> nombre3 , edad3 <-> ...
'''

# Para utilizar el reduce la sintaxis es --> 
# reduce("la funcion en donde está la logica","la lista que usaré")

# Dame la persona de más edad
def mayor_edad(x,y):
    if x['edad'] > y['edad']:
        return x
    else:
        return y
resultado = reduce(mayor_edad,lista_de_personas)
print(resultado)


# Dame la persona con mayor número de hobbies
def mayor_numero_hobbies(a,b):
    if len(a['hobbies']) > len(b['hobbies']):
        return a
    else:
        return b
    
resultado_2 = reduce(mayor_numero_hobbies,lista_de_personas)
print(resultado_2)

# De cada una de las personas dame el hobbie con nombre más largo

def paraUsarEnReduce(m,n):
    if len(m) >= len(n):
        return m
    else:
        return n

def hobbieMasLargo(x):
    a = x['hobbies']
    hobbies = reduce(paraUsarEnReduce,a)
    nombre = x['nombre']
    
    return f'{nombre} : {hobbies}'

resultado_3 = map(hobbieMasLargo,lista_de_personas)
print(list(resultado_3))


# Dame todos los nombres las personas y sus edades con la siguiente estructura: - nombre1 , edad1 <-> nombre2 , edad2 <-> nombre3 , edad3 <-> ...

def datos(x):
    nombre = x['nombre']
    edad = x['edad']
    return f'{nombre} : {edad}'

def conFlecha(x,y):
    return f'{x} <-> {y}'

resultado_4 = map(datos,lista_de_personas)
print("Nombres y Edades :)")
print(reduce(conFlecha,resultado_4))