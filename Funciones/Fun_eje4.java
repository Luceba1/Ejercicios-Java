public class Fun_eje4
{
    public static void main(String[] args)
    {
        String[] clientes = {"Juan", "Ana", "Luis", "Maria", "Carlos"};
        int[] compras = {5, 12, 8, 15, 3};

        calcularDescuentos(clientes, compras);
    }

    public static void calcularDescuentos(String[] clientes, int[] compras)
    {
        System.out.println("Clientes con descuento del 10%:");
        for (int i = 0; i < clientes.length; i++)
        {
            if (compras[i] > 10)
            {
                System.out.println(clientes[i] + " ha comprado " + compras[i] + " veces. Aplica descuento.");
            }
        }
    }
}
