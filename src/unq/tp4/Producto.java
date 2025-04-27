package unq.tp4;

public class Producto {
    private String nombre;
    private double precioBase;
    private boolean esPrecioCuidado;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.esPrecioCuidado = false;
    }

    public Producto(String nombre, double precioBase, boolean esPrecioCuidado) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.esPrecioCuidado = esPrecioCuidado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isPrecioCuidado() {
        return esPrecioCuidado;
    }

    public void setEsPrecioCuidado(boolean esPrecioCuidado) {
        this.esPrecioCuidado = esPrecioCuidado;
    }

    public double precioFinal() {
        return this.precioBase;
    }
    
    public void aumentarPrecio(double aumento) {
        this.precioBase += aumento;
    }
}
