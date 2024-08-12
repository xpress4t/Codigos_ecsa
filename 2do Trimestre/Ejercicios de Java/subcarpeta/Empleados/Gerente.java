package Empleados;

public class Gerente extends Empleado {
    private String departamento;
    private int cantidadSubordinados;

    public Gerente(String nombre, int edad, double salario, String departamento, int cantidadSubordinados) {
        super(nombre, edad, salario);
        this.departamento = departamento;
        this.cantidadSubordinados = cantidadSubordinados;
    }

    // Métodos específicos para un gerente
    public void asignarTareas() {
        System.out.println("El gerente " + getNombre() + " está asignando tareas a sus subordinados.");
    }

    public void realizarRevisiones() {
        System.out.println("El gerente " + getNombre() + " está realizando revisiones de desempeño.");
    }

    // Getters y setters específicos para un gerente
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getCantidadSubordinados() {
        return cantidadSubordinados;
    }

    public void setCantidadSubordinados(int cantidadSubordinados) {
        this.cantidadSubordinados = cantidadSubordinados;
    }
}
