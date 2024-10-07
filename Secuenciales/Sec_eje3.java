import java.util.Scanner;

public class Sec_eje3
{
    static String principiante = """
            Sentadillas: 3 series de 10 repeticiones.
            Flexiones de brazos: 3 series de 10 repeticiones (puedes hacerlas de rodillas si es necesario).
            Plancha: 3 series de 30 segundos.
            Elevaciones de piernas: 3 series de 15 repeticiones.
            Caminata rápida o trote ligero: 10 minutos.""";
    static String intermedio = """
            Sentadillas con peso: 3 series de 12 repeticiones.
            Flexiones de brazos: 3 series de 15 repeticiones.
            Plancha lateral: 3 series de 30 segundos por lado.
            Zancadas: 3 series de 12 repeticiones por pierna.
            Burpees: 3 series de 10 repeticiones.
            Carrera a ritmo moderado: 15 minutos.""";
    static String avanzado = """
            Sentadillas con peso: 4 series de 15 repeticiones.
            Flexiones de brazos con peso: 4 series de 20 repeticiones.
            Plancha con rotación: 4 series de 45 segundos por lado.
            Zancadas con peso: 4 series de 15 repeticiones por pierna.
            Burpees con salto: 4 series de 15 repeticiones.
            Dominadas: 4 series de 10 repeticiones.
            Sprints de alta intensidad: 4 series de 30 segundos con 1 minuto de descanso entre series.""";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nivel de condicion fisica: \n1. Principiante \n2. Intermedio \n3. Avanzado \nSu opcion: ");
        int op;
        op = sc.nextInt();
        switch (op){
            case 1:
                System.out.println("Programa para Principiantes: \n");
                System.out.println(principiante);
                break;
            case 2:
                System.out.println("Programa para Intermedios: \n");
                System.out.println(intermedio);
                break;
            case 3:
                System.out.println("Programa para Avanzado: \n");
                System.out.println(avanzado);
                break;
            default:
                System.out.println("Opcion incorrecta.");
        }
    }
}
