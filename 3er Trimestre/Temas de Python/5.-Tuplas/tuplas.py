'''
Qué podemos hacer con las tuplas?
    - Crear
    - Saber elementos de una lista
    - Saber el número de elementos
'''

objTupla = (1,2,3,4,4,4,44,4)
print(objTupla[3])
print("---------------")
for x in objTupla:
    print(x)

print("---------------")
print("Número de 4 --> ", objTupla.count(4))
print("---------------")
print("Número de elementos",len(objTupla))
print("---------------")
print("Typo elemento",type(objTupla))

# objTupla[1]=1
# tuple(list(objTupla).append(6))
