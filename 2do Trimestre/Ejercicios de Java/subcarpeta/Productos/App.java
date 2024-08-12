package Productos;

public class App {
	 public static void main(String[] args) {
	        // Crear un producto electrónico
	        ProductoElectronico laptop = new ProductoElectronico("Laptop", 799.99, 10, "Dell", "XPS 15");
	        
	        // Crear un producto alimenticio
	        ProductoAlimenticio leche = new ProductoAlimenticio("Leche", 2.49, 20, "01/02/2024");
	        
	        // Mostrar información del producto electrónico
	        System.out.println("Información del Producto Electrónico:");
	        laptop.mostrarInformacion(); // Método de la clase base pero que está sobreescrito
	        
	        // Mostrar información del producto alimenticio
	        System.out.println("\nInformación del Producto Alimenticio:");
	        leche.mostrarInformacion();   // Método de la clase base
	        leche.verificarCaducidad();   // Método de la subclase
	    }
}
