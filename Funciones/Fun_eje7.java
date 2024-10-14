public class Fun_eje7
{
    public static void main(String[] args)
    {
        double[] compras = {450.0, 600.0, 300.0, 700.0, 520.0};

        aplicarDescuento(compras);
    }

    public static void aplicarDescuento(double[] compras)
    {
        System.out.println("Compras con descuentos aplicados (15% para compras superiores a $500):");
        for (double compra : compras)
        {
            if (compra > 500)
            {
                double descuento = compra * 0.15;
                System.out.println("Compra: $" + compra + " - Descuento: $" + descuento + " - Total: $" + (compra - descuento));
            } else
            {
                System.out.println("Compra: $" + compra + " (No aplica descuento)");
            }
        }
    }
}
