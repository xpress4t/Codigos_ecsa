package casas;

public class Atico extends Casa {
    private int numeroPisos;

    public Atico(String direccion, int numeroHabitaciones, double precio, int numeroPisos) {
        super(direccion, numeroHabitaciones, precio);
        this.numeroPisos = numeroPisos;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de Pisos: " + numeroPisos);
    }
}