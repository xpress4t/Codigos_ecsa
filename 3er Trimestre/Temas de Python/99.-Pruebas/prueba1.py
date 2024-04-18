txt = "dadEqaaWvs12"
print(txt)
print(txt.upper())
print(txt.lower())
print(txt.find("W"))
print(txt.find("Eqa"))
print(txt.replace("Eqaa"," Hola :p "))

potencia = 3**3
print(potencia)

n = int(input("Ingrese el número de filas que quiere imprimir: "))

for i in range(0,n):
    print(" ")
    for j in range(i+1,0,-1):
        print("*",end=' ')