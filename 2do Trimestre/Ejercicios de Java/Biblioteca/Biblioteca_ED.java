package Biblioteca;

import java.util.Date; 
import java.util.List; 
import java.util.ArrayList; 

public class Biblioteca_ED {
	
	// Clase Libro 

	class Libro { 

	    private String isbn; 
	    private String titulo; 
	    private String autor; 
	    private int anioPublicacion; 
	    private int cantidad; 


	    public Libro(String isbn, String titulo, String autor, int anioPublicacion, int cantidad) { 
	        this.isbn = isbn; 
	        this.titulo = titulo; 
	        this.autor = autor; 
	        this.anioPublicacion = anioPublicacion; 
	        this.cantidad = cantidad; 
	    } 

	    // Metodos
	    

	    public void agregarCopias(int cantidad) { 
	        this.cantidad += cantidad; 
	    } 

	    public String mostrarInfo() { 
	        return String.format("ISBN: %s, Título: %s, Autor: %s, Año de Publicación: %d, Cantidad: %d", 
	                             isbn, titulo, autor, anioPublicacion, cantidad); 
	    } 

	    
	    // Getters y setters 

	    public String getIsbn() { 
	    	return isbn; 
	    } 

	    public void setIsbn(String isbn) { 
	    	this.isbn = isbn; 
	    } 

	    public String getTitulo() { 
	    	return titulo; 
	    } 

	    public void setTitulo(String titulo) { 
	    	this.titulo = titulo; 
	    } 

	    public String getAutor() { 
	    	return autor; 
	    } 

	    public void setAutor(String autor) { 
	    	this.autor = autor; 
	    } 

	    public int getAnioPublicacion() { 
	    	return anioPublicacion; 
	    } 

	    public void setAnioPublicacion(int anioPublicacion) { 
	    	this.anioPublicacion = anioPublicacion; 
	    } 

	    public int getCantidad() { 
	    	return cantidad; 
	    } 

	    public void setCantidad(int cantidad) { 
	    	this.cantidad = cantidad; 
	    } 
	} 

	 

	// Clase Usuario 

	class Usuario { 

	    private String idUsuario; 
	    private String nombre; 
	    private List<Prestamo> prestamosActuales; 

	    // Constructor 

	    public Usuario(String idUsuario, String nombre) { 
	        this.idUsuario = idUsuario; 
	        this.nombre = nombre; 
	        this.prestamosActuales = new ArrayList<>(); 
	    } 

	    // Métodos 

	    public void tomarPrestado(Prestamo prestamo) { 
	        prestamosActuales.add(prestamo); 
	    } 

	    public void devolver(Libro libro) { 
	        prestamosActuales.removeIf(prestamo -> prestamo.getLibroPrestado().getIsbn().equals(libro.getIsbn())); 
	    } 

	    public String listarPrestamos() { 
	        StringBuilder sb = new StringBuilder(); 
	        for (Prestamo prestamo : prestamosActuales) { 
	            sb.append(prestamo.toString()).append("\n"); 
	        } 
	        return sb.toString(); 
	    } 
	 

	    // Getters y setters 

	    public String getIdUsuario() { 
	    	return idUsuario; 
	    } 

	    public void setIdUsuario(String idUsuario) { 
	    	this.idUsuario = idUsuario;
	    } 

	    public String getNombre() { 
	    	return nombre; 
	    } 

	    public void setNombre(String nombre) { 
	    	this.nombre = nombre; 
	    } 

	    public List<Prestamo> getPrestamosActuales() { 
	    	return prestamosActuales; 
	    } 

	    public void setPrestamosActuales(List<Prestamo> prestamosActuales) { 
	    	this.prestamosActuales = prestamosActuales; 
	    } 
	} 

	 

	// Clase Préstamo 

	class Prestamo { 
		
	    private static int contadorId = 0; 
	    private int idPrestamo; 
	    private Date fechaPrestamo; 
	    private Date fechaDevolucion; 
	    private Libro libroPrestado; 
	    private Usuario usuario; 

	    // Constructor 

