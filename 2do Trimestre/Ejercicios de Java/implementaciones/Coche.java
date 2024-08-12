package implementaciones;

import interfaces.Vehiculo;

public class Coche implements Vehiculo {
    private boolean encendido;
    private int velocidad;

    public Coche() {
        this.encendido = false;
        this.velocidad = 0;
    }

    @Override
    public void encender() {
        encendido = true;
        System.out.println("Coche encendido.");
    }

    @Override
    public void apagar() {
        encendido = false;
        velocidad = 0;
        System.out.println("Coche apagado.");
    }

    @Override
    public void acelerar(int velocidad) {
        if (encendido) {
            this.velocidad += velocidad;
            System.out.println("Coche acelerando a " + this.velocidad + " km/h.");
        } else {
            System.out.println("No se puede acelerar. El coche está apagado.");
        }
    }

    @Override
    public void frenar() {
        if (velocidad > 0) {
            velocidad = 0;
            System.out.println("Coche frenando.");
        } else {
            System.out.println("El coche ya está detenido.");
        }
    }
}
