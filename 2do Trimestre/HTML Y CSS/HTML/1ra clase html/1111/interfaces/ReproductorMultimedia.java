package interfaces;


/* 
  Esta interfaz define métodos para controlar un reproductor multimedia.
  Funciones (métodos):
    Método "reproducir": Reproduce el archivo multimedia especificado.
    Método "pausar": Pausa la reproducción actual.
    Método "detener": Detiene la reproducción actual y vuelve al inicio del archivo.
    Método "siguiente": Avanza al siguiente elemento en la lista de reproducción.
    Método "anterior": Retrocede al elemento anterior en la lista de reproducción.
    Método "ajustarVolumen": Ajusta el volumen de reproducción.
    Método "obtenerInformacion": Muestra la información del archivo multimedia actualmente en reproducción.
    Método "obtenerDuracion": Obtiene la duración total del archivo multimedia actualmente en reproducción.
 */
public interface ReproductorMultimedia {
    void reproducir(String archivo);

    void pausar();

    void detener();

    void siguiente();

    void anterior();

    void ajustarVolumen(int volumen);

    String obtenerInformacion();

    int obtenerDuracion();
}
