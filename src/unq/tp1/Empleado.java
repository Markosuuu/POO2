package unq.tp1;

import java.time.LocalDate;

abstract class Empleado {
    private String nombre;
    private String direccion;
    private String estadoCivil;
    private LocalDate fechaNacimiento;
    private double sueldoBasico;
    
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
        return 0; // importar Period
    }

    abstract double sueldoBruto(); // Definen subclases
    
    abstract double retenciones(); // Definen subclases
    
    public double sueldoNeto() {
        return this.sueldoBruto() - this.retenciones();
    }

}
