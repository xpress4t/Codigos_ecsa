nombre = "miguel"

class Humano:
    def __init__(self, nombre, apellidos, edad,dni):
        self.nombre = nombre
        self.apellidos = apellidos
        self.edad = edad
        # Si ponemos doble barra baja "__" antes del nombre, lo convertimos a privado
        self.__DNI = dni

class Persona(Humano):
    def __init__(self, nombre, apellidos, edad, dni):
        super().__init__(nombre, apellidos, edad, dni)

    def decirHola(self):
        print(f'Hola me llamo {self.nombre}')

    def __str__(self):
        return "Nombre: "+self.nombre+", apellidos: "+self.apellidos+", edad: "+str(self.edad)

    def __eq__(self, value):
        # pass --> que no está implementado
        return self.apellidos == value.apellidos and isinstance(self, Persona) == isinstance(value, Persona)


# El new en Python no nos sirve como en Java
p1 = Persona("Pepito", "Cordova Muñoz", 24, "oqwepoq")
p2 = Persona("Emmanuel", "Cordova Muñoz", 24, "eh87h3")
p1.decirHola()
p2.decirHola()
print(p1)
# Si ejecuto el print(p1.__DNI) me dará un error ya que lo puse en privado
# print(p1.__DNI)
print(p2)
# Este print p2==p1 modifica a la funcion "def __eq__(self,value):"
print(p2==p1)