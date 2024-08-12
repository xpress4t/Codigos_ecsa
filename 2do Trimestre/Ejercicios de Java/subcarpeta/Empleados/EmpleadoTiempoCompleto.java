package Empleados;

public class EmpleadoTiempoCompleto extends Empleado {
    private double bonoAnual;
    private String tipoContrato;

    public EmpleadoTiempoCompleto(String nombre, int edad, double salario, double bonoAnual, String tipoContrato) {
        super(nombre, edad, salario);
        this.bonoAnual = bonoAnual;
        this.tipoContrato = tipoContrato;
    }

    // Métodos específicos para empleados a tiempo completo
    public void recibirBono() {
        System.out.println(getNombre() + " ha recibido un bono anual de $" + bonoAnual);
    }

    public void mostrarTipoContrato() {
        System.out.println(getNombre() + " tiene un contrato de tipo " + tipoContrato);
    }

    // Getters y setters específicos para empleados a tiempo completo
    public double getBonoAnual() {
        return bonoAnual;
    }

    public void setBonoAnual(double bonoAnual) {
        this.bonoAnual = bonoAnual;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
}
