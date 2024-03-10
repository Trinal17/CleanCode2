package es.daw;

import java.util.Scanner;

import es.daw.model.Bloque4.Direccion;
import es.daw.model.Bloque4.Empleado;
import es.daw.model.Bloque4.Operacion;
import es.daw.model.Bloque4.Persona;

public class Main {
    public static void main(String[] args) {
    //------ BLOQUE IV ------
        //17. Diferencias entre objetos y estructuras de datos
        // Ejemplo de uso correcto
        Empleado empleado = new Empleado("Juan", 2000);
        System.out.println("Salario de " + empleado.getNombre() + ": $" + empleado.getSalario());
        empleado.aumentarSalario(500);
        System.out.println("Nuevo salario de " + empleado.getNombre() + ": $" + empleado.getSalario());

        //Incorrecto
        //Da error ya que requiere los atributos en publico cosa que no se suele usar en orientacion a objetos.
        Empleado empleado1 = new Empleado("Juan", 2000);
        System.out.println("Salario de " + empleado.nombre + ": $" + empleado.salario);
        // No hay lógica de operación encapsulada en la clase Empleado
        // Por lo tanto, la manipulación de datos se realiza externamente
        empleado.salario += 500;
        System.out.println("Nuevo salario de " + empleado.nombre + ": $" + empleado.salario);
    

        //18. La Ley de Demeter
        // Correcto
        Direccion direccion = new Direccion("Av. Principal");
        Persona persona = new Persona("Juan", direccion);
        String callePersona = persona.getDireccion().getCalle();
        System.out.println("La calle de " + persona.getNombre() + " es " + callePersona);

        //Incorrecto
        //Da error ya que requiere los atributos en publico cosa que no se suele usar en orientacion a objetos.
        Direccion direccion = new Direccion("Av. Principal");
        Persona persona = new Persona("Juan", direccion);
        // Violación de la Ley de Demeter
        // Esto viola la Ley de Demeter, ya que Main está accediendo a detalles internos de objetos relacionados 
        // (Persona y Direccion). 
        // Debería haber una separación más estricta entre los módulos para cumplir con este principio.
        String callePersona = persona.getDireccion().getCalle();
        System.out.println("La calle de " + persona.getNombre() + " es " + callePersona);


        //------ BLOQUE V ------
        //19. Usa excepciones en lugar de código de retorno
        //Correcto
        int dividendo = 10;
        int divisor = 0;
        try {
            Operacion.dividir(dividendo, divisor);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            // Manejo del error para dejar el programa en un estado consistente
            // En este caso, podríamos registrar el error o notificar al usuario, etc.
        }

        //Incorrecto
        int num11 = 10;
        int num22 = 0;
        // Operación se llama directamente sin try-catch-finally
        Operacion.dividir(dividendo, divisor);

        //20. Escribe primero el try-catch-finally
        //Correcto
        Scanner scanner = new Scanner(System.in);
            try {
                System.out.print("Ingrese el dividendo: ");
                int num1 = scanner.nextInt();
                
                System.out.print("Ingrese el divisor: ");
                int num2 = scanner.nextInt();
                
                int resultado = dividir(num1, num2);
                System.out.println("Resultado de la división: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Error: división por cero.");
            } finally {
                scanner.close();
            }

        //Incorrecto
        try {
            // Código que puede lanzar una excepción
            int resultado = 10 / 0;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            // Manejo del error
            System.out.println("Error: " + e.getMessage());
        }
        // Código que sigue después del try-catch
        // Esto podría hacer que el código fuera difícil de entender y mantener
    
        //------ BLOQUE VI ------
        //23. Las tres leyes del TDD
        //En CalculadoraTest
    
        //26. Un Assert por Test
        //En CalculadoraTest

        //28. La regla F.I.R.S.T
        //En CalculadoraTest

        //------ BLOQUE VII ------
        //30. Las Clases Deberian ser Pequeñas
        //Bien 
        //En Calculadora

        //Mal
        //En UtilidadesMatematicas
    
        //32. Cohesion
        //Bien 
        //En Triangulo

        //Mal
        //En Figura

        //35. Utiliza Copias de Objetos para Trabajar con Concurrencia
        //Bien
        //En CuentaBancaria

        //Mal
        //En CuentaBancariaMal
    
    }

    //------ BLOQUE V ------
    public static int dividir(int dividendo, int divisor) {
        return dividendo / divisor;
    }
}