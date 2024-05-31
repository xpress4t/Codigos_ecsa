# Ejercicio 1
# 1. Multiplicar todos los elementos de una lista por 3:

def multiplucarPor3(x):
    return x*3

lista_original = [1, 2, 3, 4, 5]
resultado1 = map(multiplucarPor3,lista_original)
print(list(resultado1))
print("--------------------------------------")
# Ejercicio 2
# 2. Filtrar los números pares de una lista:

def filtrarPares(x):
    return x%2 == 0

lista_numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
resultado2 = filter(filtrarPares,lista_numeros)
print(list(resultado2))
print("--------------------------------------")

# Ejercicio 3
# 3. Sumar todos los elementos de una lista:
from functools import reduce

def sumarElementos(x,y):
    return x+y

lista_numeros = [1, 2, 3, 4, 5]
resultado3 = reduce(sumarElementos,lista_numeros)
print(resultado3)
print("--------------------------------------")

# Ejercicio 4
# 4. Filtrar los números mayores que 10 y multiplicarlos por 2:
lista_numeros = [5, 10, 15, 20, 25]
def numerosMayores(x):
    return x>10
   
numerosEscogidos = filter(numerosMayores,lista_numeros)

def multiplicarPor2(y):
    return y*2

resultado4 = map(multiplicarPor2,numerosEscogidos)
print(list(resultado4))
print("--------------------------------------")

# Ejercicio 5
# 5. Filtrar las palabras que tienen más de 5 letras en una lista de palabras:
lista_palabras = ["python", "programacion", "aprendizaje", "desarrollo", "informatica"]

def filtrarPalabras(x):
    return len(x)>5

resultado5 = filter(filtrarPalabras, lista_palabras)
print(list(resultado5))
print("--------------------------------------")
    
# Ejercicio 6
# 6. Calcular el producto de todos los elementos de una lista:

def productoLista(x,y):
    return x*y

lista_numeros = [1, 2, 3, 4, 5]
m = reduce(productoLista,lista_numeros)
print(m)
print("--------------------------------------")

# Ejercicio 7
# 7. Convertir todas las palabras en una lista a mayúsculas:

lista_palabras = ["hola", "python", "mundo", "programacion"]
res = map(str.upper,lista_palabras)
print(list(res))
print("--------------------------------------")

# Ejercicio 8
# 8. Filtrar los números impares y elevarlos al cuadrado:
lista_numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

def impares(x):
    return x%2 != 0

def elevarImpares(x):
    return x*x

res = filter(impares,lista_numeros)
per = map(elevarImpares,res)
print(list(per))
print("--------------------------------------")

# Ejercicio 9
# 9. Concatenar todas las palabras de una lista separadas por un guión:
def formato(x,y):
    return f'{x} - {y}'

lista_palabras = ["hola", "python", "mundo"]
res = reduce(formato,lista_palabras)
print(res)
print("--------------------------------------")

# Ejercicio 10
# 10. Filtrar los elementos de una lista que son cadenas de texto:
lista_mixta = [1, "python", 3.5, "programacion", True, "aprendizaje"]

def filtro(x):
    return type(x) == str

res = filter(filtro,lista_mixta)
print(list(res))
print("--------------------------------------")

# Ejercicio 11
# 11. Multiplicar los elementos de dos listas elemento por elemento:
lista1 = [1, 2, 3, 4, 5]
lista2 = [2, 3, 4, 5, 6]

def multiplicar(x,y):
    return x*y

res = map(multiplicar,lista1,lista2)
print(list(res))
print("--------------------------------------")

# Ejercicio 12
# 12. Filtrar los números negativos de una lista y convertirlos a positivos:
lista_numeros = [-5, 10, -15, 20, -25]

def filtrarNegativos(x):
    return x<0

def multipicarNegativo(x):
    return x*(-1)

res = filter(filtrarNegativos,lista_numeros)
des = map(multipicarNegativo,res)
print(list(des))
print("--------------------------------------")

# Ejercicio 13
# 13. Filtrar las palabras que comienzan con una letra específica de una lista:
letra_busqueda = 'p'
lista_palabras = ["python", "programacion", "aprendizaje", "desarrollo", "informatica"]

def filtrar(x):
    return x[0] == letra_busqueda
    # return x.startswith(letra_busqueda)

res = filter(filtrar,lista_palabras)
print(list(res))
print("--------------------------------------")

# Ejercicio 14
# 14. Sumar los números pares de una lista:
lista_numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

def filtrar(x):
    return x%2 == 0

def sumar(x,y):
    return x+y

res = filter(filtrar,lista_numeros)
des = reduce(sumar,res)
print(des)
print("--------------------------------------")

# Ejercicio 15
# 15. Filtrar los números primos de una lista de números:
lista_numeros = [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]

def filtrarPrimos(x):
    for i in range(2,x):
        if x%i == 0:
            return False
    return x

des = filter(filtrarPrimos, lista_numeros)
print(list(des))
print("--------------------------------------")

# Ejercicio 16
# 16. Concatenar solo las palabras que tienen más de 4 letras en una lista:
lista_palabras = ["hola", "python", "mundo", "programacion", "ai", "openai"]

def concatenar(x):
    return len(x)>4

res = filter(concatenar,lista_palabras)
print(list(res))
print("--------------------------------------")

# Ejercicio 17
# 17. Calcular el promedio de los elementos de una lista de números:
lista_numeros = [1, 2, 3, 4, 5]

def suma(x,y):
    return x+y

numeroDeElementos = len(lista_numeros)
res = reduce(suma,lista_numeros)
promedio = res/numeroDeElementos
print(promedio)
print("--------------------------------------")

# Ejercicio 18
# 18. Crear una lista de tuplas que contengan el número y su factorial:
lista_numeros = [1, 2, 3, 4, 5]

def factorial(x):
    if x == 1 or x == 0:
        return 1
    else:
        return x*factorial(x-1)
    
res = map(factorial,lista_numeros)
print(list(res))
print("--------------------------------------")

# Ejercicio 19
# 19. Calcular la suma de los dígitos de una lista de números:
lista_numeros = [123, 456, 789, 101112]

def sumaDigitos(numero):
    suma = 0
    while numero>0:
        suma += numero%10
        numero //= 10
    return suma

suma_digitos_por_numero = map(sumaDigitos,lista_numeros)
suma_total = reduce(lambda x,y: x+y,suma_digitos_por_numero)
print(suma_total)