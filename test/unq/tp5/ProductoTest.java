package unq.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoTest {

    private Producto harina;

    @BeforeEach
    public void setUp() {
        harina = new Producto("Harina", 17.5d);
    }

    @Test
    public void testConstructor() {
        assertEquals("Harina", harina.getNombre());
        assertEquals(17.5d, harina.getPrecioBase());
    }
    
    @Test
    public void testSetPrecioBase() {
        harina.setPrecioBase(20d);
        assertEquals(20d, harina.getPrecioBase());
    }
    
    @Test
    public void testGetPrecioFinal() {
        assertEquals(17.5d, harina.montoAPagar());

    }

}
