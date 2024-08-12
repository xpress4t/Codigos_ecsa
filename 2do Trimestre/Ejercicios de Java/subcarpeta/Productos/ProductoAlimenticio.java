package Productos;

public class ProductoAlimenticio extends Producto {
    private String fechaCaducidad;

    public ProductoAlimenticio(String nombre, double precio, int cantidadDisponible, String fechaCaducidad) {
        super(nombre, precio, cantidadDisponible);
        this.fechaCaducidad = fechaCaducidad;
    }

    // Método específico para productos alimenticios
    public void verificarCaducidad() {
        System.out.println("Fecha de Caducidad: " + fechaCaducidad);
        // Lógica para verificar si el producto ha caducado
        // Podrías implementar aquí la lógica específica para verificar la caducidad.
    }
}
