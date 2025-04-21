package unq.tp3.counter;

import java.util.ArrayList;

public class Counter {
    private ArrayList<Integer> list = new ArrayList<Integer>();
    private int even;
    private int odd;

    public Counter() {
        this.even = 0;
        this.odd = 0;
    }

    public void addNumber(int number) {

        if (number % 2 == 0) {
            ++this.even;
        } else {
            ++this.odd;
        }
        list.add(number);
    }

    public int getEvenOccurences() {
        return this.even;
    }

    public int getOddOccurences() {
        return this.odd;
    }

    public int getMultiplyOccurences(int number) {
        int amount = 0;

        for (int i = 0; i < this.list.size(); i++) {
            if(this.list.get(i) % number == 0) {
                ++amount;
            }
        }

        return amount;
    }
    
    // Punto 2 - TP 3

    public int getMoreEvenOccurences() {
        int numConMasPares = this.list.get(0);
        
        for (int i = 1; i < this.list.size(); i++) {
            numConMasPares = tieneMasPares(numConMasPares, this.list.get(i));
        }
        
        return numConMasPares;
    }

    private static int tieneMasPares(int x, int y) {
        if(cantPares(x) >= cantPares(y)) {
            return x;
        } else {
            return y;
        }
    }

    private static int cantPares(int x) {
        int pares = 0;
        int temp = x;
        
        do {
            int posiblePar = temp % 10;
            if (posiblePar % 2 == 0) { ++pares; }
            temp /= 10;
        } while (temp != 0);

        return pares;
    }
    
}
