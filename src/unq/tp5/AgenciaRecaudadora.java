package unq.tp5;

public class AgenciaRecaudadora implements Agencia {

    private String nombre;
    private double pagoRegistrado;
    
    public AgenciaRecaudadora(String nombre) {
        this.nombre = nombre;
        this.pagoRegistrado = 0d;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPagoRegistrado() {
        return pagoRegistrado;
    }

    @Override
    public void registrarPago(Factura factura) {
        this.pagoRegistrado += factura.montoAPagar();
    }
    
}
