package empleados_solucion_Emmanuel;

public class Empleado {
	private String nombre;
	private int edad;
	private double salario;
	
	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	public void trabajar() {
		System.out.println("El empleado trabaja");
	}
	
	public void descansar() {
		System.out.println("El empleado descansa los findes");
	}
	
	public void calcularSalario() {
		System.out.println();
	}
	
	public void mostrarInformacion() {
		System.out.println();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
