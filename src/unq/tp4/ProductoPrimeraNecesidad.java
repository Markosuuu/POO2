package unq.tp4;

public class ProductoPrimeraNecesidad extends Producto{
    
    private double descuento; 

    public ProductoPrimeraNecesidad(String nombre, double precioBase, double descuento) {
        super(nombre, precioBase);
        this.descuento = descuento;
    }

    public ProductoPrimeraNecesidad(String nombre, double precioBase, boolean esPrecioCuidado, double descuento) {
        super(nombre, precioBase, esPrecioCuidado);
        this.descuento = descuento;
    }

    public double precioFinal() {
        return this.getPrecioBase() - (this.getPrecioBase() * descuento / 100);
    }
}
