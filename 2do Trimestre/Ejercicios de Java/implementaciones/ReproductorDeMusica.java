package implementaciones;

import interfaces.ReproductorMultimedia;

public class ReproductorDeMusica implements ReproductorMultimedia {
    private boolean reproduciendo;
    private String archivoActual;

    public ReproductorDeMusica() {
        this.reproduciendo = false;
        this.archivoActual = "";
    }

    @Override
    public void reproducir(String archivo) {
        reproduciendo = true;
        archivoActual = archivo;
        System.out.println("Reproduciendo música: " + archivo);
    }

    @Override
    public void pausar() {
        if (reproduciendo) {
            reproduciendo = false;
            System.out.println("Pausando la reproducción de música.");
        } else {
            System.out.println("La música ya está pausada.");
        }
    }

    @Override
    public void detener() {
        reproduciendo = false;
        archivoActual = "";
        System.out.println("Deteniendo la reproducción de música.");
    }

    @Override
    public void siguiente() {
        System.out.println("Reproduciendo la siguiente canción.");
    }

    @Override
    public void anterior() {
        System.out.println("Reproduciendo la canción anterior.");
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
        return 0; // Duración no disponible para una canción específica
    }
}
