def funcionQueNoDevuelveNada():
    print("Hola")
    # El None es como el null de Java
print(funcionQueNoDevuelveNada())
funcionQueNoDevuelveNada()

# Para definir un parametro que sea un string se pone strNombre
# Para enteros es intNombre
def funcionConParam(param1,param2):
    print("El 1º param es: ",param1)
    print("El 2º param es: ",param2)
    
# Sobrecarga de funciones --> Misma función pero con diferentes constructores
def funcionConParam(param1):
    print("El 1º param es: ",param1)
funcionConParam(123)

def funcionConReturn():
    return "ESTE ES EL RETURN"
print(funcionConReturn())

# Tupla --> es como una lista, pero que una vez dado sus valores no se podrán modificar
def funcionConMultiplesReturn():
    return 1,2,3,4
print(funcionConMultiplesReturn())

# "_" --> sirve para ignorar uno de los valores devueltos de la función
var,var1,var2,_ = funcionConMultiplesReturn()
print(var)
print(var1)
print(var2)
#print(var3)


# Sucesión de Fibonacci
def fibonacci(n):
    f=[0,1]
    r=0
    for x in range(0,n-1):
        r=f[x]+f[x+1]
        f.append(r)
    return f

print(fibonacci(10))

def fibonacciR(n):
    if n==0:
        return 0
    if n==1:
        return 1
    else:
        return fibonacciR(n-1)+fibonacciR(n-2)
    
print(fibonacciR(10))