	    public Prestamo(Libro libroPrestado, Usuario usuario, int diasPrestamo) { 
	        this.idPrestamo = contadorId++; 
	        this.fechaPrestamo = new Date (); 
	        this.fechaDevolucion = new Date (fechaPrestamo.getTime() + (long)diasPrestamo * 24 * 60 * 60 * 1000); 
	        this.libroPrestado = libroPrestado; 
	        this.usuario = usuario; 
	    } 

	 

	    // Métodos 

	    public boolean esVencido() { 
	        return new Date().after(fechaDevolucion); 
	    } 

	    public String generarRecibo() { 
	        String estado = esVencido() ? "Vencido" : "En tiempo"; 
	        return String.format("Préstamo ID: %d, Libro: %s, Usuario: %s, Estado: %s", 
	                             idPrestamo, libroPrestado.getTitulo(), usuario.getNombre(), estado); 
	    } 

	    public String toString() { 
	        return generarRecibo(); 
	    } 

	 

	    // Getters y setters 

	    public int getIdPrestamo() { 
	    	return idPrestamo;
	    } 

	    public void setIdPrestamo(int idPrestamo) { 
	    	this.idPrestamo = idPrestamo; 
	    } 

	    public Date getFechaPrestamo() { 
	    	return fechaPrestamo; 
	    } 

	    public void setFechaPrestamo(Date fechaPrestamo) { 
	    	this.fechaPrestamo = fechaPrestamo;
	    } 

	    public Date getFechaDevolucion() {
	    	return fechaDevolucion; 
	    } 

	    public void setFechaDevolucion(Date fechaDevolucion) { 
	    	this.fechaDevolucion = fechaDevolucion; 
	    } 

	    public Libro getLibroPrestado() { 
	    	return libroPrestado; 
	    } 

	    public void setLibroPrestado(Libro libroPrestado) { 
	    	this.libroPrestado = libroPrestado;
	    } 

	    public Usuario getUsuario() { 
	    	return usuario; 
	    } 

	    public void setUsuario(Usuario usuario) { 
	    	this.usuario = usuario;
	    } 

	} 

	 

	// Clase Empleado 

	class Empleado { 

	    private String idEmpleado; 
	    private String nombre; 
	    private String cargo; 
	 
	    // Constructor 

	    public Empleado(String idEmpleado, String nombre, String cargo) { 
	        this.idEmpleado = idEmpleado; 
	        this.nombre = nombre; 
	        this.cargo = cargo; 
	    } 

	    // Métodos 

	    public Usuario registrarUsuario(String idUsuario, String nombre) { 
	        return new Usuario(idUsuario, nombre); 
	    } 

	    public void procesarDevolucion(Usuario usuario, Libro libro) { 
	        usuario.devolver(libro); 
	        libro.agregarCopias(1); 
	    } 

	    // Getters y setters 

	    public String getIdEmpleado() { 
	    	return idEmpleado;
	    } 
	    
	    public void setIdEmpleado(String idEmpleado) { 
	    	this.idEmpleado = idEmpleado;
	    } 
	    
	    public String getNombre() { 
	    	return nombre;
	    } 
	    
	    public void setNombre(String nombre) { 
	    	this.nombre = nombre;
	    } 
	    
	    public String getCargo() {
	    	return cargo;
	    } 
	    
	    public void setCargo(String cargo) { 
	    	this.cargo = cargo; 
	    } 
	} 

	 

	// Clase Main para demostración 

	public class Main { 

	    public static void main(String[] args) { 

	        // Crear objetos de las clases 
	        Libro libro = new Libro("123456789", "El Principito", "Antoine de Saint-Exupéry", 1943, 5); 
	        Empleado empleado = new Empleado("E01", "Juan Perez", "Bibliotecario"); 
	        Usuario usuario = empleado.registrarUsuario("U100", "Ana Gomez"); 

	        // Realizar un préstamo 
	        Prestamo prestamo = new Prestamo(libro, usuario, 14); 
	        usuario.tomarPrestado(prestamo); 

	        // Imprimir información del préstamo 
	        System.out.println(prestamo); 
	        
	        // Procesar una devolución 
	        empleado.procesarDevolucion(usuario, libro); 

	        // Mostrar la información del libro después de la devolución 
	        System.out.println(libro.mostrarInfo()); 

	    } 

	} 
}
