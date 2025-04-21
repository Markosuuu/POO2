package unq.tp3.point;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectanguloTest {

    Point p;
    Rectangulo r;

    @BeforeEach
    public void setUp() {
        p = new Point(1, 2);
        r = new Rectangulo(2, 3, p);
    }

    @Test
    public void testGetter() {
        assertEquals(2, r.getBase());
    }
    
    @Test
    public void testSetter() {
        r.setBase(3);
        assertEquals(3, r.getBase());
    }

    @Test
    public void testArea() {
        assertEquals(6, r.area());
    }

    @Test
    public void testPerimetro() {
        assertEquals(10, r.perimetro());
    }

    @Test
    public void testEsHorizontal() {
        r.setBase(4);
        assertEquals("Es horizontal", r.tipoOrientacion());
    }
    
    @Test
    public void testEsVertical() {
        assertEquals("Es vertical", r.tipoOrientacion());
    }
    
    @Test
    public void testEsCuadrado() {
        r.setBase(3);
        assertEquals("Es un cuadrado", r.tipoOrientacion());
    }
}
