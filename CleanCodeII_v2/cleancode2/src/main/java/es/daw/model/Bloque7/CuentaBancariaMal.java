package es.daw.model.Bloque7;

public class CuentaBancariaMal {
    private final String titular;
    private double saldo;

    public CuentaBancariaMal(String titular, double saldo) {
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
    public void realizarTransaccion(double cantidad) {
        saldo -= cantidad;
    }
}
