package unq.tp3.persona;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;
    
    // Constructor
    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int edad() {
        Period tiempo = Period.between(this.fechaNacimiento, LocalDate.now());
        return tiempo.getYears();
    }
    
    public boolean menorQue(Persona p) {
        return this.edad() < p.edad();
    }
}
