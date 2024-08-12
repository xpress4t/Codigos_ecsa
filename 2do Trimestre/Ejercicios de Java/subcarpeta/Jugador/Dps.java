package Jugador;

public class Dps extends Jugador {
    public Dps( String nombre) {
    	super(nombre);
        bonificadorDañoRecibido = 1.2; // Recibe un 20% más de daño
        bonificacionDañoProducido = 1.5; // Hace un 50% más de daño
    }
}
