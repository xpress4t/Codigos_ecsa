import math
from colorama import Fore, Style

"""
Ejercicio 1:
Crear un programa que calcule el área de un triángulo rectángulo dado su base y altura.
Utiliza variables para almacenar la base, la altura y el resultado del cálculo del área.
"""
baseTriangulo = float(input("Ingrese el valor de la base: "))
alturaTriangulo = float(input("Ingresa el valor de la altura: "))
areaTriangulo = (baseTriangulo * alturaTriangulo) / 2
print("El area del triángulo rectángulo es: " + str(areaTriangulo))
print(Fore.GREEN + "----------------------------------------------------" + Style.RESET_ALL)

"""
Ejercicio 2:
Escribir un programa que convierta grados Celsius a grados Fahrenheit.
Utiliza una variable para almacenar los grados Celsius, realiza el cálculo y muestra el resultado.
"""
gradosCelcius = float(input("Ingresa el valor de los grados Celcius: "))
gradosFahrenheit = (gradosCelcius * (9 / 5)) + 32
print(str(gradosCelcius) + "ºC es igual a " + str(gradosFahrenheit) + "ºF")
print(Fore.GREEN + "----------------------------------------------------" + Style.RESET_ALL)

"""
Ejercicio 3:
Crear un programa que calcule el perímetro y el área de un círculo dado su radio.
Utiliza una variable para almacenar el radio, realiza los cálculos y muestra los resultados.
"""
pi = math.pi
radioCirculo = float(input("Ingrese el valor del radio del círculo: "))
perimetroCirculo = round(2 * pi * radioCirculo, 3)
areaCirculo = round(pi * (pow(radioCirculo, 2)), 3)
print(f'Perímetro: {perimetroCirculo}')
print(f'Área: {areaCirculo}')
print(Fore.GREEN + "----------------------------------------------------" + Style.RESET_ALL)

"""
Ejercicio 4:
Escribir un programa que determine si un número dado es par o impar.
Utiliza una variable para almacenar el número, aplica el operador de módulo y muestra el resultado.
"""
numero = int(input("Ingrese un número entero: "))
if (numero % 2 == 0):
    print("El número es par")
else:
    print("El número es impar")
print(Fore.GREEN + "----------------------------------------------------" + Style.RESET_ALL)

"""
Ejercicio 5:
Crear un programa que calcule la hipotenusa de un triángulo rectángulo dado sus catetos.
Utiliza dos variables para almacenar los catetos, aplica el teorema de Pitágoras y muestra el resultado.
"""
cateto_1 = float(input("Cateto adyacente: "))
cateto_2 = float(input("Cateto opuesto: "))
hipotenusa = round(math.sqrt((pow(cateto_1, 2) + pow(cateto_2, 2))), 3)
print(f'Utilizando el Teorema de Pitágoras, la hipotenusa será: {hipotenusa}')
print(Fore.GREEN + "----------------------------------------------------" + Style.RESET_ALL)

"""
Ejercicio 6:
Crear un programa que calcule el área y el perímetro de un rectángulo dados su base y su altura.
Utiliza variables para almacenar la base, la altura y realiza los cálculos correspondientes.
"""
baseRectangulo = float(input("Base del rectángulo: "))
alturaRectangulo = float(input("Altura del rectángulo: "))
areaRectangulo = round(baseRectangulo * alturaRectangulo, 3)
perimetroRectangulo = round(2 * baseRectangulo + 2 * alturaRectangulo, 3)
print(f'Área: {areaRectangulo}')
print(f'Perímetro: {perimetroRectangulo}')
print(Fore.GREEN + "----------------------------------------------------" + Style.RESET_ALL)

"""
Ejercicio 7:
Escribir un programa que determine si un año es bisiesto o no.
Utiliza una variable para almacenar el año, aplica las reglas para determinar si es bisiesto y muestra el resultado.
"""
año = int(input("Ingrese el año que desea saber si es bisiesto o no: "))
if año % 4 == 0:
    print("El año " + str(año) + " es bisiesto.")
else:
    print("El año " + str(año) + " no es bisiesto.")
print(Fore.GREEN + "----------------------------------------------------" + Style.RESET_ALL)

