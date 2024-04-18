var = [1,1,1,2,3,4,1,2,3,4,5]
print(var)
var1 = {1,1,1,2,3,4,1,2,3,4,5}
print(var1)

# En los conjuntos se pueden agregar números, texto, tuplas, pero no listas
var1.add(1)
var1.add("1")
var1.add((1,2,3))
print(var1)

var1.discard(3)
print(var1)

var2 = {"a","b"}
var1.update(var2)
print(var1)

varList=list(var1)
print(varList)
