package unq.tp1;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado{

    private int cantHijos;
    private int aniosDeAntiguedad;


    public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento,
            double sueldoBasico, int cantHijos, int aniosDeAntiguedad) {
        super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
        this.cantHijos = cantHijos;
        this.aniosDeAntiguedad = aniosDeAntiguedad;
    }
    
    public int getCantHijos() {
        return cantHijos;
    }

    public void setCantHijos(int cantHijos) {
        this.cantHijos = cantHijos;
    }

    public int getAniosDeAntiguedad() {
        return aniosDeAntiguedad;
    }

    public void setAniosDeAntiguedad(int aniosDeAntiguedad) {
        this.aniosDeAntiguedad = aniosDeAntiguedad;
    }

    public double sueldoBruto() {
        int asignacionConyugal = (this.getEstadoCivil() == "Casado") ? 100 : 0;
        int asignacionPorHijo = 150 * this.cantHijos;
        int antiguedad = 50 * this.aniosDeAntiguedad;

        return 
            this.getSueldoBasico() +
            asignacionPorHijo +
            asignacionConyugal +
            antiguedad;
    }

    public double retenciones() {
        // Obra Social = 10% del sueldo bruto + $20 por cada hijo
        double obraSocial = this.sueldoBruto() * 0.1 + 20 * this.cantHijos; 
        
        // Aporte Jubilatorio = 15% del sueldo bruto
        double aporteJubilatorio = this.sueldoBruto() * 0.15;

        return obraSocial + aporteJubilatorio;
    }

}
