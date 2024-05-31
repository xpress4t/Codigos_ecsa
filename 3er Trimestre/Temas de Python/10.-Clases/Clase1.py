class Rectangulo:
    def __init__(self,ancho,alto):
        self.ancho = ancho
        self.alto = alto
        
    def area(self):
        return f'El area del retangulo es: {self.ancho * self.alto}'
    
x = Rectangulo(4,5)
print(x.area())