"""
Ejercicio 8:
Crear un programa que convierta una cantidad de dólares a euros.
Utiliza una variable para almacenar la cantidad de dólares, realiza la conversión y muestra el resultado.
"""
numeroDolares = float(input("Ingrese la cantidad de dólares($) que desea convertir a euros(€): "))
numeroEuros = round(numeroDolares * 0.92, 4)
print(f'{numeroDolares}$ = {numeroEuros}€')
print(Fore.GREEN + "----------------------------------------------------" + Style.RESET_ALL)

"""
Ejercicio 9:
Escribir un programa que determine si un número dado es positivo, negativo o cero.
Utiliza una variable para almacenar el número, aplica condiciones y muestra el resultado.
"""
numeroIngresado = int(input("Ingrese un número entero: "))
if (numeroIngresado < 0):
    print("El número es negativo.")
elif (numeroIngresado > 0):
    print("El número es positivo.")
else:
    print("El número es cero.")
print(Fore.GREEN + "----------------------------------------------------" + Style.RESET_ALL)

"""
Ejercicio 10:
Crear un programa que calcule el promedio de tres números dados.
Utiliza tres variables para almacenar los números, realiza el cálculo y muestra el resultado.
"""
valor_1 = float(input("Primer número: "))
valor_2 = float(input("Segundo número: "))
valor_3 = float(input("Tercer número: "))
promedio = (valor_1 + valor_2 + valor_3) / 3
print(f'Promedio de los 3 números: {promedio}')
print(Fore.GREEN + "----------------------------------------------------" + Style.RESET_ALL)

"""
Ejercicio 11:
Crear un programa que determine si un número dado es primo o no.
Utiliza una variable para almacenar el número, aplica las reglas para determinar si es primo y muestra el resultado.
"""
n = int(input("n = "))
if n == 1 or n == 0:
    print(f'El número {n} no es primo.')
else:
    # El rango cogerá los valores desde 2 hasta n-1 :)
    for i in range(2, n):
        if n % i == 0:
            print(f'El número {n} no es primo.')
            # Si no pongo el break, imprimirá las veces que el número ingresado no es múltiplo de otros :)
            break
    else:
        print(f'El número {n} es primo.')
print(Fore.GREEN + "----------------------------------------------------" + Style.RESET_ALL)

"""
Ejercicio 12:
Escribir un programa que determine si un número dado es múltiplo de otro.
Utiliza dos variables para almacenar los números, aplica el operador de módulo y muestra el resultado.
"""
numero_1 = int(input("Ingrese el primer número: "))
numero_2 = int(input("Ingrese el segundo número: "))
if numero_1 % numero_2 == 0:
    print(f"{numero_2} es múltiplo de {numero_1}")
else:
    print(f"{numero_2} no es múltiplo de {numero_1}")
print(Fore.GREEN + "----------------------------------------------------" + Style.RESET_ALL)

"""
Ejercicio 13:
Crear un programa que calcule el factorial de un número dado.
Utiliza una variable para almacenar el número, realiza el cálculo del factorial y muestra el resultado.
"""
n = int(input("Ingrese el numero que desea hallar su factorial: "))
if n == 0 or n == 1:
    print(f'El factorial de {n} es igual a 1.')
else:
    for i in range(1, n):
        n *= i
    print(f'El factorial es {n}')
print(Fore.GREEN + "----------------------------------------------------" + Style.RESET_ALL)

"""
Ejercicio 14:
Escribir un programa que determine si una cadena de texto es palíndromo o no.
Utiliza una variable para almacenar la cadena, aplica condiciones y muestra el resultado.
"""
palabra = input("Ingrese una palabra: ")
palabraNueva = palabra.replace(" ", "")

# Creo una variable string vacía para guardar la palabra a invertir con el bucle for
palabraInvertida = ""

# (len(palabraNueva)-1,-1,-1) --->
# (posición inicial de donde empezará el bucle, hasta donde recorrerá el bucle pero -1 o sea (-1 -1)
for i in range(len(palabraNueva) - 1, -1, -1):
    palabraInvertida += palabraNueva[i]
    print(palabraInvertida)

