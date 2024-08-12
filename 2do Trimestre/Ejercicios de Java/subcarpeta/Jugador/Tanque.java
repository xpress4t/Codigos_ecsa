package Jugador;

public class Tanque extends Jugador {
    public Tanque(String nombre) {
    	super(nombre);
    	//Modificamos las caracteristicas concretas de la clase
    	super.bonificadorDañoRecibido = 0.7; // Recibe un 30% menos de daño
    	super.bonificacionDañoProducido = 0.5; // Hace un 50% menos de daño
    }

}
