package interfaces;


/* 
  Crear una interfaz llamada "AccionesBancarias" que define métodos para realizar acciones bancarias comunes.
  Funciones (métodos):
    Método "depositar": Un método que permite depositar una cantidad de dinero en una cuenta bancaria.
    Método "retirar": Un método que permite retirar una cantidad de dinero de una cuenta bancaria.
    Método "consultarSaldo": Un método que permite consultar el saldo actual de una cuenta bancaria.
 */
public interface AccionesBancarias {
    /**
     * Deposita una cantidad de dinero en la cuenta bancaria.
     */
    void depositar(double cantidad);

    /**
     * Retira una cantidad de dinero de la cuenta bancaria.
     *
     */
    void retirar(double cantidad);

    /**
     * Consulta el saldo actual de la cuenta bancaria.
     *
     */
    double consultarSaldo();
}

