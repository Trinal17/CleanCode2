package es.daw.utils.Bloque7;

public class UtilidadesMatematicas {
    //------ BLOQUE VII ------
    //30. Las Clases Deberian ser Pequeñas
    //Mal
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
    
    public void mostrarResultado(int resultado) {
        System.out.println("El resultado es: " + resultado);
    }
    
    public int obtenerNumeroDesdeConsola() {
        // Código para obtener un número desde la consola
        return 0;
    }


}
