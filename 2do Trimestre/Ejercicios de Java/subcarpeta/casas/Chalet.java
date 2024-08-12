package casas;

public class Chalet extends Casa {
    private int tamañoJardin;

    public Chalet(String direccion, int numeroHabitaciones, double precio, int tamañoJardin) {
        super(direccion, numeroHabitaciones, precio);
        this.tamañoJardin = tamañoJardin;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tamaño del Jardín: " + tamañoJardin + " metros cuadrados");
    }

    public void mostrarPiscina() {
        System.out.println("Este chalet tiene una piscina.");
    }
}