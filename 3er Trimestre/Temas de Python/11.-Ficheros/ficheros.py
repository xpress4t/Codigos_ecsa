# acceso de base de dattos
# escritura de ficheros para trimestral en java
import string as s
'''
r para abrir un fichero en modo lectura
w para escribir un fichero (con la w me cargo lo que hay y añado algo)
a para agregar texto (si el fichero no existe, entonces lo crea)
'''
print(s.punctuation)
try:
    with open("./ejemplo.txt","w") as archivo:
        archivo.write("Hola buenas días!\n")
        while True:
            archivo.write(s.punctuation+"\n")
            print("Se ha escrito de forma correcta en el fichero")
except IOError as e:
    print("Error en la escritura del archivo"+str(e))
    
    
try:
    with open("./ejemplo.txt","a") as archivo:
        archivo.write("Hola buenas días!\n")
        print("Se ha escrito de forma correcta en el fichero")
except IOError as e:
    print("Error en la escritura del archivo"+str(e))
    
    
try:
    with open("./ejemplo.txt","r") as archivo:
        print(archivo.read())
        print("Se ha escrito de forma correcta en el fichero")
except IOError as e:
    print("Error en la escritura del archivo"+str(e))