'''
Reglas del sudoku.
Este es un juego de un único jugador. El tablero es de 9x9 en el cual cada casilla
contendrá un número del 1-9.
Condiciones de victoria (una vez rellenados todos los espacios):
- Todo el tablero debe tener números
- De forma individual, cada vertical, debe tener todos los números del 1 al 9.
  Dicho de otra forma, no puede haber número repetidos.
- De forma individual, cada horizontal, debe tener todos los números del 1 al 9. 
  Dicho de otra forma, no puede haber número repetidos.
- Cada región de 3x3 del tablero tiene no puede tener números repetidos y
  tiene que tener todos los números del 1 al 9.
Las funciones a realizar tienen que recibir un único parámetro que se llamará
tablero
'''
tableroSudoku1=[
    [5,3,4,6,7,8,9,1,2],
    [6,7,2,1,9,5,3,4,8],
    [1,9,8,3,4,2,5,6,7],
    [8,5,9,7,6,1,4,2,3],
    [4,2,6,8,5,3,7,9,1],
    [7,1,3,9,2,4,8,5,6],
    [9,6,1,5,3,7,2,8,4],
    [2,8,7,4,1,9,6,3,5],
    [3,4,5,2,8,6,1,7,9]
]
tableroSudoku2=[
    [5,3,9,8,7,6,4,1,2],
    [7,2,8,3,1,4,9,6,5],
    [6,4,1,2,9,5,7,3,8],
    [4,6,2,5,3,9,8,7,1],
    [3,8,5,7,2,1,6,4,9],
    [1,9,7,4,6,8,2,5,3],
    [2,5,6,1,8,7,3,9,4],
    [9,1,3,6,4,2,5,8,7],
    [8,7,4,9,5,3,1,2,6]
]
tableroSudoku3=[
    [5,3,9,8,7,6,4,1,1],
    [7,2,8,3,1,4,9,6,5],
    [6,4,1,2,4,5,7,3,8],
    [4,6,2,5,3,9,8,7,1],
    [3,8,5,7,2,1,6,4,9],
    [1,9,7,4,6,8,2,5,3],
    [2,5,6,1,8,3,3,9,4],
    [9,1,3,6,4,2,5,8,7],
    [8,7,4,9,5,3,1,2,6]
]

def imprimirTableroSudoku(tablero):
    for fila in tablero:
        print(fila)
        
def verificarSolucion(tablero):
    for i in range(0,9,3):
        for j in range(0,9,3):
            matriz_3x3=[tablero[x][y] for x in range(i,i+3) for y in range(j,j+3)]
            if len(set(matriz_3x3))!=9:
                print(" ")
                return "Resolviste mal el Sudoku, hay errores en los cuadros de 3x3"
    print(" ")      
    return "Resolviste bien el Sudoku :)"  

for i in range(3):
    print(" ")
    print(f'tableroSudoku{i+1}:')
    imprimirTableroSudoku(eval(f'tableroSudoku{i+1}'))
        
    # Para mostrar el mensaje si está bien o mal resuelto
    bienResuelto=verificarSolucion(eval(f'tableroSudoku{i+1}'))
    if bienResuelto:
        print(f'{bienResuelto}')