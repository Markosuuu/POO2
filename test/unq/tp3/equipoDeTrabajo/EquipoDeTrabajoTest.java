package unq.tp3.equipoDeTrabajo;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EquipoDeTrabajoTest {
    EquipoDeTrabajo et;
    Persona p1 = new Persona("Marcos", "Diaz", 20);
    Persona p2 = new Persona("Tomas", "Garcia", 19);
    Persona p3 = new Persona("Juan", "Martinez", 21);
    Persona p4 = new Persona("Romina", "Lopez", 22);
    Persona p5 = new Persona("Francisco", "Rodriguez", 18);
    Persona[] integrantes = {p1,p2,p3,p4,p5};

    @BeforeEach
    public void setUp() {
        et = new EquipoDeTrabajo("EquipoPOO", integrantes);
    }

    @Test
    public void testGetName() {
        assertEquals("EquipoPOO", et.getNombre());
    }
    
    @Test
    public void testPromedioEdad() {
        assertEquals(20, et.promedioEdad());
    }

}
