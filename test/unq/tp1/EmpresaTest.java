package unq.tp1;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpresaTest {
    Empresa emp;
    Empleado p1 = new EmpleadoPermanente("Marcos", "Calle 1", "Casado", LocalDate.of(2003, 8, 8), 1000, 0, 5);
    Empleado p2 = new EmpleadoTemporal("Juan", "Calle 2", "Soltero", LocalDate.of(2003, 9, 18), 800, LocalDate.of(2025, 10, 31), 3);

    Empleado[] listaEmpleados = {p1, p2};

    @BeforeEach
    public void setUp() {
        emp = new Empresa("UNQ", "1234", listaEmpleados);
    }

    @Test
    public void testGetter() {
        assertEquals("UNQ", emp.getNombre());
    }
    
    @Test
    public void testMontoSueldosBrutosTotal() {
        double monto = emp.montoSueldosBrutosTotal();
        assertEquals(2270d, monto);
    }
    
    @Test
    public void testMontoRetencionesTotal() {
        double monto = emp.montoRetencionesTotal();
        assertEquals(536.5d, monto);
    }
    
    @Test
    public void testMontoSueldosNetoTotal() {
        double monto = emp.montoSueldosNetoTotal();
        assertEquals(1733.5d, monto);
    }
    
}
