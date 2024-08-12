package vehiculos;

public class Automovil extends Vehiculo {
    private int numeroPuertas;

    public Automovil(String marca, String modelo, int añoFabricacion, int numeroPuertas) {
        super(marca, modelo, añoFabricacion);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de Puertas: " + numeroPuertas);
    }

    public void arrancar() {
        System.out.println("El automóvil está arrancando.");
    }
}
