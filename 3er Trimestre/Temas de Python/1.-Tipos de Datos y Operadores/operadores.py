import random
import string

numero1 = 4
numero2 = 3
resultadoPotencia = numero1 ** numero2
resultadoDivisionAproximada = numero1 // numero2
operacion = 3 ** 3 * (13 / 5 - (2 * 4))
a = 10
b = 12
c = 13
d = 10
operadoresLog = ((a > b) or (a < c)) and ((a == c) or (a >= b))
resultado_1 = ((a > b) or (b < c))
negacion_resultado_1 = not resultado_1
print(f'La potencia de {numero1} con {numero2} es {resultadoPotencia}')
print(f'La división aproximada entre {numero1} y {numero2} es {resultadoDivisionAproximada}')
print(f'El resultado de la op es  {operacion}')
print(f'El resultado de la operación lógica es {operadoresLog}')
print(f'{resultado_1}')
print(f'{negacion_resultado_1}')
print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
print("Prioridad de los Operadores en general")
print("1.- ()")
print("2.- **")
print("3.- *, /, mod, not")
print("4.- +, -, and")
print("5.- >, <, ==, >=, <=, !=, or")

# Generar una matriz de 10x10 con letras al azar
sopaLetras = [[random.choice(string.ascii_uppercase) for _ in range(10)] for _ in range(10)]

# Imprimir la matriz
# for fila in sopaLetras:
#    print(' '.join(fila))
# comentario 1
