'''
Desarrollo de Clases en Python

La clase Producto en Python está diseñada para representar productos en una máquina expendedora.
Cuenta con tres atributos principales: nombre(string), precio(float); y cantidad (int). 
Los métodos de esta clase incluyen el para inicializar un producto,
modificar la función que devuelve una cadena que representa la información del producto (se pueden añadir todas las funciones que se deseen). 
Se considerará que dos Productos son iguales si su nombre es igual, indistintamente de si está escrito en mayúsculas como si está en minúsculas

Por otro lado, la clase MaquinaExpendedora maneja el conjunto de productos disponibles para la venta. 
Esta clase tiene un solo atributo: inventario de productos. Esta clase Incluye varios métodos: 
un constructor para inicializar
la máquina sin productos, una función para añadir un producto al inventario en una cantidad concreta, 
una función para reducir en 1 un producto en concreto y una función que imprime la lista de productos 
disponibles con su información detallada, por último, una función que permite a los usuarios comprar un 
producto realizando las comprobaciones necesarias y lógicas de una máquina de estas características.

En el main se deben hacer todas las comprobaciones necesarias, para probar todas las funciones realizadas.


Cada clase tiene que estar en un fichero diferente, así como el main.py

'''

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

from functools import reduce
'''
Los siguientes ejercicios solo se pueden realizar con map, filter y reduce. 
Se puede usar otras funciones pero no ningún tipo de bucle
1. Dame la persona de más edad
'''
#saca el de mayor edad
def mayor_edad(x,y):
    if x['edad'] > y['edad']:
        return x 
    else:
        return y  

print('PERSONA MAYOR EDAD:')
print(reduce(mayor_edad,lista_de_personas))

'''2. Dame la persona con mayor número de hobbies'''
#saca el de mayor hobbie
def mas_hobbies(x,y):
    if len(x['hobbies']) > len(y['hobbies']):
        return x
    else:
        return y  

print('=====================================')
print('PERSONA MAYOR NUM DE HOBBIES:')
print(reduce(mas_hobbies,lista_de_personas))

'''- De cada una de las personas dame el hobbie con nombre más largo'''
#devuelve el mayor
def filtro(x,y):
    if len(x) >= len(y):
        return x
    else:
        return y  

#devuelve el nomnbre con el hobbie
def hobbie_mas_largo(x):
    li = x['hobbies']
    hobbie = reduce(filtro,li)
    nombre = x['nombre']
    return f'{nombre}:{hobbie}'

print('=====================================')
print('HOBBIE MAS LARGO DE CADA PERSONA:')
print(list(map(hobbie_mas_largo,lista_de_personas)))
'''
- Dame todos los nombres las personas y sus edades con la siguiente estructura:
    - nombre1 , edad1 <-> nombre2 , edad3 <-> nombre3 , edad3 <-> ...'''
#devuelve el nombre y la edad a una lista
def nombre_edad(x):
    nombre = x['nombre']
    edad = x['edad']
    return f'{nombre},{edad}'

#dicha lista luego es convertida a un str con el respectivo formato
def a_formato(x,y):
    return f'{x} <-> {y}'

print('=====================================')
print('IMPRIMIR CON ESTRUCTURA')
print(reduce(a_formato,list(map(nombre_edad,lista_de_personas))))