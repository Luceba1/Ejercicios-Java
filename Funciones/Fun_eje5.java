public class Fun_eje5
{
    public static void main(String[] args)
    {
        int[] calificaciones = {4, 5, 3, 5, 2, 4, 5};

        double promedio = calcularPromedioSatisfaccion(calificaciones);
        System.out.println("El promedio de satisfacción es: " + promedio);
    }

    public static double calcularPromedioSatisfaccion(int[] calificaciones)
    {
        int total = 0;
        for (int calificacion : calificaciones)
        {
            total += calificacion;
        }
        return (double) total / calificaciones.length;
    }
}
