package Empleados;

public class Empleado {
    // Atributos comunes a todos los empleados
    private String nombre;
    private int edad;
    private double salario;
    
    // Constructor
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    // Métodos comunes a todos los empleados
    public void trabajar() {
        System.out.println(nombre + " está trabajando.");
    }
    
    public void descansar() {
        System.out.println(nombre + " está descansando.");
    }
    
    public void calcularSalario() {
        System.out.println("El salario de " + nombre + " es $" + salario);
    }
    
    // Getters y setters
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
    public void mostrarInformacion() {
    	System.out.println("Nombre: "+ this.nombre);
    	System.out.println("Edad: "+this.edad);
    	System.out.println("Salario: "+ this.salario);
    	
    }
}
