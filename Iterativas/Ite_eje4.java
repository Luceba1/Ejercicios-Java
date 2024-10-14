import java.util.Scanner;

public class Ite_eje4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int totalVentas = 0;

        for (int i = 1; i <= 7; i++)
        {
            System.out.println("Ingrese las ventas del día " + i + ": ");
            int ventas = sc.nextInt();
            totalVentas += ventas;
        }

        System.out.println("El total de ventas de la semana es: " + totalVentas);
    }
}
