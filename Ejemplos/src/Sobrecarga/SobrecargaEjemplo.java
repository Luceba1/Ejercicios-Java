package Sobrecarga;

public class SobrecargaEjemplo {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.sumar(3, 4));
        System.out.println(calc.sumar(2.5, 4.5));
        System.out.println(calc.sumar(1, 2, 3));
    }
}
