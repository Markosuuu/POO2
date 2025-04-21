package unq.tp3.point;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CuadradoTest {
    Point p;
    Cuadrado c;

    @BeforeEach
    public void setUp() {
        p = new Point(2, 3);
        c = new Cuadrado(3, p);
    }

    @Test
    public void testGetter() {
        assertEquals(3, c.getBase());
    }

    @Test
    public void testSetter() {
        c.setBase(2);
        assertEquals(2, c.getBase());
    }

    @Test
    public void testArea() {
        assertEquals(9, c.area());
    }

    @Test
    public void testPerimetro() {
        assertEquals(12, c.perimetro());
    }

    @Test
    public void testEsCuadrado() {
        assertEquals("Es un cuadrado", c.tipoOrientacion(), "Falló por gil");
    }
}
