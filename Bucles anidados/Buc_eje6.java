import java.util.Scanner;

public class Buc_eje6
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número N: ");
        int N = scanner.nextInt();

        System.out.println("Números primos entre 2 y " + N + ":");
        for (int i = 2; i <= N; i++)
        {
            boolean esPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++)
            {
                if (i % j == 0)
                {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo)
            {
                System.out.println(i);
            }
        }
    }
}
