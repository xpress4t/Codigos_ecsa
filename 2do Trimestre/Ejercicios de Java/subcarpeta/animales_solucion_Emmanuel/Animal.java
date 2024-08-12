package animales_solucion_Emmanuel;

public class Animal {
	private String nombre;
	private int edad;
	
	public Animal(String nombre,int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public void emitirSonido() {
		System.out.println("El animal emite sonido");
	}
	
	public void comer() {
		System.out.println("El animal come");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
