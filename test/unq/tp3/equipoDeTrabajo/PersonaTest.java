package unq.tp3.equipoDeTrabajo;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {
    Persona p;

    @BeforeEach
    public void setUp() {
        p = new Persona("Marcos","Diaz", 21);
    }

    @Test
    public void testGetNombre() {
        assertEquals("Marcos", p.getNombre());
    }
    
    @Test
    public void testGetApellido() {
        assertEquals("Diaz", p.getApellido());
    }
    
    @Test
    public void testGetEdad() {
        assertEquals(21, p.getEdad());
    }


}
