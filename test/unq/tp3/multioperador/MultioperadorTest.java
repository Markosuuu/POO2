package unq.tp3.multioperador;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MultioperadorTest {
    Multioperador multiOp;
    ArrayList<Integer> lista = new ArrayList<Integer>();
    
    @BeforeEach
    public void setUp() {
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        multiOp = new Multioperador(lista);
    }

    @Test
    public void testSumarTodos() {
        assertEquals(15, multiOp.sumarTodos());
    }

    @Test
    public void testRestarTodos() {
        assertEquals(-13, multiOp.restarTodos());
    }
    
    @Test
    public void testMultiplicarTodos() {
        assertEquals(120, multiOp.multiplicarTodos());
    }


}
