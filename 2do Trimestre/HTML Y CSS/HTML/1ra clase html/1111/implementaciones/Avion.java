package implementaciones;

import interfaces.Vehiculo;

public class Avion implements Vehiculo {
    private boolean encendido;
    private int velocidad;

    public Avion() {
        this.encendido = false;
        this.velocidad = 0;
    }

    @Override
    public void encender() {
        encendido = true;
        System.out.println("Avión encendido.");
    }

    @Override
    public void apagar() {
        encendido = false;
        velocidad = 0;
        System.out.println("Avión apagado.");
    }

    @Override
    public void acelerar(int velocidad) {
        if (encendido) {
            this.velocidad += velocidad;
            System.out.println("Avión acelerando a " + this.velocidad + " km/h.");
        } else {
            System.out.println("No se puede acelerar. El avión está apagado.");
        }
    }

    @Override
    public void frenar() {
        if (velocidad > 0) {
            velocidad -= 10; // Frenado gradual
            System.out.println("Avión frenando a " + velocidad + " km/h.");
        } else {
            System.out.println("El avión ya está detenido.");
        }
    }
}