if palabraInvertida == palabraNueva:
    print(f'{palabra} es palíndromo')
else:
    print(f'{palabra} no es palíndromo')

print(Fore.GREEN + "----------------------------------------------------" + Style.RESET_ALL)

"""
Ejercicio 15:
Crear un programa que cuente la cantidad de vocales en una cadena de texto dada.
Utiliza una variable para almacenar la cadena, itera sobre cada carácter y cuenta las vocales, luego muestra el resultado.
"""
palabra = "murcielago con otro murcielago es maricon"
palabraParaAnalizar = palabra.lower().replace(" ", "")
contador = 0
vocales = "aeiou"

# Iterar sobre cada carácter en la cadena
for i in vocales:
    # Verificar si el carácter es una vocal
    if i in palabraParaAnalizar:
        contador += 1
print(f'Hay {contador} vocales en la cadena "{palabra}"')

print(Fore.GREEN + "----------------------------------------------------" + Style.RESET_ALL)

"""
Ejercicio 16:
Escribir un programa que determine si una cadena de texto dada es un pangrama o no.
Un pangrama es una frase que contiene todas las letras del alfabeto al menos una vez.
Utiliza una variable para almacenar la cadena, itera sobre cada letra y verifica si está presente en el alfabeto, luego muestra el resultado.
"""
cadena = "The quick brown fox jumps over the lazy dog con moño azul"
abecedario = "abcdefghijklmnñopqrstuvwxyz"
cadenaNueva = cadena.lower().replace(" ", "")
contador = 0
for i in abecedario:
    if i in cadenaNueva:
        contador += 1

if contador == len(abecedario):
    print(f'La cadena de texto ingresada es un pandrama')
else:
    print(f'La cadena de texto ingresada no es un pandrama')
print(Fore.GREEN + "----------------------------------------------------" + Style.RESET_ALL)

"""
Ejercicio 17:
Escribir un programa que calcule el máximo común divisor (MCD) de dos números enteros.
Utiliza dos variables para almacenar los números, aplica el algoritmo de Euclides y muestra el resultado.
"""
primero = 8012385
segundo = 75

divisores_1 = []
divisores_2 = []
divisoresComunes = []
productoDeDivisoresComunes = 1

for i in range(1, primero + 1):
    if primero % i == 0:
        divisores_1.append(i)

for j in range(1, segundo + 1):
    if segundo % j == 0:
        divisores_2.append(j)

for k in divisores_1:
    if k in divisores_2:
        divisoresComunes.append(k)

for divisor in divisoresComunes:
    productoDeDivisoresComunes *= divisor

print(divisoresComunes)
print(productoDeDivisoresComunes)

print(Fore.GREEN + "----------------------------------------------------" + Style.RESET_ALL)

"""
Ejercicio 18:
Crear un programa que calcule la potencia de un número dado elevado a otro número entero.
Utiliza dos variables para almacenar la base y el exponente, realiza el cálculo de la potencia y muestra el resultado.
"""
numero1 = int(input(f'Ingrese el primer número: '))
numero2 = int(input(f'Ingrese la potencia a calcular del primer número: '))

operacion = numero1 ** numero2
print(f'{numero1} elevado a la potencia {numero2} es {operacion}')

print(Fore.GREEN + "----------------------------------------------------" + Style.RESET_ALL)

"""
Ejercicio 19:
Escribir un programa que calcule el área de un círculo dado su radio, utilizando una función.
La función debe recibir el radio como argumento y devolver el área del círculo.
"""
def areaX(radioX):
    return math.pi * (radioX ** 2)

radioX = float(input("Ingrese el valor del radio: "))
pi = 3.14159

print(areaX(radioX))
print(Fore.GREEN + "----------------------------------------------------" + Style.RESET_ALL)

"""
Ejercicio 20:
Crear un programa que determine si un número dado es perfecto o no.
Un número perfecto es aquel que es igual a la suma de sus divisores propios positivos (excluyendo al propio número).
Utiliza una variable para almacenar el número, realiza los cálculos y muestra el resultado.
"""

print(Fore.GREEN + "----------------------------------------------------" + Style.RESET_ALL)