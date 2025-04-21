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
        /*
        Obra Social: 10% de su sueldo bruto + $25 si supera los 50 años
        Aportes Jubilatorios: 10% de su sueldo bruto + $5 por cada hora extra.
        */
        int antiguedad = (this.edad() > 50) ? 25 : 0;
        double porcentajeSueldoBruto = this.sueldoBruto() * 0.1;

        double obraSocial = porcentajeSueldoBruto + antiguedad;
        double aportesJubilatorios = porcentajeSueldoBruto + 5 * cantHorasExtra;

        return obraSocial + aportesJubilatorios;
    }

    
    
}
