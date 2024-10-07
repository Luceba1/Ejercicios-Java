import java.util.Scanner;

public class Sec_eje2
{
    static final double met_correr = 8.3;
    static final double met_nadar = 7.0;
    static final double met_andar = 3.8;
    static final double met_bicicleta = 7.5;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su peso en kg: ");
        float peso = sc.nextFloat();
        System.out.print("Ingrese la duracion del ejercicio en minutos: ");
        int duracion = sc.nextInt();
        System.out.print("Ingrese un ejercicio: \n1. Correr \n2. Nadar \n3. Andar \n4. Bicicleta \nSu opcion: ");
        double calorias = 0;
        int op = sc.nextInt();
        switch(op){
            case 1:
                calorias = met_correr * peso * duracion *  0.0175;
                break;
            case 2:
                calorias = met_nadar * peso * duracion *  0.0175;
                break;
            case 3:
                calorias = met_andar * peso * duracion *  0.0175;
                break;
            case 4:
                calorias = met_bicicleta * peso * duracion *  0.0175;
                break;
            default:
                System.out.println("Ingrese una opcion correcta.");
                break;
        }
        System.out.println("Las calorias quemadas son: " + calorias);
    }
}
