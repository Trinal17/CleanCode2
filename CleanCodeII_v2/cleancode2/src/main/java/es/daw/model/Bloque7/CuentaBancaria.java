package es.daw.model.Bloque7;

public class CuentaBancaria {
    private final String titular;
    private final double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método para realizar una transacción
    public CuentaBancaria realizarTransaccion(double cantidad) {
        // Crear una copia de la cuenta con el saldo actualizado
        return new CuentaBancaria(titular, saldo - cantidad);
    }
}
