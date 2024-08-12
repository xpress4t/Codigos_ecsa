package casas;

public class App {

	public static void main(String[] args) {
        // Crear una casa, un chalet, una cabaña y un ático
        Casa miCasa = new Casa("123 Calle Principal", 3, 250000.0);
        Chalet miChalet = new Chalet("456 Avenida del Bosque", 4, 500000.0, 1000);
        Cabaña miCabaña = new Cabaña("789 Camino de la Montaña", 2, 150000.0, true);
        Atico miAtico = new Atico("101 Paseo de la Ciudad", 1, 200000.0, 2);

        // Mostrar información de las propiedades
        System.out.println("Datos de mi Casa:");
        miCasa.mostrarInformacion();
        System.out.println();

        System.out.println("Datos de mi Chalet:");
        miChalet.mostrarInformacion();
        miChalet.mostrarPiscina();
        System.out.println();

        System.out.println("Datos de mi Cabaña:");
        miCabaña.mostrarInformacion();
        System.out.println();

        System.out.println("Datos de mi Ático:");
        miAtico.mostrarInformacion();
    }

}
