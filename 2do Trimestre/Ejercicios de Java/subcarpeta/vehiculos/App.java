package vehiculos;

public class App {
	public static void main(String[] args) {
        // Crear un vehículo, un automóvil y una motocicleta
        Vehiculo miVehiculo = new Vehiculo("Toyota", "Corolla", 2022);
        Automovil miAutomovil = new Automovil("Ford", "Focus", 2023, 4);
        Motocicleta miMotocicleta = new Motocicleta("Honda", "CBR600RR", 2021, "Deportiva");

        // Mostrar información de los vehículos
        System.out.println("Datos de mi Vehículo:");
        miVehiculo.mostrarInformacion();
        System.out.println();

        System.out.println("Datos de mi Automóvil:");
        miAutomovil.mostrarInformacion();
        miAutomovil.arrancar();
        System.out.println();

        System.out.println("Datos de mi Motocicleta:");
        miMotocicleta.mostrarInformacion();
        miMotocicleta.acelerar();
    }
}
