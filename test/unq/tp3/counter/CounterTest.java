package unq.tp3.counter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {
    private Counter counter;
    
    /**
     * Crea un escenario de test básico, que consiste en un contador
     * con 10 enteros
     */

     @BeforeEach
     public void setUp() {
        // Se crea el contador
        counter = new Counter();

        // Se agregan los números. Un solo par y nueve impares
        counter.addNumber(1);
        counter.addNumber(3);
        counter.addNumber(5);
        counter.addNumber(7);
        counter.addNumber(9);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(4);
     }

    /**
      * Verifica la cantidad de pares
    */
    @Test
    public void testEvenNumbers() {
        // Getting the even occurrences
        int amount = counter.getEvenOccurences();
        
        // I check the amount is the expected one
        assertEquals(1, amount);
    }
    
    /**
      * Verifica la cantidad de impares
    */
    @Test
    public void testOddNumbers() {
        // Getting the even occurrences
        int amount = counter.getOddOccurences();
        
        // I check the amount is the expected one
        assertEquals(9, amount);
    }
    
    /**
      * Verifica la cantidad de multiplos de 3
      * En este caso 2, [3,9]
    */
    @Test
    public void testMultiplyNumbers() {
      int amount = counter.getMultiplyOccurences(3);
      
      assertEquals(2, amount);
    }

    @Test
    public void testGetMoreEvenOccurences() {
      int number = counter.getMoreEvenOccurences();

      assertEquals(4, number);
    }
}