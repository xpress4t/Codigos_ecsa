def suma(*args):
    resultado = 0
    for numero in args:
        resultado += numero
    return resultado


print(suma(1, 2))
print(suma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))