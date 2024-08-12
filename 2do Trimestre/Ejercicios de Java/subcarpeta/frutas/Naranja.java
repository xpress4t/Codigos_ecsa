package frutas;

public class Naranja extends Fruta{
	
	private int numGajos;
	public Naranja(int numGajos) {
		super("naranja","naranja",800,false);
		this.numGajos=numGajos;
	}
	
	public void info() { // Al mover super.info(); de una linea a otra altera lo que aparece en consola
		System.out.println("La naranja tiene este número de gajos "+this.numGajos);
		super.info();
	}
	
}
