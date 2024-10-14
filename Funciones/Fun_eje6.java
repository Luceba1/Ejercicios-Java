public class Fun_eje6
{
    public static void main(String[] args)
    {
        double[] facturas = {100.0, 200.0, 300.0, 400.0, 500.0};

        calcularImpuesto(facturas);
    }

    public static void calcularImpuesto(double[] facturas)
    {
        System.out.println("Facturas con impuestos aplicados (21%):");
        for (double factura : facturas) {
            double impuesto = factura * 0.21;
            System.out.println("Factura: $" + factura + " - Impuesto: $" + impuesto + " - Total: $" + (factura + impuesto));
        }
    }
}
