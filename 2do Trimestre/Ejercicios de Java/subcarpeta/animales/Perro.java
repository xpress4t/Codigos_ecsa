package animales;

public class Perro extends Animal {
	private String raza;
	
    public Perro(String nombre, int edad,String raza) {
        super(nombre, edad);
        this.raza=raza;
    }

    @Override
    public void emitirSonido() {
        System.out.println("El perro ladra.");
    }

    public void perseguirCola() {
        System.out.println("El perro persigue su cola.");
    }

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
    
}