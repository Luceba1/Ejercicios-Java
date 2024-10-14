import java.util.Scanner;

public class Ite_eje2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de empleados: ");
        int empleados = sc.nextInt();
        int i = 0;
        int salarioPorHora = 15;

        while (i < empleados)
        {
            System.out.println("Ingrese las horas trabajadas por el empleado " + (i + 1) + ": ");
            int horasTrabajadas = sc.nextInt();
            int salario = horasTrabajadas * salarioPorHora;
            System.out.println("El salario del empleado " + (i + 1) + " es: $" + salario);
            i++;
        }
    }
}
