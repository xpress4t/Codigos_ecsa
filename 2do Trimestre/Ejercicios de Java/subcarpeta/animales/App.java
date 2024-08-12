package animales;

public class App {

	public static void main(String[] args) {
        // Crear un gato y un perro
        Gato miGato = new Gato("Mittens", 3);
        Perro miPerro = new Perro("Rex", 2,"t-rex");

        // Llamar a los métodos de los animales
        System.out.println("Datos del gato:");
        System.out.println("Nombre: " + miGato.getNombre());
        System.out.println("Edad: " + miGato.getEdad());
        miGato.emitirSonido();
        miGato.arañar();
        miGato.comer();

        System.out.println();

        System.out.println("Datos del perro:");
        System.out.println("Nombre: " + miPerro.getNombre());
        System.out.println("Edad: " + miPerro.getEdad());
        System.out.println("Raza: " + miPerro.getRaza());
        miPerro.emitirSonido();
        miPerro.perseguirCola();
        miPerro.comer();
    }

}
