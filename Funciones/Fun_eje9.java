public class Fun_eje9
{
    public static void main(String[] args)
    {
        double[] preciosOriginales = {100.0, 200.0, 300.0, 400.0, 500.0};

        calcularPrecioFinal(preciosOriginales);
    }

    public static void calcularPrecioFinal(double[] preciosOriginales)
    {
        double descuento = 0.10;
        System.out.println("Precios finales con 10% de descuento aplicado:");
        for (double precio : preciosOriginales)
        {
            double precioFinal = precio - (precio * descuento);
            System.out.println("Precio original: $" + precio + " - Precio final: $" + precioFinal);
        }
    }
}
