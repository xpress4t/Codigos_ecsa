package empleado_emprea;

import java.util.ArrayList; 
/*

Crear una clase llamada "Empresa"
	Funciones (métodos):
		Constructor: Un constructor que acepte 1 parámetro, el nombre de la empresa (cadena de caracteres),
			y lo utilice para inicializar el atributo de la clase.
		contratarEmpleado(Empleado): añado un empleado a la empresa
		despedirEmpleado(Empleado): en caso de que el empleado exista en la empresa llo despido,
		 	sino digo que no trabaja en esta empresa
		 mostrarListaEmpleados(): muestro todos los empleados de la lista
	Atributos:
		nombre: Almacena el nombre del producto como una cadena de caracteres.
		precio: Almacena el precio del producto como un número decimal (double).
		cantidadEnStock: Almacena la cantidad en stock del producto como un número entero (int).	  
*/


public class Empresa {
    // Atributos de la clase Empresa
    private String nombreEmpresa;
    private ArrayList<Empleado> listaEmpleados; // Lista de empleados de la empresa

    // Constructor de la clase Empresa
    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.listaEmpleados = new ArrayList<Empleado>(); // Inicializa la lista de empleados
    }

    // Método para agregar un empleado a la lista de empleados de la empresa
    public void contratarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
        System.out.println(empleado.getNombre() + " " + empleado.getApellido() + " ha sido contratado por " + nombreEmpresa);
    }

    // Método para despedir un empleado de la lista de empleados de la empresa
    public void despedirEmpleado(Empleado empleado) {
        if (listaEmpleados.contains(empleado)) {
            listaEmpleados.remove(empleado);
            System.out.println(empleado.getNombre() + " " + empleado.getApellido() + " ha sido despedido de " + nombreEmpresa);
        } else {
            System.out.println(empleado.getNombre() + " " + empleado.getApellido() + " no trabaja en " + nombreEmpresa);
        }
    }

    // Método para mostrar la lista de empleados de la empresa
    public void mostrarListaEmpleados() {
        System.out.println("Empleados de " + nombreEmpresa + ":");
        for (Empleado empleado : listaEmpleados) {
            System.out.println(empleado.getNombre() + " " + empleado.getApellido());
        }
    }


}
