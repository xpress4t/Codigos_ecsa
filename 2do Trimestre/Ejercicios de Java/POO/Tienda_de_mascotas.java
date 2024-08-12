package POO;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
 
// Clase Cliente
class Cliente {
    private String idCliente;
    private String nombre;
    private List<Mascota> mascotas;
 
    public Cliente(String idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.mascotas = new ArrayList<>();
    }
 
    public void añadirMascota(Mascota mascota) {
        this.mascotas.add(mascota);
    }
 
    public String listarMascotas() {
        StringBuilder sb = new StringBuilder();
        for (Mascota mascota : this.mascotas) {
            sb.append(mascota.getNombre()).append(", Especie: ").append(mascota.getEspecie()).append("\n");
        }
        return sb.toString();
    }
 
    // Getters y setters
    public String getIdCliente() {
        return idCliente;
    }
 
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public List<Mascota> getMascotas() {
        return mascotas;
    }
}
 
// Clase Mascota
class Mascota {
    private String idMascota;
    private String nombre;
    private String especie;
    private List<CitaVeterinario> citas;
 
    public Mascota(String idMascota, String nombre, String especie) {
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.especie = especie;
        this.citas = new ArrayList<>();
    }
 
    public void programarCita(CitaVeterinario cita) {
        this.citas.add(cita);
    }
 
    public String listarCitas() {
        StringBuilder sb = new StringBuilder();
        for (CitaVeterinario cita : this.citas) {
            sb.append("Cita ID: ").append(cita.getIdCita())
              .append(", Fecha: ").append(cita.getFechaHora()).append("\n");
        }
        return sb.toString();
    }
 
    // Getters y setters
    public String getIdMascota() {
        return idMascota;
    }
 
    public void setIdMascota(String idMascota) {
        this.idMascota = idMascota;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getEspecie() {
        return especie;
    }
 
    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
 
// Clase CitaVeterinario
class CitaVeterinario {
    private String idCita;
    private Date fechaHora;
    private Mascota mascota;
    private String motivo;
 
    public CitaVeterinario(String idCita, Date fechaHora, Mascota mascota, String motivo) {
        this.idCita = idCita;
        this.fechaHora = fechaHora;
        this.mascota = mascota;
        this.motivo = motivo;
    }
 
    public void reprogramarCita(Date nuevaFechaHora) {
        this.fechaHora = nuevaFechaHora;
    }
 
    public void cancelarCita() {
        // Implementación de la cancelación
    }
 
    // Getters y setters
    public String getIdCita() {
        return idCita;
    }
 
    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }
 
    public Date getFechaHora() {
        return fechaHora;
    }
 
    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
 
    public Mascota getMascota() {
        return mascota;
    }
 
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
 
    public String getMotivo() {
        return motivo;
    }
 
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
 
// Clase Producto
class Producto {
    private String idProducto;
    private String nombre;
    private double precio;
    private int cantidadStock;
 
    public Producto(String idProducto, String nombre, double precio, int cantidadStock) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }
 
    public void reponerStock(int cantidad) {
        this.cantidadStock += cantidad;
    }
 
    public void venderProducto(int cantidad) {
        this.cantidadStock -= cantidad;
    }
 
    // Getters y setters
    public String getIdProducto() {
        return idProducto;
    }
 
    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
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
 
    public int getCantidadStock() {
        return cantidadStock;
    }
 
    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
}
 
// Clase Main para demostración
public class Tienda_de_mascotas {
    public static void main(String[] args) {
        // Crear objetos de las clases
        Cliente cliente = new Cliente("C001", "Laura García");
        Mascota mascota = new Mascota("M001", "Firulais", "Perro");
        cliente.añadirMascota(mascota);
        CitaVeterinario cita = new CitaVeterinario("CV001", new Date(), mascota, "Revisión anual");
        mascota.programarCita(cita);
 
        // Imprimir información del cliente y sus mascotas
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Mascotas: ");
        System.out.println(cliente.listarMascotas());
 
        // Imprimir citas de la mascota
        System.out.println("Citas de " + mascota.getNombre() + ":");
        System.out.println(mascota.listarCitas());
 
        // Gestionar productos en el inventario
        Producto producto = new Producto("P001", "Alimento para perros", 19.99, 50);
        producto.venderProducto(5);
        System.out.println("Producto: " + producto.getNombre() + " - Stock actual: " + producto.getCantidadStock());
    }
}