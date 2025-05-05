package unq.tp5;

public class Impuesto extends Factura {

    private double tasaDelServicio;

    public Impuesto(AgenciaRecaudadora agencia, double tasaDelServicio) {
        super(agencia);
        this.tasaDelServicio = tasaDelServicio;
    }

    @Override
    public double montoAPagar() {
        return this.tasaDelServicio;
    }
}
