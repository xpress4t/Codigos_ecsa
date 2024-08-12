package interfaces;

/* 
  Esta interfaz define métodos para gestionar archivos y directorios.
  Funciones (métodos):
    Método "crearArchivo": Crea un archivo con el nombre especificado.
    Método "borrarArchivo": Borra un archivo con el nombre especificado.
    Método "crearDirectorio": Crea un directorio con el nombre especificado.
    Método "borrarDirectorio": Borra un directorio con el nombre especificado.
 */
public interface GestorArchivos {
    /**
     * Crea un archivo con el nombre especificado.
     */
    boolean crearArchivo(String nombreArchivo);

    /**
     * Borra un archivo con el nombre especificado.
     */
    boolean borrarArchivo(String nombreArchivo);

    /**
     * Crea un directorio con el nombre especificado.
     */
    boolean crearDirectorio(String nombreDirectorio);

    /**
     * Borra un directorio con el nombre especificado.
     */
    boolean borrarDirectorio(String nombreDirectorio);
}
