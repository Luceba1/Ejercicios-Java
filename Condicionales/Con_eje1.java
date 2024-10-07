import java.util.Scanner;

public class Con_eje1
{
    static String accion = """
            Acción: Mad Max: Fury Road (2015) - Una explosiva y visualmente impactante película de persecuciones y combates en un mundo post-apocalíptico.
            """;
    static String comedia = """
            Comedia: Superbad (2007) - Una comedia juvenil con situaciones hilarantes y personajes entrañables que buscan diversión antes de graduarse de la escuela secundaria.
            """;
    static String drama = """
            Drama: The Pursuit of Happyness (2006) - Basada en hechos reales, es una historia conmovedora sobre la lucha de un hombre por una vida mejor para él y su hijo.
            """;
    static String ciencia_ficcion = """
            Ciencia ficción: Interstellar (2014) - Una épica aventura espacial que explora temas de supervivencia, amor y los misterios del espacio-tiempo.
            """;
    public static String pelicula(int opcion){
        return switch (opcion) {
            case 1 -> accion;
            case 2 -> comedia;
            case 3 -> drama;
            case 4 -> ciencia_ficcion;
            default -> "Opcion no valida.";
        };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su genero favorito: \n1. Acción \n2. Comedia \n3. Drama \n4. Ciencia Ficción \nSu opción: ");
        try{
            int op = sc.nextInt();
            System.out.println(pelicula(op));
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
