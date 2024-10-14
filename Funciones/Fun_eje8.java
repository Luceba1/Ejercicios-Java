public class Fun_eje8
{
    public static void main(String[] args)
    {
        String[] empleados = {"Juan", "Ana", "Luis", "Maria", "Carlos"};
        int[] horasTrabajadas = {40, 35, 42, 38, 45};

        calcularPagoSemanal(empleados, horasTrabajadas);
    }

    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas)
    {
        double tarifaPorHora = 15.0;
        System.out.println("Pago semanal de los empleados:");
        for (int i = 0; i < empleados.length; i++)
        {
            double pago = horasTrabajadas[i] * tarifaPorHora;
            System.out.println(empleados[i] + " trabajó " + horasTrabajadas[i] + " horas. Pago: $" + pago);
        }
    }
}
