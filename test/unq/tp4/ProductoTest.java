package unq.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoTest {
    private Producto arroz;
    private Producto vino;

    @BeforeEach
    public void setUp() {
        arroz = new Producto("Arroz", 15.5d, true);
        vino = new Producto("Vino", 70d);
    }

    @Test
    public void testConstructor() {
        assertEquals("Arroz", arroz.getNombre());
		assertEquals(15.5d, arroz.getPrecioBase());
		assertTrue(arroz.isPrecioCuidado());
		
		assertEquals("Vino", vino.getNombre());
		assertEquals(70d, vino.getPrecioBase());
		assertFalse(vino.isPrecioCuidado());
    }

    @Test
    public void testAumentarPrecio() {
        arroz.aumentarPrecio(1.5);
		assertEquals(17d, arroz.getPrecioBase());
    }

}
