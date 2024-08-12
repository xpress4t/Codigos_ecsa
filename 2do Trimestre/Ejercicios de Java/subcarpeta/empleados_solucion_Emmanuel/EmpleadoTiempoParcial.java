package empleados_solucion_Emmanuel;

public class EmpleadoTiempoParcial extends Empleado {
	private int horasTrabajadas;
	private double tarifaPorHora;
	public EmpleadoTiempoParcial(String nombre, int edad, double salario,int horasTrabajadas,double tarifaPorHora) {
		super(nombre, edad, salario);
		this.horasTrabajadas=horasTrabajadas;
		this.tarifaPorHora=tarifaPorHora;
	}
	
	public void horasTrabajadasEnTotal() {
		
	}
	
	public void salarioEnFuncionDeHoras() {
		
	}
}
