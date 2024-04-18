import random

# Definir el tamaño de la matriz
filas = 4
columnas = 4

# Crear una matriz de 8x8 con números aleatorios entre 1 y 100
matriz = [[random.randint(0,9) for _ in range(columnas)] for _ in range(filas)]

# Imprimir la matriz
for fila in matriz:
    print(fila)
print("--------------------------------------------------")


# Cadena de texto entera
variable_mensaje = "hola, esta es una variable sin tenr que escribir String"
print(variable_mensaje)
print("--------------------------------------------------")


# Anidando cadenas de texto
texto_1="Hola"
texto_2=", me llamo Emmanuel"
texto_3=texto_1+texto_2
print(texto_3)
print("--------------------------------------------------")


# Haciendo una lista 
lista_de_motos = ['BMW','Yamaha','Kawasaki','Suzuki']

print(lista_de_motos)

print("--------------------------------------------------")

print("Primera marca de la lista: "+lista_de_motos[0])
print("Segunda marca de la lista: "+lista_de_motos[1])
print("Tercera marca de la lista: "+lista_de_motos[2])

print("--------------------------------------------------")

print(lista_de_motos[-1]) # Último elemento de la lista
print(lista_de_motos[-2]) # Penúltimo elemento de la lista
print(lista_de_motos[-3]) # Primer elemento de la lista

print("--------------------------------------------------")
for motos in lista_de_motos:
    print(motos)
    
lista_de_motos.append('Honda')
lista_de_motos.append('Ducatti')
print(lista_de_motos)