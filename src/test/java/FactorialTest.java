import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    void testWhenInputIsString(){
        Factorial factorial = new Factorial("number");
        try {
            int calculateFactorial = factorial.calculateFactorial();
        } catch (IllegalArgumentException e) {
            assertEquals("Input should be Integer type",e.getMessage());
        }
    }

    @Test
    void testWhenInputIsFloat(){
        Factorial factorial = new Factorial(10.5);
        try {
            int calculateFactorial = factorial.calculateFactorial();
        } catch (IllegalArgumentException e) {
            assertEquals("Input should be Integer type",e.getMessage());
        }
    }

    @Test
    void testWhenInputIsNegativeInteger(){
        Factorial factorial = new Factorial(-3);
        try {
            int calculateFactorial = factorial.calculateFactorial();
        } catch (IllegalArgumentException e) {
            assertEquals("Input should be positive integer",e.getMessage());
        }
    }

    @Test
    void testWhenInputIsZero(){
        Factorial factorial = new Factorial(0);
        int calculateFactorial = factorial.calculateFactorial();
        assertEquals(1,calculateFactorial);
    }

    @Test
    void testWhenInputIsGreaterThanZero(){
        Factorial factorial = new Factorial(6);
        int calculateFactorial = factorial.calculateFactorial();
        assertEquals(720,calculateFactorial);
    }
}