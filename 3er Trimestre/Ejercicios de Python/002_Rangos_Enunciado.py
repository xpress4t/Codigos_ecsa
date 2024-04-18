"""
Ejercicio 1: Creación de un Rango Simple
Define un rango que vaya desde 0 hasta 5 (inclusive).
Imprime el rango creado.
"""
print(list(range(0,6)))
print("--------------------------------")

"""
Ejercicio 2: Creación de un Rango con Inicio y Fin Específicos
Define un rango que vaya desde 5 hasta 10 (inclusive).
Imprime el rango creado.
"""
print(list(range(5,11)))
print("--------------------------------")
"""
Ejercicio 3: Creación de un Rango con Incremento Específico
Define un rango que vaya desde 1 hasta 10 (inclusive) con incremento de 2.
Imprime el rango creado.
"""
print(list(range(1,10,2)))
print("--------------------------------")

"""
Ejercicio 4: Iteración sobre un Rango Simple
Itera sobre un rango que vaya desde 0 hasta 3 (inclusive).
Imprime cada valor del rango en una línea separada.
"""
for i in range(4):
    print(i)
    
print("--------------------------------")
"""
Ejercicio 5: Iteración sobre un Rango con Incremento Específico
Itera sobre un rango que vaya desde 0 hasta 10 (inclusive) con incremento de 2.
Imprime cada valor del rango en una línea separada.
"""
for i in range(0,12,2):
    print(i)
    
print("--------------------------------")
"""
Ejercicio 6: Uso de Rangos en Funciones de Control de Flujo
Itera sobre un rango que vaya desde 10 hasta 1 (inclusive) con decremento de 1.
Imprime cada valor del rango en una línea separada.
"""
for i in range(10,0,-1):
    print(i)
    
print("--------------------------------")
"""
Ejercicio 7: Uso de Rangos en Condicionales
Verifica si un número ingresado por el usuario está dentro de un rango predefinido.
"""
lista = list(range(10, 41))
num = int(input("Ingrese un número: "))

if num in lista:
    print(f"El número {num} está en la lista.")
else:
    print(f"El número {num} no está en la lista.")
print("--------------------------------")
"""
Ejercicio 8: Uso de Rangos para Generar Secuencias de Números
Genera una lista de números pares en el rango de 0 a 10 (inclusive).
Imprime la lista resultante.
"""
print(list(range(0,12,2)))
print("--------------------------------")
"""
Ejercicio 9: Uso de Rangos para Sumar Elementos
Calcula la suma de todos los números en el rango de 1 a 100 (inclusive).
Imprime el resultado de la suma.
"""
lista=list(range(0,101))
suma = sum(lista)
print("La suma de los números en el rango de 1 a 100 es: ",suma)
print("--------------------------------")
"""
Ejercicio 10: Uso de Rangos para Contar Elementos
Cuenta cuántos números pares hay en el rango de 1 a 50 (inclusive).
Imprime el total de números pares.
"""
pares=0
for i in range(0,50,2):
    pares+=1
print("La cantidad de números pares en la lista es: ",pares)
print("--------------------------------")
"""
Ejercicio 11: Uso de Rangos en una Función
Define una función llamada `imprimir_rango` que reciba un parámetro `limite`.
La función debe imprimir todos los números desde 0 hasta el `limite` (inclusive) utilizando un rango.
"""

"""
Ejercicio 12: Uso de Rangos en una Función con Paso Personalizado
Define una función llamada `imprimir_rango_paso` que reciba tres parámetros: `inicio`, `fin` y `paso`.
La función debe imprimir todos los números desde `inicio` hasta `fin` (inclusive) utilizando un rango con el paso especificado.
"""

"""
Ejercicio 13: Uso de Rangos para Generar Secuencias de Caracteres
Genera una lista de letras del alfabeto inglés (minúsculas) utilizando un rango.
Imprime la lista resultante.
"""

"""
Ejercicio 14: Uso de Rangos para Generar Patrones
Genera un patrón numérico en forma de triángulo utilizando un rango y la función `join()`.
Imprime el patrón resultante.
"""

"""
Ejercicio 15: Uso de Rangos para Generar Patrones (Otra Forma)
Genera un patrón numérico en forma de triángulo invertido utilizando un bucle for.
Imprime el patrón resultante.
"""

"""
Ejercicio 16: Uso de Rangos para Generar Patrones (Otra Forma)
Genera un patrón de asteriscos en forma de pirámide utilizando un bucle for.
Imprime el patrón resultante.
"""
numero = int(input("Ingrese el número de pisos de su triángulo: "))
for i in range(numero):
    print(" "*(numero-i-1),end="")
    print("*"*(2*i+1))
print("--------------------------------")
"""
Ejercicio 17: Uso de Rangos para Generar Patrones (Otra Forma)
Genera un patrón de números en forma de diamante utilizando un bucle for.
Imprime el patrón resultante.
"""
numero = int(input("Ingrese la altura del diamante: "))
for i in range(numero):
    print(" "*(numero-i-1),end="")
    print("*"*(2*i+1)) # Para i=8 --> (2*i+1)=17
for i in range(numero - 2, -1, -1):
    print(" "*(numero-i-1),end="")
    print("*"*(2*i+1))
print("--------------------------------")
"""
Ejercicio 18: Uso de Rangos para Generar Patrones (Otra Forma)
Genera un patrón de letras en forma de pirámide utilizando un bucle for.
Imprime el patrón resultante.
"""

"""
Ejercicio 19: Uso de Rangos para Generar Patrones (Otra Forma)
Genera un patrón de letras en forma de pirámide invertida utilizando un bucle for.
Imprime el patrón resultante.
"""

"""
Ejercicio 20: Uso de Rangos para Generar Patrones (Otra Forma)
Genera un patrón de letras en forma de diamante utilizando un bucle for.
Imprime el patrón resultante.
"""
n = int(input("Ingrese el número de pisos de su piramide: "))
for i in range(0,n+1):
    espacios = n-i
    formula = 2*i+1
    print(" "*espacios+"*"*formula)