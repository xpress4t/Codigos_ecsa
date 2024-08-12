package casas;

public class Cabaña extends Casa {
    private boolean tieneChimenea;

    public Cabaña(String direccion, int numeroHabitaciones, double precio, boolean tieneChimenea) {
        super(direccion, numeroHabitaciones, precio);
        this.tieneChimenea = tieneChimenea;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        if (tieneChimenea) {
            System.out.println("Esta cabaña tiene una chimenea.");
        } else {
            System.out.println("Esta cabaña no tiene chimenea.");
        }
    }
}
