import java.util.Scanner;

public class Ite_eje1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] actividades = {"estudiar", "hacer ejercicios", "leer", "tiempo libre"};
        int totalHoras = 0, i = 0;

        while (i < actividades.length)
        {
            System.out.println("Ingrese las horas dedicadas a " + actividades[i] + ": ");
            int horas = sc.nextInt();
            totalHoras += horas;
            i++;
        }

        System.out.println("El tiempo total dedicado es: " + totalHoras + " horas.");
    }
}
