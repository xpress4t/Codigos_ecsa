from functools import reduce
numeros = [1,2,3,4,5,6,7,8,9,10]

# for dentro de un lambda
# [fila for fila in t]


# def f(x):
#    return x>2 and x<10

print(list(filter(lambda x: x%2==0,numeros)))
print(list(filter(lambda x: x%2==0 and x>5,numeros)))
print(list(map(lambda x: x+1,numeros)))

sumar1 = lambda x:x+1

print(list(map(sumar1,numeros)))

print(sumar1(1))