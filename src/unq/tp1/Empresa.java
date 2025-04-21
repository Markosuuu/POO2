package unq.tp1;

public class Empresa {
    private String nombre;
    private String cuit;
    private Empleado[] empleados;

    // Constructor
    public Empresa(String nombre, String cuit, Empleado[] empleados) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.empleados = empleados;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }


    
}
