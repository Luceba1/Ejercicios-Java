import java.util.Scanner;

public class Buc_eje2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número N: ");
        int N = scanner.nextInt();

        for (int i = 0; i <= N; i++)
        {
            long factorial = 1;
            for (int j = 1; j <= i; j++)
            {
                factorial *= j;
            }
            System.out.println("Factorial de " + i + " es " + factorial);
        }
    }
}
