package animales_solucion_Emmanuel;

public class Perro extends Animal {
	
	private String raza;
	
	public Perro(String nombre,int edad,String raza) {
		super(nombre,edad);
		this.raza=raza;
	}
	
	public void emitirSonido() {
		System.out.println("El perro dice woof");
	}
	
	public void perseguirCola() {
		System.out.println("El perro persigue su cola");
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
}
