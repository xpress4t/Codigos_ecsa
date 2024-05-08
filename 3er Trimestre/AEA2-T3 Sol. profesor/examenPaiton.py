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

def edadMayor(x,y):
    pass
print(reduce(edadMayor,lista_de_personas))

def mayorHobbies(x,y):
    if len(x["hobbies"])>len(y["hobbies"]):
        return x
    return y
print(reduce(mayorHobbies,lista_de_personas))

def hobbieLargo(x):
    pass
print(list(map(hobbieLargo,lista_de_personas)))

print(list(map(lambda x: x["nombre"]+", "+str(x["edad"]),lista_de_personas)))

print(' <-> '.join(list(map(lambda x: x["nombre"]))))