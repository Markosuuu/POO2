package unq.tp3.multioperador;

import java.util.ArrayList;

public class Multioperador {

    private ArrayList<Integer> list;

    // constructor

    public Multioperador(ArrayList<Integer> list) {
        this.list = list;
    }

    public int sumarTodos() {
        int suma = 0;

        for (int i = 0; i < this.list.size(); i++) {
            suma += this.list.get(i);            
        }
        
        return suma;
    }
    
    public int restarTodos() {
        if(this.list.isEmpty()) { return 0; };
        int resta = this.list.get(0);

        for (int i = 1; i < this.list.size(); i++) {
            resta -= this.list.get(i);            
        }
        
        return resta;
    }

    public int multiplicarTodos() {
        if(this.list.isEmpty()) { return 0; };
        int prod = 1;

        for (int i = 0; i < this.list.size(); i++) {
            prod *= this.list.get(i);            
        }

        return prod;
    }
}
