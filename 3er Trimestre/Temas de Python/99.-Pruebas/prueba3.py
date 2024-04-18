import random
import string

# Generar una matriz de 10x10 con letras al azar
sopaLetras = [[random.choice(string.ascii_uppercase) for i in range(10)] for j in range(10)]

# Imprimir la matriz
for fila in sopaLetras:
    print(' '.join(fila))
