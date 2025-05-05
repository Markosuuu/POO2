package unq.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaRegistradoraTest {
    private CajaRegistradora caja;
    private Producto leche;
    private Producto arroz;

    @BeforeEach
    public void setUp() {
        leche = new Producto("Leche", 15.8d);
        arroz = new ProductoCooperativa("Arroz", 20d);
        caja = new CajaRegistradora();
    }

    @Test
    public void testConstructor() {
        assertEquals(0, caja.getMontoActual());
    }
    
    @Test
    public void testRegistrar() {
        assertEquals(0, caja.getMontoActual());
        caja.registrar(arroz);
        caja.registrar(leche);
        assertEquals(33.8, caja.getMontoActual());
    }
}
