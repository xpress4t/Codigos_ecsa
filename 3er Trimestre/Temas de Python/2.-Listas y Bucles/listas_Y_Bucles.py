var1 = "hola buenos días"

for indice,letra in enumerate(var1):
    print("La letra es: ",letra, " y su índice es: ",indice)
    
print("==================================")
    
contador=0    
while contador != 10:
    print(contador)
    contador += 1
    
    
print("==================================")

contador_2 = 0
while contador_2 != 10:
    contador_2 += 1
    if contador_2 == 5:
        break
    print(contador_2)

print("==================================")
# varLista = [5,6,7] --> es una lista
# varLista1 = list(1,2,3)  --> también es una lista, 
# es el parseo de intentar convertir una lista a cualquier cosa

varLista = [5,6,7]
varLista1 = list([1,2,3])

print(varLista,varLista1)
print("==================================")
print(str(type(varLista1)))

lst = list()
lst.append(1)
lst.append(21)
lst.append(31)

# Se le puede agregar una lista interna a pesar de que los demás solo sean números
lst.append([41,4,5,6])
lst.append(51)

print(lst)
print("==================================")

print(lst[4])
print(lst[3])
print(lst[2])
print(lst[1])
print(lst[0])
print(lst[-1])
print(lst[-2])
print(lst[-3])
print(lst[-4])
print("==================================")

print(lst[2:5]) # Desde la posición 2 hasta la posición 5-1

print("==================================")

print(lst[2:5:2])

print("==================================")

print(lst[3][2])

print("==================================")

lista = list()
lista.append(1)
lista.append(2)
lista.append(3)
lista.append(4)
lista.append(5)
lista.append(6)
lista.append(7)

print("El uno está: ",lista.count(1))
print("El uno está: ",lista.index(4))

lista.remove(1) # Elimina la primera coincidencia del valor buscado (1)
print(lista)
print("==================================")

lista.pop(3) # Elimina el elemento de la posición indicada
print(lista)

print("==================================")

lst = [0,[0]]*5
print(lst)
print("==================================")

lst=[1,2]
lst1=[3,4]
lst2 = lst1 + lst
print(lst2)
print("==================================")

lista_x = [1,1,1,2,6,4,87,1]