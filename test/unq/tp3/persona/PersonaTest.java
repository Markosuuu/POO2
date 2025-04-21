package unq.tp3.persona;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {
    Persona p;
    LocalDate fecha = LocalDate.of(2003, 9, 18);
    
    Persona p2;
    LocalDate fecha2 = LocalDate.of(2003, 8, 8);

    @BeforeEach
    public void setUp() {
        p  = new Persona("Juan", fecha);
        p2 = new Persona("Markos", fecha2);
    }

    @Test
    public void testGetNombre() {
        assertEquals(p.getNombre(), "Juan");
    }
    
    @Test
    public void testGetFechaNacimiento() {
        assertEquals(p.getFechaNacimiento(), fecha);
    }
    
    @Test
    public void testEdad() {
        assertEquals(p.edad(), 21);
    }

    @Test
    public void testMenorQue() {
        assertFalse(p.menorQue(p2));
    }
}
