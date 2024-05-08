import random as rd
import string as str
"""
Enunciado:
Crea un programa en Python que tome una lista de palabras y mezcle aleatoriamente 
los caracteres de cada palabra,
excepto el primero y el último carácter. Por ejemplo, la palabra "Python" podría 
transformarse en "Pytnoh" o "Pyhotn",
mientras que "Hola" podría ser "Hloa" o "Halo"."""
"""
Requisitos: 
- La lista de palabras debe estar predefinida en el programa con al menos 5 palabras distintas.
- Utiliza los módulos 'random' y 'string' para realizar las mezclas.
- Asegúrate de que el primer y el último carácter de cada palabra permanezcan en su lugar.
"""
palabras =  ["python","hola","oluifa","rectangulo","trotamundos"]
for p in palabras:
    if len(p) < 4:
        print(p)
    else:
        letraUno = p [0]
        ultimaLetra = p[-1]
        complement = list()
        for i in range (1,len(p)-1):
            complement.append(p[i])
        rd.shuffle(complement)
#el join sirve para poder sacar las letras de la lista
        palabra = letraUno + "".join(complement) + ultimaLetra
        print(palabra)
        
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
usu = int(input("dime la cantidad de caras que quieres? "))
if usu <= 1:
    print("resultado: ",usu)
    print("el numero de caras es uno")
elif usu<=6:
    numAle = rd.randrange(1,usu)
    print("el numero de caras del dado es :", usu)
    print("el numero que salio es:",numAle )
else: 
    numAle = rd.randrange(1,usu)
    print("el numero de caras del dado es :", usu)
    print("el numero que salio es:",numAle )
    
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
print("Bienvenido a adivinar el numero")
intentos = 0 
numSecreto = rd.randrange(1,11)
seguir = True
while intentos <= 5:
    try: 
        usu = int(input("Intenta adivinar el numero.... "))
        if numSecreto == usu:
            print("genial has adivinado el numero")
            intentos+=1
            print("el numero de intentos fue de:",intentos)
            decision = input("Genial quieres seguir jugando? 1 SI 2 NO.... ")
            if decision.lower() == "1":
                numSecreto = rd.randrange(1,11)
                intentos = 0
            elif decision.lower()== "2":
                print("Fin del Juego")
                seguir = False
                break
        elif numSecreto <usu:
            print("Uy el numero introducido es muy alto") 
            intentos+= 1
        elif numSecreto> usu:
            print("Ups el numero introducido es bajo")
            intentos+=1
    except:
        print("no puedes hacer eso")
else:
    print("Se te acabaron los intentos, Perdiste")
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
participantes = ["carlos","mengshi","dorian","rebeca","emmanuel","daichi","gerhard"]
#SOLUCION 1
"""ejemplos = rd.sample(participantes,3)
print("Ganador 1:",ejemplos[0])
print("Ganador 2:",ejemplos[1])
print("Ganador 3:",ejemplos[2])
"""
#SOLUCION 2
listaGanadores = list()
while  len(listaGanadores) <= 2:
    ganador = rd.randrange(0,len(participantes))
    listaGanadores.append(participantes[ganador])
    participantes.remove(participantes[ganador])
print("Ganador 1:",listaGanadores[0])
print("Ganador 2:",listaGanadores[1])
print("Ganador 3:",listaGanadores[2])
    
    
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
letras = str.ascii_letters
listaLetras = list()
listaNum = list()
listaNombres = list()
numLetra = str.digits
#rd.sample(letras,3) --> sample coge la cadena de strings que asignes
# y el segundo es para asignar la cantidad de letras aleatorias que necesites
while len(listaNombres) < 5:
    letrasAle = "".join (rd.sample(letras,3))
    listaLetras.append(letrasAle)   
    numAle = "". join (rd.sample(numLetra,3))
    palabra = letrasAle + numAle 
    listaNombres.append(palabra)
print(listaNombres)