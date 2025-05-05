package unq.tp5;

public class Servicio extends Factura {
    private double costoUnidad;
    private int cantidadUnidades;

    public Servicio(AgenciaRecaudadora agencia, double costoUnidad, int cantidadUnidades) {
        super(agencia);
        this.costoUnidad = costoUnidad;
        this.cantidadUnidades = cantidadUnidades;
    }

    @Override
    public double montoAPagar() {
        return this.costoUnidad * this.cantidadUnidades;
    }

}
