from functools import reduce
'''
Ejercicio 1
Crea un programa que procese una lista de tuplas, donde cada tupla representa una venta y contiene el nombre del producto,
la cantidad vendida y el precio unitario (ejemplo: [("manzana", 30, 0.50), ("banana", 20, 0.75)])
Filtra aquellos datos que tengan pocas unidades(menos de 10).
Quiero saber el total de ingresos de las ventas de estos productos
'''
# Lista de ventas donde cada tupla contiene el nombre del producto, cantidad vendida y precio unitario
ventas = [("manzana", 30, 0.50), ("banana", 20, 0.75), ("naranja", 5, 1.00), ("pera", 8, 0.60), ("melon", 25, 3.00)]

# Filtrar las ventas para incluir solo aquellas con menos de 10 unidades vendidas
ventas_filtradas = filter(lambda venta: venta[1] < 10, ventas)

# Usar map para calcular el ingreso total de cada venta filtrada
ingresos = map(lambda venta: venta[1] * venta[2], ventas_filtradas)

# Usar reduce para sumar todos los ingresos y obtener el total
ingreso_total = reduce(lambda x, y: x + y, ingresos, 0)

print(f"El total de ingresos de las ventas con menos de 10 unidades es: ${ingreso_total:.2f}")


'''
Ejercicio 2
Dado un diccionario que contiene el nombre del estudiante y su lista de calificaciones 
(por ejemplo, {"Ana": [4.5, 7.0, 8.0], "Juan": [5.0, 7.5, 6.0]}). Se requiere calcular el promedio de calificaciones de cada estudiante
seleccionando solo aquellos estudiantes con un promedio superior a 6.0.
Además, se quiere determinar el número total de estudiantes que superan este promedio.
'''
# Diccionario con el nombre del estudiante y su lista de calificaciones
calificaciones = {
    "Ana": [4.5, 7.0, 8.0],
    "Juan": [5.0, 7.5, 6.0],
    "Maria": [7.0, 8.5, 9.0],
    "Luis": [5.5, 6.0, 5.0]
}
# Calcular el promedio de calificaciones para cada estudiante utilizando map
promedios = dict(map(lambda item: (item[0], sum(item[1]) / len(item[1])), calificaciones.items()))

# Usar filter para seleccionar solo aquellos estudiantes con un promedio superior a 6.0
estudiantes_sobresalientes = dict(filter(lambda item: item[1] > 6.0, promedios.items()))

# Usar reduce para contar el número total de estudiantes que superan el promedio de 6.0
numero_estudiantes_sobresalientes = reduce(lambda acc, _: acc + 1, estudiantes_sobresalientes.items(), 0)

print("Estudiantes con promedio superior a 6.0:", estudiantes_sobresalientes)
print("Número total de estudiantes que superan el promedio de 6.0:", numero_estudiantes_sobresalientes)

'''
Ejercicio 3
Considera que tienes una lista de diccionarios, cada uno representando a una persona con claves 
como nombre, edad y ciudad. Se quiere poder filtrar las personas para seleccionar solo las personas que pertenecen a una ciudad específica.
Los datos devueltos tienen que ser la edad promedio de las personas de la ciudad seleccionada.
'''

# Lista de personas, cada una representada por un diccionario con nombre, edad y ciudad
personas = [
    {"nombre": "Ana", "edad": 25, "ciudad": "Madrid"},
    {"nombre": "Carlos", "edad": 32, "ciudad": "Barcelona"},
    {"nombre": "Marta", "edad": 45, "ciudad": "Madrid"},
    {"nombre": "Pablo", "edad": 22, "ciudad": "Valencia"},
    {"nombre": "Lorena", "edad": 29, "ciudad": "Madrid"},
    {"nombre": "Jordi", "edad": 35, "ciudad": "Barcelona"}
]

# Nombre de la ciudad a filtrar
ciudad_filtrada = "Madrid"

# Filtrar personas que pertenecen a la ciudad especificada
personas_de_ciudad = list(filter(lambda p: p["ciudad"] == ciudad_filtrada, personas))

# Usar map para extraer las edades de las personas filtradas
edades = list(map(lambda p: p["edad"], personas_de_ciudad))

# Usar reduce para calcular la suma de las edades
suma_edades = reduce(lambda x, y: x + y, edades, 0)

