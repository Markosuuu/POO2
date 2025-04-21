package unq.tp3.point;

public class Rectangulo {
    int base;
    int altura;
    Point puntoOrigen;
    
    // Constructor
    public Rectangulo(int base, int altura, Point puntoOrigen) {
        this.base = base;
        this.altura = altura;
        this.puntoOrigen = puntoOrigen;
    }
    
    // Getters y Setters
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Point getPuntoOrigen() {
        return puntoOrigen;
    }

    public void setPuntoOrigen(Point puntoOrigen) {
        this.puntoOrigen = puntoOrigen;
    }


    // Methods
    public int area() {
        return this.altura * this.base;
    }
    
    public int perimetro() {
        return this.altura*2 + this.base*2;
    }

    public String tipoOrientacion() {
        if (this.base > this.altura) {
            return "Es horizontal";
        } else if (this.base < this.altura) {
            return "Es vertical";
        } else {
            return "Es un cuadrado";
        }
    }
}
