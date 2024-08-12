package Productos;

public class ProductoElectronico extends Producto {
    private String marca;
    private String modelo;

    public ProductoElectronico(String nombre, double precio, int cantidadDisponible, String marca, String modelo) {
        super(nombre, precio, cantidadDisponible);
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    // Método específico para productos electrónicos
    public void mostrarInformacion() {
    	super.mostrarInformacion();
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
