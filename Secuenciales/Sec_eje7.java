import java.util.Scanner;

public class Sec_eje7
{
    static double w1 = 0.4; //Satisfaccion con la vida
    static double w2 = 0.2; //Estrés
    static double w3 = 0.2; //Salud
    static double w4 = 0.2; //Relaciones humanas

    public static double calculadora_felicidad(int FSL, int NE, int NS, int RH){
        return ((w1 * FSL) + (-w2 * NE) + (w3 * NS) + (w4 * RH)) / (w1 + w2 + w3 + w4);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int FSL,NE,NS,RH;
        double IH;
        System.out.print("Ingrese su satisfaccion con la vida del 1 al 10: ");
        FSL = sc.nextInt();
        System.out.print("Ingrese su nivel de estrés del 1 al 10: ");
        NE = sc.nextInt();
        System.out.print("Ingrese su nivel de salud del 1 al 10: ");
        NS = sc.nextInt();
        System.out.print("Ingrese su nivel de relaciones humanas del 1 al 10: ");
        RH = sc.nextInt();
        IH = calculadora_felicidad(FSL, NE, NS, RH);
        System.out.println("Su indice de felicidad es de: " + IH);
    }
}
