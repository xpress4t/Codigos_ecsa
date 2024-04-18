from functools import reduce

lst = [1, 2, 3, 4, 5, 6, 7, 8, 9]
# el filtro me devuelve una lista
# 1º filtro
# 2º map
# 3º reduce (acumula el resultado de una lista y hacer la funcion correspondiente)
# ejem: 2+3+4+77 y me devuelve la suma

def pares(x):
    return x % 2 == 0


print(list(filter(pares, lst)))