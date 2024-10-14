import java.util.Scanner;

public class Ite_eje5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de empleados: ");
        int empleados = sc.nextInt();
        int i = 0;

        do
        {
            System.out.println("Ingrese las horas trabajadas en la semana por el empleado " + (i + 1) + ": ");
            int horasTrabajadas = sc.nextInt();
            if (horasTrabajadas > 40)
            {
                int horasExtras = horasTrabajadas - 40;
                System.out.println("El empleado " + (i + 1) + " tiene " + horasExtras + " horas extras.");
            }
            else
            {
                System.out.println("El empleado " + (i + 1) + " no tiene horas extras.");
            }
            i++;
        }
        while (i < empleados);
    }
}
