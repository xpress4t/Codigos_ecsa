package implementaciones;

import interfaces.Vehiculo;

public class Bicicleta implements Vehiculo {
    private int velocidad;

    public Bicicleta() {
        this.velocidad = 0;
    }

    @Override
    public void encender() {
        System.out.println("Una bicicleta no se enciende, ¡comienza a pedalear!");
    }

    @Override
    public void apagar() {
        velocidad = 0;
        System.out.println("Bicicleta apagada.");
    }

    @Override
    public void acelerar(int velocidad) {
        this.velocidad += velocidad;
        System.out.println("Bicicleta pedaleando a " + this.velocidad + " km/h.");
    }

    @Override
    public void frenar() {
        if (velocidad > 0) {
            velocidad -= 5; // Frenado gradual
            System.out.println("Bicicleta frenando a " + velocidad + " km/h.");
        } else {
            System.out.println("La bicicleta ya está detenida.");
        }
    }
}
