package implementaciones;

import interfaces.ReproductorMultimedia;

public class ReproductorDeVideo implements ReproductorMultimedia {
    private boolean reproduciendo;
    private String archivoActual;

    public ReproductorDeVideo() {
        this.reproduciendo = false;
        this.archivoActual = "";
    }

    @Override
    public void reproducir(String archivo) {
        reproduciendo = true;
        archivoActual = archivo;
        System.out.println("Reproduciendo video: " + archivo);
    }

    @Override
    public void pausar() {
        if (reproduciendo) {
            reproduciendo = false;
            System.out.println("Pausando la reproducción de video.");
        } else {
            System.out.println("El video ya está pausado.");
        }
    }

    @Override
    public void detener() {
        reproduciendo = false;
        archivoActual = "";
        System.out.println("Deteniendo la reproducción de video.");
    }

    @Override
    public void siguiente() {
        System.out.println("Reproduciendo el siguiente video.");
    }

    @Override
    public void anterior() {
        System.out.println("Reproduciendo el video anterior.");
    }

    @Override
    public void ajustarVolumen(int volumen) {
        System.out.println("Ajustando el volumen a " + volumen + "%.");
    }

    @Override
    public String obtenerInformacion() {
        return "Archivo actual: " + archivoActual;
    }

    @Override
    public int obtenerDuracion() {
        return 0; // Duración no disponible para un video específico
    }
}
