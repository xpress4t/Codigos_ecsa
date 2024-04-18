import random
import string
"""
Enunciado:
Crea un programa en Python que tome una lista de palabras y mezcle aleatoriamente 
los caracteres de cada palabra,
excepto el primero y el último carácter. Por ejemplo, la palabra "Python" podría 
transformarse en "Pytnoh" o "Pyhotn",
mientras que "Hola" podría ser "Hloa" o "Halo".

Requisitos:
- La lista de palabras debe estar predefinida en el programa con al menos 5 palabras distintas.
- Utiliza los módulos 'random' y 'string' para realizar las mezclas.
- Asegúrate de que el primer y el último carácter de cada palabra permanezcan en su lugar.
"""
# Lista de palabras predefinida
lista_palabras = ["Python", "Hola", "Programación", "Desarrollo", "Inteligencia"]


# Función para mezclar los caracteres de una palabra excepto el primero y el último
def mezclar_palabra(palabra):
    # Convierte la palabra en una lista de caracteres para manipularla más fácilmente
    caracteres = list(palabra)

    # Mezcla los caracteres excepto el primero y el último
    caracteres_intermedios = random.sample(caracteres[1:-1], len(caracteres[1:-1]))

    # Reconstruye la palabra mezclada manteniendo el primer y último carácter en su lugar
    palabra_mezclada = caracteres[0] + ''.join(caracteres_intermedios) + caracteres[-1]

    return palabra_mezclada


# Mezcla las palabras de la lista
for palabra in lista_palabras:
    palabra_mezclada = mezclar_palabra(palabra)
    print(f'{palabra} -> {palabra_mezclada}')


"""
Enunciado:
Crea un programa en Python que simule el lanzamiento de un dado. 
El usuario debe poder especificar el número de caras del dado (por ejemplo, 
6 para un dado tradicional, 20 para un dado de rol, etc.). 
Después de especificar el número de caras, el programa debe generar y mostrar un resultado aleatorio
entre 1 y el número de caras del dado.

Requisitos:
- Pide al usuario que introduzca el número de caras del dado.
- Utiliza el módulo 'random' para generar el resultado aleatorio.
- Asegúrate de validar que el número de caras es un número válido mayor que 1.

"""
# Función para simular el lanzamiento de un dado
def lanzar_dado(num_caras):
    resultado = random.randint(1, num_caras)
    return resultado

# Solicitar al usuario el número de caras del dado
while True:
    try:
        num_caras = int(input("Introduce el número de caras del dado: "))
        if num_caras < 2:
            raise ValueError("El número de caras debe ser mayor que 1.")
        break
    except ValueError as e:
        print("Error:", e)
        continue

# Lanzar el dado y mostrar el resultado
resultado_lanzamiento = lanzar_dado(num_caras)
print("El resultado del lanzamiento es:", resultado_lanzamiento)


"""
Enunciado:
Crea un programa en Python que genere un número aleatorio entre 1 y 10 y permita al usuario adivinarlo.
El programa debe indicar si el intento del usuario es demasiado alto, demasiado bajo, 
o correcto. Después de adivinar correctamente, el programa debe preguntar al usuario si 
quiere jugar de nuevo.

Requisitos:
- Utiliza el módulo 'random' para generar el número aleatorio.
- El programa debe seguir ejecutándose hasta que el usuario decida no jugar más.
- Asegúrate de capturar y manejar los errores, como entradas no numéricas.

"""
def jugar_adivina_numero():
    # Generar un número aleatorio entre 1 y 10
    numero_aleatorio = random.randint(1, 10)

    while True:
        try:
            # Solicitar al usuario que adivine el número
            intento = int(input("Adivina el número entre 1 y 10: "))

            # Verificar si el intento del usuario es correcto
            if intento == numero_aleatorio:
                print("¡Felicidades! Adivinaste el número.")
                break
            elif intento < numero_aleatorio:
                print("Demasiado bajo. Intenta nuevamente.")
            else:
                print("Demasiado alto. Intenta nuevamente.")
        except ValueError:
            print("Por favor, introduce un número válido.")
            continue

    # Preguntar al usuario si quiere jugar de nuevo
    while True:
        jugar_nuevamente = input("¿Quieres jugar de nuevo? (s/n): ").lower()
        if jugar_nuevamente == 's':
            return True
        elif jugar_nuevamente == 'n':
            return False
        else:
            print("Respuesta inválida. Por favor, responde con 's' o 'n'.")


# Programa principal
while True:
    if jugar_adivina_numero():
        continue
    else:
        print("¡Gracias por jugar!")
        break

"""
Enunciado:
Crea un programa en Python que simule un sorteo. Dada una lista de nombres de participantes,
el programa debe seleccionar un ganador al azar y luego removerlo de la lista para evitar
que sea seleccionado nuevamente. Repite el proceso para seleccionar un segundo y tercer ganador,
asegurándote de que no se repitan los ganadores.

Requisitos:
- Utiliza una lista predefinida de nombres de participantes.
- Utiliza el módulo 'random' para seleccionar los ganadores.
- Asegúrate de que cada ganador sea único y muestre los nombres de los ganadores al final.

"""
# Lista de participantes
participantes = ["Juan", "María", "Carlos", "Laura", "Pedro", "Ana"]

ganadores = []

# Selección del primer ganador
ganador1 = random.choice(participantes)
ganadores.append(ganador1)
participantes.remove(ganador1)

# Selección del segundo ganador
ganador2 = random.choice(participantes)
ganadores.append(ganador2)
participantes.remove(ganador2)

# Selección del tercer ganador
ganador3 = random.choice(participantes)
ganadores.append(ganador3)

# Mostrar los ganadores
print("Los ganadores son:")
for i, ganador in enumerate(ganadores, start=1):
    print(f"Ganador {i}: {ganador}")
    
"""
Enunciado:
Crea un programa en Python que genere nombres de usuario aleatorios para 
una lista de nombres de personas. El nombre de usuario debe ser una 
combinación de una cadena aleatoria de tres letras (pueden ser mayúsculas o minúsculas)
seguido de un número aleatorio entre 100 y 999.

Requisitos:
- Utiliza una lista predefinida de nombres completos de personas.
- Utiliza los módulos 'random' y 'string' para generar las partes del nombre de usuario.
- Genera un nombre de usuario para cada persona en la lista

"""
# Lista de nombres completos de personas
nombres_completos = ["Juan Pérez", "María García", "Carlos López", "Laura Martínez", "Pedro Rodríguez", "Ana Sánchez"]

# Función para generar un nombre de usuario aleatorio
def generar_nombre_usuario(nombre_completo):
    # Obtener las iniciales del nombre y apellido
    iniciales = ''.join(nombre[0] for nombre in nombre_completo.split())
    # Generar una cadena aleatoria de tres letras
    letras_aleatorias = ''.join(random.choices(string.ascii_letters, k=3))
    # Generar un número aleatorio entre 100 y 999
    numero_aleatorio = random.randint(100, 999)
    # Combinar las partes para formar el nombre de usuario
    nombre_usuario = letras_aleatorias.upper() + iniciales.upper() + str(numero_aleatorio)
    return nombre_usuario

# Generar un nombre de usuario para cada persona en la lista
nombres_usuarios = [generar_nombre_usuario(nombre) for nombre in nombres_completos]

# Mostrar los nombres de usuario generados
for nombre_completo, nombre_usuario in zip(nombres_completos, nombres_usuarios):
    print(f"{nombre_completo}: {nombre_usuario}")