package casas_solucion_Emmanuel;

public class Casa {
	private String direccion;
	private int numeroHabitaciones;
	private double precio;
	
	public Casa(String direccion,int numeroHabitaciones,double precio) {
		this.direccion=direccion;
		this.numeroHabitaciones=numeroHabitaciones;
		this.precio=precio;
	}

	public void mostrarInformacion() {
		System.out.println("Dirección: "+direccion);
		System.out.println("Número de habitaciones: "+numeroHabitaciones);
		System.out.println("Precio: "+precio+"0 €");
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	public void setNumeroHabitaciones(int numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
