package unq.tp3.point;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class PointTest {
    Point p;

    @BeforeEach
    public void setUp() {
        p = new Point(1, 2);
    }

    @Test
    public void testGetX() {
        assertEquals(1, p.getX());
    }

    @Test
    public void testGetY() {
        assertEquals(2, p.getY());
    }

    @Test
    public void testVoidConstructor() {
        Point punto = new Point();
        assertEquals(0, punto.getX());
    }

    @Test
    public void testSetX() {
        p.setX(5);
        assertEquals(5, p.getX());
    }

    @Test
    public void testSetY() {
        p.setY(5);
        assertEquals(5, p.getY());
    }

    @Test
    public void testAddPoint() {
        Point punto = new Point(3,4);
        p.addPoint(punto);
        assertEquals(4, p.getX());
    }
}
