import java.util.Scanner;

public class Sec_eje5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la distancia del viaje en kilometros: ");
        float distancia = sc.nextFloat();
        System.out.println("Ingrese el consumo en litros por kilometro: ");
        float consumo = sc.nextFloat();
        System.out.println("Ingrese el precio del combustible por litro: ");
        float precio = sc.nextFloat();
        double costo_total = distancia * consumo * precio;
        System.out.println("El costo total es: " + costo_total);
    }
}
