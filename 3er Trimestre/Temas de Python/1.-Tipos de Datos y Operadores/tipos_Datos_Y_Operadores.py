vars="5"
print(int(5)+1)
division = 3.3/9
# round --> para solo obtener 3 decimales (en caso los haya)
print(round(division,3))
print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")

n=2
print(eval("5+9/7 *n"))
print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")

print(type(5))
print(type("5"))
print(type(5.1))
print(type(True))
print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")

# Lista de los 10 primeros contando como primera posición el cero
print(list(range(10)))
print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")

# Lista de números desde el hasta le 9
print(list(range(5,10)))
print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")

# Posición inicial, Posición final, de cuanto en cuanto
print(list(range(5,10,2)))

# Estructuras de control

# elif == else if
if 5>6:
    print("5>6")
else:
    if 5 != 5:
        print("5<6")

print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
 
for indice in range(1,5):
    print(indice)

print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")

var = "hola buenos dias"
for indice_1 in range(len(var)):
    print(var[indice_1])

print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")

for letra in var:
    print(letra)
    
print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")


var = int(input("Dame un número"))
print("El número es: ",var)

# comentario 2