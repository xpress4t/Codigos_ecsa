package Tienda_de_mascotas;

class Producto {
	
	private String id_del_producto;
	private String nombre;
	private int precio;
	private int cantidad_en_stock;
	
	
	// Constructor
	
	public Producto(String id_del_producto, String nombre, int precio, int cantidad_en_stock) {
		this.id_del_producto = id_del_producto;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad_en_stock = cantidad_en_stock;
	}
	
	// Methods
		
	public void reponerStock(int cantidad) {
		
	}
	
	public void venderProducto(int cantidad) {
		
	}
	
	// Getters y Setters

	public String getID_del_producto() {
		return id_del_producto;
	}

	public void setID_del_producto(String id_del_producto) {
		this.id_del_producto = id_del_producto;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidad_en_stock() {
		return cantidad_en_stock;
	}

	public void setCantidad_en_stock(int cantidad_en_stock) {
		this.cantidad_en_stock = cantidad_en_stock;
	}
}