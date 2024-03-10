package Bloque6;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import es.daw.model.Bloque5.Calculadora;

public class CalculadoraTest {
    //------ BLOQUE VI ------
    //23. Las tres leyes del TDD
    //Correcto
    @Test
    public void testSumarBien() {
        // Arrange
        int a = 5;
        int b = 3;
        
        // Act
        int resultado = Calculadora.sumar(a, b);
        
        // Assert
        assertEquals(8, resultado);
    }

    //Incorrecto
    @Test
    public void testSumarMal() {
        // Arrange
        int a = 5;
        int b = 3;
        
        // Act
        int resultado = Calculadora.sumar(a, b);
        
        // Assert
        assertEquals(9, resultado); // Se espera que la suma de 5 y 3 sea 9 (error intencional)
    }

    //26. Un Assert por Test
    //Correcto
    @Test
    public void testSumarBien2() {
        // Arrange
        int a = 5;
        int b = 3;
        
        // Act
        int resultado = Calculadora.sumar(a, b);
        
        // Assert
        assertEquals(8, resultado);
    }

    //Incorrecto
    @Test
    public void testSumarMal2() {
        // Arrange
        int a = 5;
        int b = 3;
        
        // Act
        int resultado = Calculadora.sumar(a, b);
        
        // Assert
        assertEquals(8, resultado);
        assertTrue(resultado > 0); // Segundo assert, violando la regla de un assert por test
    }

    //28. La regla F.I.R.S.T
    @Test
    public void testSumar() {
        // Arrange
        int a = 5;
        int b = 3;
        
        // Act
        int resultado = Calculadora.sumar(a, b);
        
        // Assert
        assertEquals(8, resultado);
    }
    
    @Test // Independent
    public void testRestar() {
        // Arrange
        int a = 5;
        int b = 3;
        
        // Act
        int resultado = Calculadora.restar(a, b);
        
        // Assert
        assertEquals(2, resultado);
    }
    
    @Test // Repeatable
    public void testMultiplicar() {
        // Arrange
        int a = 5;
        int b = 3;
        
        // Act
        int resultado = Calculadora.multiplicar(a, b);
        
        // Assert
        assertEquals(15, resultado);
    }
    
    @Test // Self-Validating
    public void testDividir() {
        // Arrange
        int a = 6;
        int b = 3;
        
        // Act
        int resultado = Calculadora.dividir(a, b);
        
        // Assert
        assertEquals(2, resultado);
    }
}
