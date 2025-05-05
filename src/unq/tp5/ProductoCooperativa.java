package unq.tp5;

public class ProductoCooperativa extends Producto {

    public ProductoCooperativa(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double montoAPagar() {
        return getPrecioBase() * 0.9d;
    }

}
