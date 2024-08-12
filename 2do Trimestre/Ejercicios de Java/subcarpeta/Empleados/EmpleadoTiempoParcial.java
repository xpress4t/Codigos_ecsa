package Empleados;

public class EmpleadoTiempoParcial extends Empleado {
    private int horasTrabajadasPorSemana;
    private double salarioPorHora;

    public EmpleadoTiempoParcial(String nombre, int edad, int horasTrabajadasPorSemana, double salarioPorHora) {
        super(nombre, edad, 0); // El salario se calcula en función de las horas trabajadas y el salario por hora
        this.horasTrabajadasPorSemana = horasTrabajadasPorSemana;
        this.salarioPorHora = salarioPorHora;
    }

    // Métodos específicos para empleados a tiempo parcial
    public void calcularSalario() {
        double salario = horasTrabajadasPorSemana * salarioPorHora;
        setSalario(salario);
        System.out.println(getNombre() + " ha ganado $" + salario + " esta semana.");
    }

    public void mostrarHorasTrabajadas() {
        System.out.println(getNombre() + " trabaja " + horasTrabajadasPorSemana + " horas por semana.");
    }

    // Getters y setters específicos para empleados a tiempo parcial
    public int getHorasTrabajadasPorSemana() {
        return horasTrabajadasPorSemana;
    }

    public void setHorasTrabajadasPorSemana(int horasTrabajadasPorSemana) {
        this.horasTrabajadasPorSemana = horasTrabajadasPorSemana;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }
}
