package unq.tp4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SupermercadoTest {
    private Producto arroz;
	private Producto detergente;
	private Supermercado supermercado;

    @BeforeEach
    public void setUp() {
		arroz = new Producto("Arroz", 18.9d, true);
		detergente = new Producto("Detergente", 75d);
		supermercado = new Supermercado("Lo de Tito", "Av Zubeldia 801");
	}

    @Test
    public void testCantidadDeProductos() {
		assertEquals(0, supermercado.cantProductos());
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals(2, supermercado.cantProductos());
	}

	@Test
	public void testPrecioTotal() {
		assertEquals(0, supermercado.sumatorioPrecios());
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals(93.9, supermercado.sumatorioPrecios());
	}
}
