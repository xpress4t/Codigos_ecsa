package producto_tienda;

/*
 
Crear una clase llamada "TiendaOnline"
	Funciones (métodos):
		Constructor: Un constructor que acepte 2 parámetros, el nombre del producto (cadena de caracteres) y el precio del producto,
			y lo utilice para inicializar el atributo de la clase.
		Métodos getters y setters de todos los atributos que lo necesiten
	Atributos:
		nombre: Almacena el nombre del producto como una cadena de caracteres.
		precio: Almacena el precio del producto como un número decimal (double).
		cantidadEnStock: Almacena la cantidad en stock del producto como un número entero (int).	  
*/

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }
}
