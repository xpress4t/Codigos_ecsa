package casas_solucion_Emmanuel;

public class Atico extends Casa {
	private int numeroPisos;
	public Atico(String direccion, int numeroHabitaciones, double precio, int numeroPisos) {
		super(direccion, numeroHabitaciones, precio);
		this.numeroPisos=numeroPisos;
	}
	
	@Override
	public void mostrarInformacion() {
		System.out.println("<--------------------- Mi Ático ----------------------->");
		super.mostrarInformacion();
		System.out.println("Mi ático tiene "+numeroPisos+" pisos");
	}
	
}
