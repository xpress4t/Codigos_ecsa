package frutas;

public class Fruta {
	private String nombre;
	private String color;
	private double peso;
	private boolean semilla;
	
	public Fruta(String nombre,String color,double peso, boolean semilla) {
		this.nombre=nombre;
		this.color=color;
		this.peso=0.0;
		this.semilla=semilla;
	}
	
	
	public void info() {
		System.out.println("La fruta se llama "+nombre);
		System.out.println("La fruta es de color "+color);
		System.out.println("La fruta tiene un peso de "+peso);
		System.out.println("La fruta tiene semilla "+semilla);
	}
}
