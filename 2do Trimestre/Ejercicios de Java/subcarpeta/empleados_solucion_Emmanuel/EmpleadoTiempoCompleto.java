package empleados_solucion_Emmanuel;

public class EmpleadoTiempoCompleto extends Empleado {
	private double bonoAnual;
	private String tipoContrato;
	public EmpleadoTiempoCompleto(String nombre, int edad, double salario, double bonoAnual, String tipoContrato) {
		super(nombre, edad, salario);
		this.bonoAnual=bonoAnual;
		this.tipoContrato=tipoContrato;
	}
	
	public void recibirBono() {
		
	}

}
