package XXXXXXX;

import java.util.HashMap;
import java.util.Map;

/*
PROPIEDADES DE CLASE: 
-> INVENTARIO: UN MAPA QUE ALMACENA LOS PRODUCTOS DISPONIBLES Y SU CANTIDAD EN STOCK. 
-> PRECIOS: UN MAPA QUE MANTIENE LOS PRECIOS DE LOS PRODUCTOS EN EL INVENTARIO. 
-> CARRITO: UN MAPA QUE REPRESENTA EL CARRITO DE COMPRAS ACTUAL. 
-> SALDOTOTAL: UN VALOR QUE REGISTRA EL SALDO TOTAL ACUMULADO POR LAS VENTAS.

FUNCIONES: 
-> AGREGARPRODUCTO(STRING PRODUCTO, INT CANTIDAD, DOUBLE PRECIO):AGREGA UN PRODUCTO AL INVENTARIO CON UNA CANTIDAD INICIAL Y UN PRECIO.
-> AGREGARALCARRITO(STRING PRODUCTO, INT CANTIDAD): AGREGA UN PRODUCTO AL CARRITO DE COMPRAS.
-> MOSTRARCARRITO(): MUESTRA EL CONTENIDO ACTUAL DEL CARRITO DE COMPRAS.
-> CALCULARTOTAL(): CALCULA EL PRECIO TOTAL DE LOS PRODUCTOS EN EL CARRITO.
-> PROCESARPAGO(DOUBLE MONTO): PROCESA EL PAGO Y ACTUALIZA EL SALDO DE LA TIENDA.
-> MOSTRARSALDOTOTAL(): MUESTRA EL SALDO TOTAL ACUMULADO POR TODAS LAS VENTAS.
-> ELIMINARDELCARRITO(STRING PRODUCTO, INT CANTIDAD): ELIMINA UN PRODUCTO ESPECÍFICO DEL CARRITO.
-> VACIARCARRITO(): ELIMINA TODOS LOS PRODUCTOS DEL CARRITO DE COMPRAS.
-> AJUSTARPRECIO(STRING PRODUCTO, DOUBLE NUEVOPRECIO): AJUSTA EL PRECIO DE UN PRODUCTO EN EL INVENTARIO.
 */

class Tienda_online implements Obligatorio {
	private Map<String,Integer> inventario;
	private Map<String,String> precios;
	private Map<String,String> carrito;
	private Float saldoTotal;
	
	Tienda_online(Float saldoTotal) {
		this.inventario = new HashMap<>();
		this.precios = new HashMap<>();
		this.carrito = new HashMap<>();
		this.saldoTotal = saldoTotal;
	}
	
	void agregarProducto(String producto,int cantidad,double precio) {
		
	}
	
	void agregarAlCarrito(String producto,int cantidad) {
		
	}
	
	void mostrarCarrito() {
		
	}
	
	// Si no le pusiera el modificador de acceso a "public" me daría erro en calcularTotal
	public void calcularTotal() {
		
	}
	
	void procesarPago(double monto) {
		
	}
	
	public void mostrarSaldoTotal() {
		
	}
	
	void eliminarDelCarrito(String producto,int cantidad) {
		
	}
	
	void vaciarCarrito() {
		
	}
	
	void ajustarPrecio(String producto,double nuevoprecio) {
		
	}
}
