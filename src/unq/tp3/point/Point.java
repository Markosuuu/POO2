package unq.tp3.point;

public class Point {
    int x;
    int y;

    // Constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Getters y Setters
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public void addPoint(Point p2) {
        this.setX(this.getX() + p2.getX());
        this.setY(this.getY() + p2.getY());
    }

}
