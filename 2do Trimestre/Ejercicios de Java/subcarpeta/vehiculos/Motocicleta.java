package vehiculos;

public class Motocicleta extends Vehiculo {
    private String tipo;

    public Motocicleta(String marca, String modelo, int añoFabricacion, String tipo) {
        super(marca, modelo, añoFabricacion);
        this.tipo = tipo;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo de Motocicleta: " + tipo);
    }

    public void acelerar() {
        System.out.println("La motocicleta está acelerando.");
    }
}