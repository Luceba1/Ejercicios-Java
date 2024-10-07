import java.util.Scanner;

public class Sec_eje1
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia = 0;
        int mes = 0;
        int anio = 0;


        System.out.println("\nIntroduzca su fecha de nacimiento (en formato DD/MM/AAAA)" +
                           "\ny le diré su signo zodiacal y sus características");

        System.out.println("\nIntroduzca día: "); dia = sc.nextInt();

        System.out.println("\nIntroduzca mes: "); mes = sc.nextInt();

        System.out.println("\nIntroduzca año: "); anio = sc.nextInt();

        System.out.println("\n" + dia + "/" + mes + "/" + anio);

        if (dia > 31 && mes == 1 || dia > 31 && mes == 3
                || dia > 31 && mes == 5 || dia > 31 && mes == 7
                || dia > 31 && mes == 10 || dia > 31 && mes == 12
                || dia > 30 && mes == 4 || dia > 30 && mes == 6
                || dia > 30 && mes == 9 || dia > 30 && mes == 11
                || dia > 28 && mes == 2 && !bisiesto(anio)
                || dia > 29 && mes == 2 && bisiesto(anio))
        {
            System.out.println("Fecha no válida");
        }

        else if (dia >= 22 && mes == 12 || dia <= 19 && mes == 1)
        {
            System.out.println("\nSigno zodiacal: Capricornio.");
            System.out.println("\nElemento: Tierra.");
            System.out.println("\nCaracterísticas: Ambicioso, disciplinado, práctico y responsable. " +
                               "\nPersisten en alcanzar sus metas, pero pueden ser rígidos o pesimistas.");
        }

        else if (dia >= 20 && mes == 1 || dia <= 18 && mes == 2)
        {
            System.out.println("\nSigno zodiacal: Acuario");
            System.out.println("\nElemento: Aire");
            System.out.println("\nCaracterísticas: Innovador, humanitario, independiente y original. " +
                               "\nLes gusta la libertad y el pensamiento progresista, pero pueden ser distantes o excéntricos.");
        }

        else if (dia >= 19 && mes == 2 || dia <= 20 && mes == 3)
        {
            System.out.println("\nSigno zodiacal: Piscis");
            System.out.println("\nElemento: Agua");
            System.out.println("\nCaracterísticas: Soñador, compasivo, intuitivo y artístico. " +
                               "\nSon empáticos y sensibles, pero pueden ser evasivos o demasiado idealistas.");
        }

        else if (dia >= 21 && mes == 3 || dia <= 19 && mes == 4)
        {
            System.out.println("\nSigno zodiacal: Aries");
            System.out.println("\nElemento: Fueg");
            System.out.println("\nCaracterísticas: Valiente, enérgico, apasionado y competitivo. " +
                               "\nSon líderes naturales, pero pueden ser impulsivos e impacientes.");
        }

        else if (dia >= 20 && mes == 4 || dia <= 20 && mes == 5)
        {
            System.out.println("\nSigno zodiacal: Tauro");
            System.out.println("\nElemento: Tierra");
            System.out.println("\nCaracterísticas: Persistente, confiable, paciente y amante de la estabilidad. " +
                               "\nAprecian la comodidad y la seguridad, pero pueden ser tercos.");
        }

        else if (dia >= 21 && mes == 5 || dia <= 20 && mes == 6)
        {
            System.out.println("\nSigno zodiacal: Géminis");
            System.out.println("\nElemento: Aire");
            System.out.println("\nCaracterísticas: Adaptable, curioso, sociable y versátil. " +
                               "\nLes gusta aprender y comunicarse, pero pueden ser indecisos o dispersos.");
        }

        else if (dia >= 21 && mes == 6 || dia <= 22 && mes == 7)
        {
            System.out.println("\nSigno zodiacal: Cáncer");
            System.out.println("\nElemento: Agua");
            System.out.println("\nCaracterísticas: Emocional, protector, intuitivo y hogareño. " +
                               "\nValoran profundamente a la familia y amigos, pero pueden ser reservados o vulnerables.");
        }

        else if (dia >= 23 && mes == 7 || dia <= 22 && mes == 8)
        {
            System.out.println("\nSigno zodiacal: Leo");
            System.out.println("\nElemento: Fuego");
            System.out.println("\nCaracterísticas: Carismático, generoso, confiado y creativo. " +
                               "\nDisfrutan de ser el centro de atención, pero pueden ser dominantes o egocéntricos.");
        }

        else if (dia >= 23 && mes == 8 || dia <= 22 && mes == 9)
        {
            System.out.println("\nSigno zodiacal: Virgo");
            System.out.println("\nElemento: Tierra");
            System.out.println("\nCaracterísticas: Meticuloso, trabajador, analítico y servicial. " +
                               "\nSe enfocan en los detalles, pero a veces pueden ser críticos o perfeccionistas.");
        }

        else if (dia >= 23 && mes == 9 || dia <= 22 && mes == 10)
        {
            System.out.println("\nSigno zodiacal: Libra");
            System.out.println("\nElemento: Aire");
            System.out.println("\nCaracterísticas: Diplomático, equilibrado, sociable y amante de la belleza. " +
                               "\nBuscan la armonía, pero pueden ser indecisos o complacientes.");
        }

        else if (dia >= 23 && mes == 10 || dia <= 21 && mes == 11)
        {
            System.out.println("\nSigno zodiacal: Escorpio");
            System.out.println("\nElemento: Agua");
            System.out.println("\nCaracterísticas: Intenso, apasionado, misterioso y leal. " +
                               "\nTienen una gran profundidad emocional, pero pueden ser celosos o posesivos.");
        }

        else if (dia >= 22 && mes == 11 || dia <= 21 && mes == 12)
        {
            System.out.println("\nSigno zodiacal: Sagitario");
            System.out.println("\nElemento: Fuego");
            System.out.println("\nCaracterísticas: Aventurero, optimista, independiente y filosófico. " +
                               "\nLes encanta explorar y aprender, pero pueden ser impacientes o irresponsables.");
        }

        else
        {
            System.out.println("Fecha no válida");
        }

    }

    public static boolean bisiesto(int anio) {
        if (anio % 4 == 0)
        {
            if (anio % 100 == 0)
            {
                return anio % 400 == 0;
            }

            else
            {
                return true;
            }

        }

        else
        {
            return false;
        }

    }

}