# Calcular el promedio de las edades
if len(edades) > 0:
    promedio_edad = suma_edades / len(edades)
else:
    promedio_edad = 0

print(f"La edad promedio de las personas en {ciudad_filtrada} es: {promedio_edad:.2f}")

'''
Ejercicio 4
Crea un programa que analice una lista de comentarios de usuarios en una red social. 
Cada comentario es un texto que puede contener emociones positivas o negativas. 
El programa debe filtrar los comentarios que contengan al menos una palabra clave negativa, 
analizar el sentimiento general de los comentarios filtrados y calcular el porcentaje de comentarios negativos respecto al total de comentarios analizados.
Crea una lista de palabras con comentarios positivos y comentarios negativos que te ayuden en el filtrado
'''

# Lista de comentarios de usuarios en una red social
comentarios = [
    "Me encanta el nuevo diseño de la plataforma!",
    "Es terrible cómo se manejan los bugs aquí.",
    "¡Excelente trabajo con las actualizaciones!",
    "Odio la lentitud del sistema ahora.",
    "No estoy contento con el servicio de atención al cliente.",
    "¡Bravo por los esfuerzos!",
    "El peor cambio que han hecho hasta ahora."
]

# Listas de palabras clave para identificar emociones
palabras_positivas = ['encanta', 'excelente', 'bravo', 'bueno', 'genial']
palabras_negativas = ['terrible', 'odio', 'lentitud', 'no estoy contento', 'peor']

# Función para determinar si un comentario es negativo
def es_negativo(comentario):
    return any(palabra in comentario.lower() for palabra in palabras_negativas)

# Filtrar los comentarios negativos
comentarios_negativos = list(filter(es_negativo, comentarios))

# Calcular el porcentaje de comentarios negativos respecto al total de comentarios analizados
total_comentarios = len(comentarios)
numero_comentarios_negativos = len(comentarios_negativos)

# Evitar división por cero
if total_comentarios > 0:
    porcentaje_negativos = (numero_comentarios_negativos / total_comentarios) * 100
else:
    porcentaje_negativos = 0

print(f"Comentarios negativos: {comentarios_negativos}")
print(f"Porcentaje de comentarios negativos: {porcentaje_negativos:.2f}%")




'''
Ejercicio 5
Desarrolla un programa que maneje una lista de reservas de un hotel. 
Cada reserva está representada por un diccionario que incluye información como el nombre del cliente, número de noches reservadas y tipo de habitación.
El objetivo es identificar aquellas reservas que exceden una estancia de 5 noches, procesar la información para calcular el total 
de noches reservadas por esos clientes y determinar el tipo de habitación más demandado entre esas reservas largas.
'''
# Lista de reservas en un hotel
reservas = [
    {"nombre": "Carlos", "noches": 4, "tipo_habitacion": "estándar"},
    {"nombre": "María", "noches": 7, "tipo_habitacion": "suite"},
    {"nombre": "Juan", "noches": 5, "tipo_habitacion": "estándar"},
    {"nombre": "Elena", "noches": 9, "tipo_habitacion": "suite"},
    {"nombre": "Pedro", "noches": 6, "tipo_habitacion": "doble"},
    {"nombre": "Lucía", "noches": 3, "tipo_habitacion": "estándar"}
]

# Filtrar reservas que exceden 5 noches
reservas_largas = list(filter(lambda reserva: reserva["noches"] > 5, reservas))

# Usar map para extraer el número de noches de las reservas filtradas
noches_reservadas = list(map(lambda reserva: reserva["noches"], reservas_largas))

# Sumar el total de noches reservadas
total_noches = reduce(lambda x, y: x + y, noches_reservadas, 0)

# Contar el tipo de habitación más demandado entre las reservas largas manualmente
tipo_habitacion_count = {}
for reserva in reservas_largas:
    tipo = reserva["tipo_habitacion"]
    if tipo in tipo_habitacion_count:
        tipo_habitacion_count[tipo] += 1
    else:
        tipo_habitacion_count[tipo] = 1

# Determinar el tipo de habitación más demandado
tipo_mas_demandado = max(tipo_habitacion_count, key=tipo_habitacion_count.get)

print(f"Total de noches reservadas en estancias largas: {total_noches}")
print(f"Tipo de habitación más demandado en estancias largas: {tipo_mas_demandado}")

