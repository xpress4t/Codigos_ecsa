package clases;
/* 
 
 Crear una clase llamada "Persona"
	Funciones (métodos):
		Constructor: Un constructor que acepte dos parámetros, el nombre (cadena de caracteres) y la edad (entero), y los utilice para inicializar los atributos de la clase.
		Método "saludar": Un método llamado "saludar" que no tome ningún parámetro y muestre un mensaje de saludo en la consola, incluyendo el nombre de la persona.
		Método "cumplirAnios": Un método llamado "cumplirAnios" que incremente la edad de la persona en 1 año cada vez que se llama.
		Métodos getters y setters de todos los atributos
	Atributos:	
		Un atributo llamado "nombre" de tipo String para almacenar el nombre de la persona.
		Un atributo llamado "edad" de tipo entero para almacenar la edad de la persona.
	 	Un atributo llamado "sexo" de tipo booleano. 
  */

public class Persona {
	private String nombre;
	private int edad;
	private boolean sexo;

	public Persona(String nombre, int edad, boolean sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo=sexo;
	}

	public void saludar() {
		System.out.println("Hola, mi nombre es " + nombre);
	}

	public void cumplirAnios() {
		edad++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	public boolean getSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	
}
