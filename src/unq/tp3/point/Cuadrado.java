package unq.tp3.point;

public class Cuadrado extends Rectangulo {

    public Cuadrado(int base, Point puntoOrigen) {
        super(base, base, puntoOrigen);
    }
    
    // Getters and Setters

    public void setBase(int base) {
        this.base = base;
        this.altura = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
        this.base = altura;
    }

    // Methods
    public int area() {
        return this.base * this.base;
    }
    
    public int perimetro() {
        return this.base * 4;
    }

    public String tipoOrientacion() {
        return "Es un cuadrado";
    }

}
