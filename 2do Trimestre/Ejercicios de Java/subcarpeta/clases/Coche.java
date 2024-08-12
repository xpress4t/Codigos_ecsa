package clases;

public class Coche {
	public int mumPuertas;
	public String marca;
	public int numRuedas;
	public String color;
	public boolean ventanasTintadas;
	public int numAsientos;
	public boolean tieneRemolque;
	
	/*
	 * Se llama constructor vacio
	 * public Coche(){
	 * }
	 */
	
	public Coche() {
		
	}
	
	public Coche(int numPuertas,String marca,int numRuedas,String color,boolean ventanasTintadas,int numAsientos,boolean tieneRemolque) {
		// hace referencia a la propia clase, concretamente a las clases
		this.color=color; 
		this.marca=marca;
		this.numRuedas=numRuedas;
		this.mumPuertas=numPuertas;
		this.ventanasTintadas=ventanasTintadas;
		this.numAsientos=numAsientos;
		this.tieneRemolque=tieneRemolque;
	}
	
}
