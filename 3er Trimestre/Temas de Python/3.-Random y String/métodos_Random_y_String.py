import random
import string

print("Letras en mayúsculas",string.ascii_uppercase)
print("---------------------------------------------")
print("Letras en minúsculas",string.ascii_lowercase)
print("---------------------------------------------")
print("Todos los números",string.ascii_letters)
print("---------------------------------------------")
print("Todos los números Hexadecimal",string.hexdigits)
print("---------------------------------------------")
print("Todas las formas de representar un espacio",list(string.whitespace))
print("---------------------------------------------")
print("Signos de puntuación",string.punctuation)
print("---------------------------------------------")
print(string.capwords("esta es una frase"))

print("---------------------------------------------")

print("Número aleatorio entre [0,1>",random.random())
print("---------------------------------------------")
print("Números aleatorios entre 2 valores ==> ",random.randint(1,2))
print("---------------------------------------------")
print("Valor aleatorio dentro de un rango ==> ",random.randrange(1,20,3))
print("---------------------------------------------")

lst = list(string.ascii_letters) 
print(random.choice(lst))

print("---------------------------------------------")

random.shuffle(lst)
print(lst)
print("---------------------------------------------")

print(random.choices([1,2,3,4,5],[80,5,5,5,5],k=10))
# La k es para que me diga el número de eventos, o sea si quiero hacer un 
# lanzamiento de monedas 
print(random.choices(['C','S'],[50,50],k=200))

print(random.uniform(5,10))