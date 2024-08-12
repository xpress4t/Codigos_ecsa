package animales_solucion_Emmanuel;

public class Gato extends Animal{
	
	// Constructor que llama al de la clase base (Animal_1)
	
	public Gato(String nombre, int edad) {
		super(nombre,edad);
	}
	
	public void emitirSonido() {
		System.out.println("El gato dice miau");
	}
	
	public void arañar() {
		System.out.println("El gato araña");
	}
	

}
