# Hacer una función que calcule el factorial de cualquier número "n" ingresado
def factorial(numero):
    if numero==0 or numero ==1:
        return 1
    else:
        return numero*factorial(numero-1)

print("\t\t\tEJERCICIO 1")
numero = int(input("Ingrese el número n del cual desea calcular su factorial: "))
print(f'{numero}! = {factorial(numero)}')

# Hacer una función recursiva que calcule la serie de Fibonacci
def Fibonacci(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    elif n>=2:
        return Fibonacci(n-1)+Fibonacci(n-2)

print("\n\t\t\tEJERCICIO 2")
n = int(input("Ingrese la posición que desea saber su Fibonacci: "))
print(f'La posición {n} en la serie de Fibonacci es: {Fibonacci(n)}')

# Hacer la función de Ackermann utilizando recursividad
def Ackermann(m,n):
    if m==0:
        return n+1
    elif m>0 and n==0:
        return Ackermann(m-1,1)
    elif m>0 and n>0:
        return Ackermann(m-1,Ackermann(m,n-1))

print("\n\t\t\tEJERCICIO 3")
m = int(input("Ingrese el valor de m: "))
n = int(input("Ingrese el valor de n: "))
print(f'A({m},{n}) = {Ackermann(m,n)}')

# Hacer una función que muestre las potencias sucesivas
def potencia(n):
    return 2*potencia(n)
n = int(input("Ingrese valor: "))
print(potencia(n))