package Downcasting;

public class DowncastingEjemplo {
    public static void main(String[] args) {
        Padre p = new Hijo(); // Upcasting
        Hijo h = (Hijo) p;    // Downcasting
        h.jugar();
    }
}
