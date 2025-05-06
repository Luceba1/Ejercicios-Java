package Coercion;

public class CoercionEjemplo {
    public static void main(String[] args) {
        int entero = 5;
        double decimal = entero; // Coerción implícita
        int resultado = (int) 3.9; // Coerción explícita
        System.out.println("Decimal: " + decimal);
        System.out.println("Resultado truncado: " + resultado);
    }
}
