package empleados_solucion_Emmanuel;

public class Gerente extends Empleado{
	private String departamento;
	private int cantidadSubordinados;
	public Gerente(String nombre, int edad, double salario, String departamento, int cantidadSubordinados) {
		super(nombre, edad, salario);
		this.departamento=departamento;
		this.cantidadSubordinados=cantidadSubordinados;
	}
	
	public void asignarTareas() {
		
	}
	
	public void revisionDeDesempeño() {
		
	}
}
