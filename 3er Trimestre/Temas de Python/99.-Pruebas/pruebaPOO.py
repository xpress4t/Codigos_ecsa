class Persona:
    def __init__(self, nombre, apellido, edad):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
        
    def getDatos(self):
        print(f'Nombre: {self.nombre} Apellido: {self.apellido} Edad: {self.edad}')
        
persona_1 = Persona("Emmanuel","Cordova",24)
print(persona_1.getDatos())