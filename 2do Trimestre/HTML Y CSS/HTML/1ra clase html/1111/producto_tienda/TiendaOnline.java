package producto_tienda;

import java.util.ArrayList;
import java.util.List;

/*
 
Crear una clase llamada "TiendaOnline"
	Funciones (métodos):
		Constructor: Un constructor que acepte un parámetro, el nombre de la tienda (cadena de caracteres),
			y lo utilice para inicializar el atributo de la clase.
		Método "agregarProducto": Un método llamado "agregarProducto" que acepte un objeto de tipo "Producto"
			como parámetro y lo agregue a la lista de productos disponibles en la tienda.
		Método "realizarCompra": Un método llamado "realizarCompra" que acepte el nombre de un producto (cadena de caracteres)
		 	y la cantidad deseada (entero) como parámetros. Este método debe verificar si el producto
		 	está disponible en la tienda y si hay suficiente cantidad en stock para realizar la compra.
		 	Si es así, debe restar la cantidad comprada del stock y calcular el costo total de la compra.
		Método "agregarStock": Un método llamado "agregarStock" que acepte el nombre de un producto (cadena de caracteres)
			y la cantidad a agregar al stock (entero) como parámetros.
			Este método debe aumentar la cantidad en stock del producto en la tienda.
		Método "listarProductosDisponibles": Un método llamado "listarProductosDisponibles"
			que no tome ningún parámetro y muestre en la consola la lista de productos disponibles en la tienda,
			incluyendo su nombre, precio y cantidad en stock.
		Métodos getters y setters de todos los atributos que lo necesiten
	Atributos:
		Un atributo llamado "nombreTienda" de tipo String para almacenar el nombre de la tienda.
		Una lista de productos disponibles en la tienda, donde cada producto es un objeto de tipo "Producto" que tiene nombre, precio y cantidad en stock. 
	  
*/



public class TiendaOnline {
    private String nombreTienda;
    private List<Producto> productosDisponibles;

    public TiendaOnline(String nombreTienda) {
        this.nombreTienda = nombreTienda;
        this.productosDisponibles = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productosDisponibles.add(producto);
    }

    public void realizarCompra(String nombreProducto, int cantidadDeseada) {
        for (Producto producto : productosDisponibles) {
            if (producto.getNombre().equals(nombreProducto)) {
                int stockActual = producto.getCantidadEnStock();
                if (cantidadDeseada <= stockActual) {
                    double costoTotal = cantidadDeseada * producto.getPrecio();
                    producto.setCantidadEnStock(stockActual - cantidadDeseada);
                    System.out.println("Compra realizada. Costo total: $" + costoTotal);
                    return;
                } else {
                    System.out.println("Error: No hay suficiente stock disponible.");
                    return;
                }
            }
        }
        System.out.println("Error: El producto no está disponible en la tienda.");
    }

    public void agregarStock(String nombreProducto, int cantidadAgregar) {
        for (Producto producto : productosDisponibles) {
            if (producto.getNombre().equals(nombreProducto)) {
                int stockActual = producto.getCantidadEnStock();
                producto.setCantidadEnStock(stockActual + cantidadAgregar);
                System.out.println("Stock actualizado. Nuevo stock: " + producto.getCantidadEnStock());
                return;
            }
        }
        System.out.println("Error: El producto no está disponible en la tienda.");
    }

    public void listarProductosDisponibles() {
        System.out.println("Productos disponibles en la tienda:");
        for (Producto producto : productosDisponibles) {
            System.out.println("- Nombre: " + producto.getNombre() + ", Precio: $" + producto.getPrecio() + ", Stock: " + producto.getCantidadEnStock());
        }
    }

    public String obtenerNombreTienda() {
        return nombreTienda;
    }
}
