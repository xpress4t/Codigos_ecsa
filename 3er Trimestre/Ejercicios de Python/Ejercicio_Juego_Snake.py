import random as rd

pos = [(0, 1), (0, -1), (1, 0), (-1, 0), (0, 1)]
serpiente = [[0, 0], [0, 1], [0, 2], [0, 3]]

def posValida(posVector):
    nuevaCabeza = serpiente[::-1][0].copy()
    nuevaCabeza[0] += posVector[0]
    nuevaCabeza[1] += posVector[1]
    # que la posición X este dentro del tablero
    # que la posición Y este dentro del tablero
    # que no se coma el cuerpo pero si la cola
    if (0 <= nuevaCabeza[0] < 8 and 0 <= nuevaCabeza[1] < 8
            and (nuevaCabeza not in serpiente or nuevaCabeza == serpiente[0])):
        return True, nuevaCabeza
    else:
        return False, nuevaCabeza

def imprimir():
    tablero = []
    for x in range(0, 8):
        aux = [' '] * 8
        tablero.append(aux)
    tablero[serpiente[0][0]][serpiente[0][1]] = "<"
    tablero[serpiente[1][0]][serpiente[1][1]] = "="
    tablero[serpiente[2][0]][serpiente[2][1]] = "="
    tablero[serpiente[3][0]][serpiente[3][1]] = "0"
    for x in range(0, 8):
        print(tablero[x])

def mover(posVector):
    valido, nuevaCabeza = posValida(posVector)
    if valido:
        serpiente.append(nuevaCabeza)
        serpiente.pop(0)
        imprimir()
        print()

for x in range(100):
    mover(pos[rd.randrange(4)])
