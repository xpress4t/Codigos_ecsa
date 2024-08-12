package Empleados;

public class App {
	 public static void main(String[] args) {
	        // Crear un empleado a tiempo completo
	        EmpleadoTiempoCompleto empleadoTiempoCompleto = new EmpleadoTiempoCompleto("Juan", 35, 50000.0, 2000.0, "Contrato Fijo");

	        // Crear un empleado a tiempo parcial
	        EmpleadoTiempoParcial empleadoTiempoParcial = new EmpleadoTiempoParcial("María", 28, 20, 15.0);

	        // Crear un gerente
	        Gerente gerente = new Gerente("Carlos", 40, 60000.0, "Ventas", 5);

	        // Mostrar información de los empleados
	        System.out.println("Información del Empleado a Tiempo Completo:");
	        empleadoTiempoCompleto.mostrarInformacion(); // Método de la clase base
	        empleadoTiempoCompleto.mostrarTipoContrato(); // Método específico
	        empleadoTiempoCompleto.recibirBono(); // Método específico

	        System.out.println("\nInformación del Empleado a Tiempo Parcial:");
	        empleadoTiempoParcial.mostrarInformacion(); // Método de la clase base
	        empleadoTiempoParcial.mostrarHorasTrabajadas(); // Método específico
	        empleadoTiempoParcial.calcularSalario(); // Método específico

	        System.out.println("\nInformación del Gerente:");
	        gerente.mostrarInformacion(); // Método de la clase base
	        gerente.asignarTareas(); // Método específico
	        gerente.realizarRevisiones(); // Método específico	    }
}}
