def concatenar(x,y):
    return str(x)+str(y)

x = ['Python','Java', 'C++']
y = ['hola', 'mundo', 'xxdd']

concatenando = map(concatenar,x,y)
lista = list(concatenando)
print(lista)

'''
# Ejercicio 5
#5. Elevar al cubo todos los valores de un diccionario:
'''
def elevarAlCubo(diccionario):
    nuevo_diccionario={}
    for key,value in diccionario.items():
        nuevo_diccionario[key] = value**3
    return nuevo_diccionario

diccionario_original = {'a': 2, 'b': 3, 'c': 4}
diccionario_elevado = elevarAlCubo(diccionario_original)
print(diccionario_elevado)

def cubo(diccionario1):
    new_dic={}
    for k,v in diccionario1.items():
        new_dic[k] = v**3
    return new_dic

dicOriginal = {'a':2,'b':5,'c':8}
x = map(cubo,dicOriginal)
xd = list(x)
print(xd)