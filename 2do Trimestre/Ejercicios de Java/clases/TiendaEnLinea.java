package clases;

import java.util.HashMap;
import java.util.Map;
/*
 Propiedades de Clase:
	inventario: Un mapa que almacena los productos disponibles y su cantidad en stock.
	precios: Un mapa que mantiene los precios de los productos en el inventario.
	carrito: Un mapa que representa el carrito de compras actual.
	saldoTotal: Un valor que registra el saldo total acumulado por las ventas.
	
	
Funciones:
	agregarProducto(String producto, int cantidad, double precio): 
		Agrega un producto al inventario con una cantidad inicial y un precio.

	agregarAlCarrito(String producto, int cantidad): 
		Agrega un producto al carrito de compras.
	
	mostrarCarrito(): 
		Muestra el contenido actual del carrito de compras.

	calcularTotal():
		Calcula el precio total de los productos en el carrito.

	procesarPago(double monto): 
		Procesa el pago y actualiza el saldo de la tienda.

	mostrarSaldoTotal(): 
		Muestra el saldo total acumulado por todas las ventas.

	eliminarDelCarrito(String producto, int cantidad):
	 	Elimina un producto específico del carrito.

	vaciarCarrito():
	 	Elimina todos los productos del carrito de compras.

	ajustarPrecio(String producto, double nuevoPrecio):
	 	Ajusta el precio de un producto en el inventario.

 * */
public class TiendaEnLinea {
    private Map<String, Integer> inventario;
    private Map<String, Double> precios;
    private Map<String, Integer> carrito;
    private double saldoTotal;

    public TiendaEnLinea() {
        inventario = new HashMap<>();
        precios = new HashMap<>();
        carrito = new HashMap<>();
        saldoTotal = 0;
    }

    public void agregarProducto(String producto, int cantidad, double precio) {
        inventario.put(producto, cantidad);
        precios.put(producto, precio);
    }

    public void agregarAlCarrito(String producto, int cantidad) {
        if (inventario.containsKey(producto)) {
            int stockDisponible = inventario.get(producto);
            if (stockDisponible >= cantidad) {
                if (carrito.containsKey(producto)) {
                    int cantidadActual = carrito.get(producto);
                    carrito.put(producto, cantidadActual + cantidad);
                } else {
                    carrito.put(producto, cantidad);
                }
                inventario.put(producto, stockDisponible - cantidad);
                System.out.println(cantidad + " unidades de " + producto + " agregadas al carrito.");
            } else {
                System.out.println("No hay suficiente stock de " + producto + ".");
            }
        } else {
            System.out.println("El producto " + producto + " no está en el inventario.");
        }
    }

    public void mostrarCarrito() {
        System.out.println("Carrito de compras:");
        for (Map.Entry<String, Integer> entry : carrito.entrySet()) {
            String producto = entry.getKey();
            int cantidad = entry.getValue();
            double precioUnitario = precios.get(producto);
            double subtotal = cantidad * precioUnitario;
            System.out.println(producto + " - Cantidad: " + cantidad + " - Precio unitario: $" + precioUnitario + " - Subtotal: $" + subtotal);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Map.Entry<String, Integer> entry : carrito.entrySet()) {
            String producto = entry.getKey();
            int cantidad = entry.getValue();
            double precioUnitario = precios.get(producto);
            total += cantidad * precioUnitario;
        }
        return total;
    }
    public void vaciarCarrito() {
        carrito.clear();
        System.out.println("El carrito ha sido vaciado.");
    }
    public void ajustarPrecio(String producto, double nuevoPrecio) {
        if (precios.containsKey(producto)) {
            precios.put(producto, nuevoPrecio);
            System.out.println("El precio de " + producto + " ha sido ajustado a $" + nuevoPrecio);
        } else {
            System.out.println("El producto " + producto + " no está en el inventario.");
        }
    }
    public void eliminarDelCarrito(String producto, int cantidad) {
        if (carrito.containsKey(producto)) {
            int cantidadActual = carrito.get(producto);
            if (cantidadActual >= cantidad) {
                carrito.put(producto, cantidadActual - cantidad);
                int stockDisponible = inventario.getOrDefault(producto, 0);
                inventario.put(producto, stockDisponible + cantidad);
                System.out.println(cantidad + " unidades de " + producto + " eliminadas del carrito.");
            } else {
                System.out.println("La cantidad a eliminar es mayor que la cantidad en el carrito.");
            }
        } else {
            System.out.println("El producto " + producto + " no está en el carrito.");
        }
    }


    public void procesarPago(double monto) {
        if (monto >= calcularTotal()) {
            saldoTotal += calcularTotal();
            carrito.clear();
            System.out.println("Pago exitoso. Gracias por su compra.");
        } else {
            System.out.println("El monto ingresado es insuficiente para completar la compra.");
        }
    }

    public void mostrarSaldoTotal() {
        System.out.println("Saldo total de la tienda: $" + saldoTotal);
    }

    public static void main(String[] args) {
        TiendaEnLinea tienda = new TiendaEnLinea();

        tienda.agregarProducto("Producto A", 10, 25.0);
        tienda.agregarProducto("Producto B", 5, 50.0);

        tienda.agregarAlCarrito("Producto A", 3);
        tienda.agregarAlCarrito("Producto B", 2);

        tienda.mostrarCarrito();
        System.out.println("Total a pagar: $" + tienda.calcularTotal());

        tienda.procesarPago(150.0);
        tienda.mostrarSaldoTotal();
    }
}

