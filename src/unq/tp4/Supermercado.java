package unq.tp4;

public class Supermercado {
    private String nombre;
    private String direccion;
    private Producto[] productos;
    
    
    public Supermercado(String nombre, String direccion, Producto[] productos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.productos = productos;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public Producto[] getProductos() {
        return productos;
    }


    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public int cantProductos() {
        return productos.length;
    }

    public double sumatorioPreciosProductos() {
        double suma = 0;

        for (Producto producto : productos) {
            suma += producto.precioFinal();
        }

        return suma;
    }
}
