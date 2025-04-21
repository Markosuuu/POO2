package unq.tp1;

import java.time.LocalDate;

public class EmpleadoTemporal extends Empleado{
    private LocalDate fechaFinalDeDesignacion;
    private int cantHorasExtra;
    
    public EmpleadoTemporal(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento,
            double sueldoBasico, LocalDate fechaFinalDeDesignacion, int cantHorasExtra) {
        super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
        this.fechaFinalDeDesignacion = fechaFinalDeDesignacion;
        this.cantHorasExtra = cantHorasExtra;
    }

    public LocalDate getFechaFinalDeDesignacion() {
        return fechaFinalDeDesignacion;
    }

    public void setFechaFinalDeDesignacion(LocalDate fechaFinalDeDesignacion) {
        this.fechaFinalDeDesignacion = fechaFinalDeDesignacion;
    }

    public int getCantHorasExtra() {
        return cantHorasExtra;
    }

    public void setCantHorasExtra(int cantHorasExtra) {
        this.cantHorasExtra = cantHorasExtra;
    }

    
    public double sueldoBruto() {
        return this.getSueldoBasico() + this.cantHorasExtra * 40;
    }

    
    public double retenciones() {
        int antiguedad = (this.edad() > 50) ? 25 : 0;
        double porcentajeSueldoBruto = this.sueldoBruto() * 0.1;
        
        // Obra Social: 10% de su sueldo bruto + $25 si supera los 50 años
        double obraSocial = porcentajeSueldoBruto + antiguedad;
        
        // Aportes Jubilatorios: 10% de su sueldo bruto + $5 por cada hora extra.
        double aportesJubilatorios = porcentajeSueldoBruto + 5 * cantHorasExtra;

        return obraSocial + aportesJubilatorios;
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
            "* Horas Extras: $40 por cada hora (" + this.cantHorasExtra + ") = $" + this.cantHorasExtra*40 + "\n" +
            "Retenciones = " + this.retenciones() + "\n" +
            "* Obra social: 10% del sueldo bruto ($" + sueldoBruto*0.1 + ") + $25 si supera los 50 anios ($" + ((this.edad() > 50) ? 25 : 0) + ")\n" +
            "* Aporte jubilatorio: 10% del sueldo bruto ($" + sueldoBruto*0.1 + ") + $5 por cada hora extra (" + this.cantHorasExtra + ") = $" + (this.sueldoBruto()*0.1 +5*this.cantHorasExtra) + "\n" +
            " ------------------ " + "\n";
        
        return recibo;
    }
    
}
