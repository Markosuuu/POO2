package unq.tp4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoPrimeraNecesidadTest {

    private ProductoPrimeraNecesidad leche;

    @BeforeEach
    public void setUp() {
        leche = new ProductoPrimeraNecesidad("Leche", 20d, 10d);
    }

    @Test
    public void testCalcularPrecio() {
		assertEquals(18d, leche.precioFinal());
	}


}
