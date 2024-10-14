public class Fun_eje3
{
    public static void main(String[] args)
    {
        String[] clientes = {"Juan", "Ana", "Luis", "Maria", "Carlos"};
        int[] facturasPendientes = {300, 700, 200, 900, 450};

        enviarFacturas(clientes, facturasPendientes);
    }

    public static void enviarFacturas(String[] clientes, int[] facturasPendientes)
    {
        System.out.println("Clientes con facturas mayores a $500:");
        for (int i = 0; i < clientes.length; i++)
        {
            if (facturasPendientes[i] > 500)
            {
                System.out.println(clientes[i] + " - Factura: $" + facturasPendientes[i]);
            }
        }
    }
}


