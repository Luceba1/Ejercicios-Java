import java.util.Scanner;

public class Ite_eje3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de productos: ");
        int productos = sc.nextInt();

        for (int i = 0; i < productos; i++)
        {
            System.out.println("Ingrese la cantidad disponible del producto " + (i + 1) + ": ");
            int cantidad = sc.nextInt();
            if (cantidad < 5)
            {
                System.out.println("Es necesario realizar un pedido del producto " + (i + 1) + ".");
            }
        }
    }
}
