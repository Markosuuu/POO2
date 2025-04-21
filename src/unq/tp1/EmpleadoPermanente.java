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
        /*
         * Sueldo Básico
         * Salario Familiar, que se compone de:
         * * Asignación por hijo: $150 por cada hijo.
         * * Asignación por cónyuge: $100 si tiene cónyuge
         * Antigüedad: $50 por cada año de antigüedad
         */
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

    public String generarReciboDeHaberes() {
        double sueldoBruto = this.sueldoBruto();

        String recibo = 
            "Nombre: " + this.nombre + "\n" + 
            "Direccion: " + this.direccion + "\n" + 
            "Fecha de emision: " + LocalDate.now().toString()+ "\n" +
            "Sueldo bruto: " + sueldoBruto + "\n" +
            "Sueldo neto: " + this.sueldoNeto() + "\n" +
            "Desgloce de conceptos: " + "\n" +
            "Sueldo bruto = " + sueldoBruto + "\n" +
            "* Sueldo basico: " + this.sueldoBasico + "\n" +
            "* Antiguedad: $50 por anio (" + this.aniosDeAntiguedad + ") = $" + this.aniosDeAntiguedad*50 + "\n" +
            "* Salario familiar: $150 por hijo ($" + this.cantHijos*150 + ") + $100 si tiene conyuge ($" + ((this.getEstadoCivil() == "Casado") ? 100 : 0) + ")" + "\n" +
            "Retenciones = " + this.retenciones() + "\n" +
            "* Obra social: 10% del sueldo bruto ($" + sueldoBruto*0.1 + ") + $20 por hijo ($" + this.cantHijos*20 + ") = $" + (sueldoBruto*0.1 +this.cantHijos*20) + "\n" +
            "* Aporte jubilatorio: 15% del sueldo bruto ($" + sueldoBruto*0.15 + ")\n" +
            " ------------------ " + "\n";
        
        return recibo;
    }
}
