package unq.tp2;

import java.time.LocalDate;
import java.time.Period;

abstract class Empleado {
    protected String nombre;
    protected String direccion;
    protected String estadoCivil;
    protected LocalDate fechaNacimiento;
    protected double sueldoBasico;
    
    // Constructor
    public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento,
            double sueldoBasico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.fechaNacimiento = fechaNacimiento;
        this.sueldoBasico = sueldoBasico;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    // Methods

    public int edad() {
        Period tiempo = Period.between(this.fechaNacimiento, LocalDate.now());
        return tiempo.getYears();
    }

    abstract double sueldoBruto(); // Definen subclases
    
    abstract double retenciones(); // Definen subclases
    
    public double sueldoNeto() {
        return this.sueldoBruto() - this.retenciones();
    }

    abstract String generarReciboDeHaberes();

}
