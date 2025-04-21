package unq.tp1;

import java.time.LocalDate;

public class EmpleadoContratado extends Empleado {
    private int nroContrato;
    private String medioDePago;
    
    public EmpleadoContratado(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento,
            double sueldoBasico, int nroContrato, String medioDePago) {
        super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
        this.nroContrato = nroContrato;
        this.medioDePago = medioDePago;
    }

    public int getNroContrato() {
        return nroContrato;
    }

    public void setNroContrato(int nroContrato) {
        this.nroContrato = nroContrato;
    }

    public String getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(String medioDePago) {
        this.medioDePago = medioDePago;
    }

    double sueldoBruto() {
        return sueldoBasico;
    }
    
    double retenciones() {
        return 50;
    }
    
    String generarReciboDeHaberes() {
        double sueldoBruto = this.sueldoBruto();

        String recibo = 
            "Nombre: " + this.nombre + "\n" + 
            "Direccion: " + this.direccion + "\n" + 
            "Fecha de emision: " + LocalDate.now().toString()+ "\n" +
            "Sueldo bruto: " + sueldoBruto + "\n" +
            "Sueldo neto: " + this.sueldoNeto() + "\n" +
            "Desgloce de conceptos: " + "\n" +
            "Retenciones = 50" + this.retenciones() + "\n" +
            " ------------------ " + "\n";
        
        return recibo;
    }
    
    
}
