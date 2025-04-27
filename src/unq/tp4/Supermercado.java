package unq.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    private String nombre;
    private String direccion;
    private List<Producto> productos = new ArrayList<Producto>();
    
    
    public Supermercado(String nombre, String direccion, List<Producto> productos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.productos = productos;
    }
    
    public Supermercado(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
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

    public int cantProductos() {
        return this.productos.size();
    }

    public double sumatorioPrecios() {
        double suma = 0;
        
        for (int i = 0; i < productos.size(); i++) {
            suma += productos.get(i).precioFinal();
        }

        return suma;
    }

    public void agregarProducto(Producto prod) {
        this.productos.add(prod);
    }
}
