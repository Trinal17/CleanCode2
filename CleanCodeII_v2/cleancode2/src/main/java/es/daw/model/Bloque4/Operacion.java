package es.daw.model.Bloque4;

public class Operacion extends Exception{
    public static void dividir(int dividendo, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("¡División por cero!");
        }
        System.out.println("El resultado de la división es: " + dividendo / divisor);
    }
}
