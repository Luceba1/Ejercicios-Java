import java.util.Scanner;

public class Con_eje7
{
    public static String recomendacion(int estado){
        return switch (estado){
            case 1 -> """
                    Dibujo libre:
                    Tómate unos minutos para dibujar algo que te haga feliz, ya sea un paisaje, un personaje o simplemente formas coloridas.
                    No te preocupes por la técnica; lo importante es disfrutar el proceso.
                    """;
            case 2 -> """
                    Escritura de cartas:
                    Escribe una carta a alguien que te haga sentir bien, expresando tus pensamientos y sentimientos.
                    Puede ser una carta real o solo un ejercicio para liberarte de la tristeza.
                    """;
            case 3 -> """
                    Ejercicio rápido:
                    Haz una serie de saltos, estiramientos o una breve rutina de ejercicio (5-10 minutos).
                    La actividad física te ayudará a canalizar esa energía de manera positiva.
                    """;
            case 4 -> """
                    Meditación guiada:
                    Dedica unos minutos a la meditación.
                    Encuentra un lugar tranquilo, cierra los ojos y sigue una meditación guiada o simplemente concéntrate en tu respiración, inhalando y exhalando profundamente.
                    """;
            default -> "Opción incorrecta.";
        };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int estado = 0;
            while(estado < 1 || estado > 4){
                System.out.print("Ingrese su estado de ánimo: \n1. Feliz \n2. Triste \n3. Enérgico \n4. Relajado \nSu opción: ");
                estado = sc.nextInt();
            }
            System.out.println("\n" +recomendacion(estado));
        }catch (Exception e){
            System.out.println("Error: " +e);
        }
    }
}
