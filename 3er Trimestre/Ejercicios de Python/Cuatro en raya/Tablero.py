from Ficha import Ficha
import random

def crearTablero():
    CuatroEnRaya=[
    ['[ ]','[ ]','[ ]','[ ]','[ ]','[ ]','[ ]'],
    ['[ ]','[ ]','[ ]','[ ]','[ ]','[ ]','[ ]'],
    ['[ ]','[ ]','[ ]','[ ]','[ ]','[ ]','[ ]'],
    ['[ ]','[ ]','[ ]','[ ]','[ ]','[ ]','[ ]'],
    ['[ ]','[ ]','[ ]','[ ]','[ ]','[ ]','[ ]'],
    ['[ ]','[ ]','[ ]','[ ]','[ ]','[ ]','[ ]']
    ]
    
    return CuatroEnRaya
    
class Tablero:
    
    def __init__(self):
        self.columnas = crearTablero()
        self.equipos = ("[X]","[O]")
        
        
    def imprimirTablero(self):
        for columns in range(len(self.columnas)):
            for fila in range(len(self.columnas[columns])):
                print(self.columnas[columns][fila], end=" ")
            print()
    
    def comprobarColumna(self,columna,equipo):
        for pos in range(len(self.columnas)-1,-1,-1):
            if self.columnas[pos][columna] == "[ ]":
                ficha = Ficha(equipo,pos,columna)
                return ficha
            
        return None
    
    def colocarFicha(self,ficha):
        print("Fila:",ficha.getposX(),"Columna:",ficha.getposY())
        self.columnas[ficha.getposX()][ficha.getposY()] = ficha.getrepresentacion()
           
    def comprobarVectores(self,fila,columns,equipo,vector):
        contador = 0
        for i in range(3):
            fila += vector[0]
            columns += vector[1]
            if columns < 7 and fila < 6 and columns > 0 and fila > 0:
                if self.columnas[fila][columns] != equipo:
                    break
                else:
                    contador += 1
            else:
                break
        
        if contador == 3:
            print("Vector:",vector)
            return True
        
    def comprobarGanador(self):
        vectores = [(1,0),(0,1),(1,1),(1,-1)]
        for columns in range(len(self.columnas)):
            for fila in range(len(self.columnas)-2):
                if self.columnas[fila][columns] == "[X]" or self.columnas[fila][columns] == "[O]":
                    for vector in vectores:
                        if self.comprobarVectores(fila,columns,self.columnas[fila][columns],vector):
                            return True
                 

CuatroenRaya = Tablero()
CuatroenRaya.imprimirTablero()
ganador = False
while(ganador == False):
    for j in CuatroenRaya.equipos:
        while(True):
            ficha = CuatroenRaya.comprobarColumna(random.randint(0,6),j)
            if ficha == None:
                print("no se puede jugar aqui")
            else:
                break
        CuatroenRaya.colocarFicha(ficha)
        CuatroenRaya.imprimirTablero()
        if CuatroenRaya.comprobarGanador():
            print("HAY GANADOR")
            ganador = True
            break