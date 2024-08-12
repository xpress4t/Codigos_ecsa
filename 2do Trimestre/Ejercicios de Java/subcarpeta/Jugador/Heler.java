package Jugador;

public class Heler extends Jugador {

	public Heler(String nombre) {
		super(nombre);
		bonificadorDañoRecibido = 0.8; // Recibe un 20% menos de daño
		bonificadorCuracion = 1.5; // Cura un 50% más
	}
}
