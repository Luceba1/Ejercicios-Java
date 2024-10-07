import java.util.Scanner;

public class Sec_eje4
{
    static String Feliz = """
            Playlist recomendada para su estado de animo:
            
            Happy – Pharrell Williams
            Can’t Stop the Feeling! – Justin Timberlake
            Good as Hell – Lizzo
            Walking on Sunshine – Katrina and the Waves
            I Gotta Feeling – The Black Eyed Peas
            """;
    static String Triste = """
            Playlist recomendada para su estado de animo:
            
            Someone Like You – Adele
            Fix You – Coldplay
            The Night We Met – Lord Huron
            Tears Dry on Their Own – Amy Winehouse
            All I Want – Kodaline
            """;
    static String Energico = """
            Playlist recomendada para su estado de animo:
            
            Stronger – Kanye West
            Eye of the Tiger – Survivor
            Thunderstruck – AC/DC
            Lose Yourself – Eminem
            We Will Rock You – Queen
            """;
    static String Relajado = """
            Playlist recomendada para su estado de animo:
            
            Weightless – Marconi Union
            Sunset Lover – Petit Biscuit
            Better Together – Jack Johnson
            Banana Pancakes – Jack Johnson
            Holocene – Bon Iver
            """;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su estado de animo: \n1. Feliz \n2. Triste \n3. Enérgico \n4. Relajado \nSu opción: ");
        int estado = sc.nextInt();
        switch (estado) {
            case 1:
                System.out.println(Feliz);
                break;
            case 2:
                System.out.println(Triste);
                break;
            case 3:
                System.out.println(Energico);
                break;
            case 4:
                System.out.println(Relajado);
                break;
            default:
                System.out.println("Opcion fuera de rango.");
                break;
        }
    }
}
