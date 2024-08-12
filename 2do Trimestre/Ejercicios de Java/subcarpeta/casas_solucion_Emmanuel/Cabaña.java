package casas_solucion_Emmanuel;

public class Cabaña extends Casa {
	private boolean tieneChimenea;
	public Cabaña(String direccion, int numeroHabitaciones, double precio, boolean tieneChimenea) {
		super(direccion, numeroHabitaciones, precio);
		
	}
	
	@Override
	public void mostrarInformacion() {
		System.out.println("<--------------------- Mi Cabaña ----------------------->");
		super.mostrarInformacion();
		System.out.println("Mi cabaña tiene chimnenea "+tieneChimenea);
	}
	
	
}
