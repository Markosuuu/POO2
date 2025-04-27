package unq.tp4;

public class Producto {
    private String nombre;
    private double precioBase;
    private boolean esPrimeraNecesidad;
    private boolean perteneceAPreciosCuidados;

    public Producto(String nombre, double precioBase, boolean esPrimeraNecesidad) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.esPrimeraNecesidad = esPrimeraNecesidad;
        this.perteneceAPreciosCuidados = false;
    }

    public Producto(String nombre, double precioBase, boolean esPrimeraNecesidad, boolean perteneceAPreciosCuidados) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.esPrimeraNecesidad = esPrimeraNecesidad;
        this.perteneceAPreciosCuidados = perteneceAPreciosCuidados;
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

    public boolean isEsPrimeraNecesidad() {
        return esPrimeraNecesidad;
    }

    public void setEsPrimeraNecesidad(boolean esPrimeraNecesidad) {
        this.esPrimeraNecesidad = esPrimeraNecesidad;
    }

    public boolean isPerteneceAPreciosCuidados() {
        return perteneceAPreciosCuidados;
    }

    public void setPerteneceAPreciosCuidados(boolean perteneceAPreciosCuidados) {
        this.perteneceAPreciosCuidados = perteneceAPreciosCuidados;
    }

    public double precioFinal() {
        return (this.perteneceAPreciosCuidados) ? this.precioBase * 0.9 : this.precioBase;
    }

    
}
