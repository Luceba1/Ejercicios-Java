import java.util.Scanner;

public class Fun_eje1
{
    public static void main(String[] args)
    {
        int[] ventas = new int[30];
        Scanner sc = new Scanner(System.in);

        // Ingresar las ventas diarias
        for (int i = 0; i < ventas.length; i++)
        {
            System.out.println("Ingrese las ventas del día " + (i + 1) + ": ");
            ventas[i] = sc.nextInt();
        }

        // Llamar a la función para calcular los ingresos
        int totalIngresos = calcularIngresosMensuales(ventas);
        System.out.println("El total de ingresos mensuales es: $" + totalIngresos);
    }

    public static int calcularIngresosMensuales(int[] ventas)
    {
        int total = 0;
        for (int venta : ventas)
        {
            total += venta;
        }
        return total;
    }
}
