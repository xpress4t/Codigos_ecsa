''''
Reglas del 3 en Raya.
El tablero consistirá en una matriz de 3x3 en el cual los jugadores irán jugando de
forma alternada, cada uno con sus piezas. El primer jugador será las piezas negras
y el segundo jugador será las piezas blancas.
El juego se detiene en el momento en que uno de los dos jugadores gane o no haya
más huecos libres donde colocar una pieza.
Condiciones de victoria:
- Gana el jugador que consiga poner 3 de sus fichas en las dos diagonales,
  en las horizontales o en las verticales
Condición de tablas:
- No hay más espacios para poner otra ficha.
Las funciones a realizar tienen que recibir un único parámetro que se llamará
tablero
'''
tablero3EnRaya1=[
    ['X','X','O'],
    [' ','X','O'],
    [' ',' ','O']
]
tablero3EnRaya2=[
    ['X','O','X'],
    ['O','X','O'],
    ['O','X','O']
]
tablero3EnRaya3=[
    ['X','X','O'],
    ['O','X','X'],
    ['O','O','X']
]

# Función para imprimir los tableros
def imprimirTableroTresEnRaya(tablero):
    for fila in tablero:
        print(fila)

# Función para verificar el ganador
def verificarGanador(tablero):
    for fila in tablero:
        if fila[0]==fila[1]==fila[2] and fila[0] != ' ':
            return fila[0]
    
    # Bucle for para verificar cada fila 
    for i in range(3):
        # [0][0] [0][1] [0][2] --> [0][i]
        # [1][0] [1][1] [1][2] --> [1][i]
        # [2][0] [2][1] [2][2] --> [2][i]
        if tablero[0][i]==tablero[1][i]==tablero[2][i] and tablero[0][i]!=' ':
            return tablero[0][i]
        
    # Verificando la primera diagonal
    
    # [0][0]        
    #        [1][1]      
    #               [2][2]
    if tablero[0][0]==tablero[1][1]==tablero[2][2] and tablero[0][0]!=' ':
        return tablero[0][0]
        
    # Verificando la segunda diagonal 
    
    #               [0][2] 
    #        [1][1]      
    # [2][0]        
    if tablero[0][2]==tablero[1][1]==tablero[2][0] and tablero[0][2]!=' ':
        return tablero[0][2]
    
    
    # Verificando el empate 
    empate=True
    for fila in tablero:
        for k in fila:
            if k==' ':
                empate=False
    if empate:
        return "¡Ni X ni O!"

for i in range(3):
    # Imprimiendo tableors
    print(f'tablero3EnRaya{i+1}:')
    
    imprimirTableroTresEnRaya(eval(f'tablero3EnRaya{i+1}'))
    ganadorTresEnRaya=verificarGanador(eval(f'tablero3EnRaya{i+1}'))
    
    # Mensaje indicando si al ganador
    if ganadorTresEnRaya:
        print(" ")
        print(f'El ganador es el jugador "{ganadorTresEnRaya}"')
        print(" ")