dicc = {"elem1":1, "elem2":[1,2,[4,5,6]]}

for key in dicc:
    print(key)

varClaves = dicc.keys()
print(list(varClaves)[0])

# Puedo recorrerlo pero no puedo acceder directmente 
# Utilizo set si quiero quitar los valores repetidos
varValores=dicc.values()
print(varValores)

# k, v --> son variables
for k,v in dicc.items():
    print("la clave es: ",k," el valor es: ",v)
    
# Para eliminar elementos del diccionario
# se le pasa 2 parámetros primero la clave (K)
# el segundo es un mensaje opcional como para decir que no está u otra cosa
print(dicc.pop("elem1","Esta clave no existe"))
print(dicc.pop("elem1","Esta clave no existe"))

print(dicc.get("elem1"))
print(dicc["param1"])

# Buscar como copiar datos en python --> TAREA