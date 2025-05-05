package unq.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoCooperativaTest {
    private ProductoCooperativa fideos;

    @BeforeEach
    public void setUp() {
        fideos = new ProductoCooperativa("Fideo", 25d);
    }

    @Test
    public void testConstructor() {
        assertEquals("Fideo", fideos.getNombre());
        assertEquals(25d, fideos.getPrecioBase());
    }
    
    @Test
    public void testSetPrecioBase() {
        fideos.setPrecioBase(20d);
        assertEquals(20d, fideos.getPrecioBase());
    }
    
    @Test
    public void testGetPrecioFinal() {
        assertEquals(22.5d, fideos.getPrecioFinal());

    }
}
