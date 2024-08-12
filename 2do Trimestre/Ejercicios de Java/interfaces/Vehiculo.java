package interfaces;

/* 
  Esta interfaz define métodos para operaciones relacionadas con vehículos.
  Funciones (métodos):
    Método "encender": Enciende el vehículo.
    Método "apagar": Apaga el vehículo.
    Método "acelerar": Acelera el vehículo a una velocidad determinada.
    Método "frenar": Frena el vehículo.
 */
public interface Vehiculo {
    /**
     * Enciende el vehículo.
     */
    void encender();

    /**
     * Apaga el vehículo.
     */
    void apagar();

    /**
     * Acelera el vehículo a una velocidad determinada.
     *
     */
    void acelerar(int velocidad);

    /**
     * Frena el vehículo.
     */
    void frenar();
}
