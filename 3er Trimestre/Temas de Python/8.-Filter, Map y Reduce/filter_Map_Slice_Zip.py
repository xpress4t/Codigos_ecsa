rango_original = range(1, 6)
rango_duplicado = map(lambda x: x * 2, rango_original)  # Duplica cada número en el rango
print(list(rango_duplicado))

rango_original = range(1, 11)
rango_filtrado = filter(lambda x: x % 2 == 0, rango_original)  # Filtra los números pares
print(list(rango_filtrado))

rango1 = range(1, 6)
rango2 = range(6, 11)
for num1, num2 in zip(rango1, rango2):
    print(num1, num2)

rango_completo = range(1, 11)
sub_rango = slice(2, 7)  # Crea un sub-rango desde el índice 2 al 6
print(list(rango_completo[sub_rango]))

for numero in sorted(range(1, 11)):
    print(numero)

#map, filter y reviews junto con un ejercicio tipo como el examen de este
#
# una cuenta bancaria con lista de objetos y solo quiere cobrar a personas con menos de 10k euros
# primero que haria? un filter

lista = sum(list(range(1,10000,2)))
print(lista)