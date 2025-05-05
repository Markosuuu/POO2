package unq.tp5;

public class CajaRegistradora {
    private double montoActual;

    public CajaRegistradora() {
        this.montoActual = 0d;
    }

    public double getMontoActual() {
        return montoActual;
    }

    public void registrar(Producto prod) {
        this.montoActual += prod.getPrecioFinal();
    }

}
