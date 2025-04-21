package unq.tp3.equipoDeTrabajo;

public class EquipoDeTrabajo {
    private String nombre;
    private Persona[] integrantes;

    public EquipoDeTrabajo(String nombre, Persona[] integrantes) {
        this.nombre = nombre;
        this.integrantes = integrantes;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public double promedioEdad() {
        int sumaEdad = 0;

        for (int i = 0; i < this.integrantes.length; i++) {
            sumaEdad += this.integrantes[i].getEdad();
        }

        return sumaEdad/this.integrantes.length;
    }
}
