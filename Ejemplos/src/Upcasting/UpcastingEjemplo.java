package Upcasting;

public class UpcastingEjemplo {
    public static void main(String[] args) {
        Vehiculo v = new Auto(); // Upcasting
        v.encender();
        // v.prenderRadio(); // No es accesible desde tipo Vehiculo
    }
}