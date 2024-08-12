package empleados_solucion_Emmanuel;

public class App {

	public static void main(String[] args) {
		
		// OBJETOS
		EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto(null, 0, 0, 0, null);
		EmpleadoTiempoParcial empleado2 = new EmpleadoTiempoParcial(null, 0, 0, 0, 0);
		Gerente gerente1 = new Gerente(null, 0, 0, null, 0);
		
		System.out.println("Información del empleado");
		empleado1.mostrarInformacion();

	}

}
