for indice, valor in enumerate(range(1, 11)):
    print("Índice:", indice, "Valor:", valor)

for numero in reversed(range(1, 11)):
    print(numero)

minimo = min(range(1, 11))
maximo = max(range(1, 11))
print("Valor mínimo en el rango:", minimo)
print("Valor máximo en el rango:", maximo)

longitud = len(range(1, 11))
print("Longitud del rango:", longitud)

rango_completo = range(1, 11)
sub_rango = slice(2, 7)  # Crea un sub-rango desde el índice 2 al 6
print(list(rango_completo[sub_rango]))

rango1 = range(1, 6)
rango2 = range(6, 11)
rango3 = range(11,16)
for num1, num2, num3 in zip(rango1, rango2, rango3):
    print(num1, num2, num3)

rango_original = range(1, 11)
rango_filtrado = filter(lambda x: x % 2 == 0, rango_original)  # Filtra los números pares
print(list(rango_filtrado))

rango_original = range(1, 6)
rango_duplicado = map(lambda x: x * 2, rango_original)  # Duplica cada número en el rango
print(list(rango_duplicado))