package casas_solucion_Emmanuel;

public class Chalet extends Casa {
	private int tamañoJardin;
	public Chalet(String direccion, int numeroHabitaciones, double precio,int tamañoJardin) {
		super(direccion, numeroHabitaciones, precio);
		this.tamañoJardin=tamañoJardin;
	}
	
	@Override
	public void mostrarInformacion() {
		System.out.println("<--------------------- Mi Chalet ----------------------->");
		super.mostrarInformacion();
		System.out.println("Mi chalet tiene un jardín de "+tamañoJardin+" metros cuadrados");
	}
	
	public void mostrarPiscina() {
		System.out.println("Mi chalet tiene piscina");
	}
}
