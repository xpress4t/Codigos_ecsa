import random as x
import string as s

print("Letras en mayúsculas: ",s.ascii_uppercase)
print("---------------------------------------------")

print("Letras en minúsculas: ",s.ascii_lowercase)
print("---------------------------------------------")

print("Todos las letras: ",s.ascii_letters)
print("---------------------------------------------")

print("Todos los números Hexadecimal: ",s.hexdigits)
print("---------------------------------------------")

print("Todas las formas de representar un espacio: ",list(s.whitespace))
print("---------------------------------------------")

print("Signos de puntuación: ",s.punctuation)
print("---------------------------------------------")

print("Para que cada palabra de la oración empiece con una mayúscula: ",s.capwords("esta es una frase"))
print("---------------------------------------------")

print("Número aleatorio entre [0,1> ==> ",x.random())
print("---------------------------------------------")

print("Números aleatorios entre 2 valores ==> ",x.randint(1,2))
print("---------------------------------------------")

print("Valor aleatorio dentro de un rango (1,20,3) ==> ",x.randrange(1,20,3))
print("---------------------------------------------")

print("Genera un número aleatorio en el rango de [1.5,4.5] ==> ",x.uniform(1.5,4.5))
print("---------------------------------------------")

poblacion = ['a','b','c','d','e']
print("Devuelve una lista de k elementos únicos seleccionados aleatoriamente de la población especificada ==> ",x.sample(poblacion,3))
print("---------------------------------------------")

poblacion = ['a', 'b', 'c', 'd']
pesos = [0.1, 0.2, 0.3, 0.4]
print(x.choices(poblacion, weights=pesos, k=3))
print("---------------------------------------------")

lst = list(s.ascii_letters) 
print("Devuelve un elemento aleatorio de la secuencia ==> ",x.choice(lst))
print("---------------------------------------------")

x.shuffle(lst)
print(lst)
print("---------------------------------------------")

print(x.choices([1,2,3,4,5],[80,5,5,5,5],k=10))
# La k es para que me diga el número de eventos, o sea si quiero hacer un 
# lanzamiento de monedas 
print(x.choices(['C','S'],[50,50],k=200))

print(x.uniform(5,10))