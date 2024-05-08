class Ficha:
    
    def __init__(self,representacion,posX,posY):
        self.representacion = representacion
        self.posX = posX
        self.posY = posY
        
    def getposX(self):
        return self.posX
    
    def getposY(self):
        return self.posY
    
    def getrepresentacion(self):
        return self.representacion