public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Que onda manga de nebros");
        System.out.println(multiploMaxMil(5, 16));
    }

    public static int multiploMaxMil(int x, int y) {
        
        int i = 1000;
        int prod = x*y;
        while (i > prod) {
            if (i % prod == 0) {
                System.out.println(i);
                System.out.println(prod);
                return i;
            }
            i--;
        }

        return -1;
    }
}
