import java.util.Scanner;

public class Con_eje3
{
    static final String fantasia = """
            Libro recomendado para genero Fantasía:
            
            "El nombre del viento" de Patrick Rothfuss.
            Es el primer libro de "Crónica del asesino de reyes".
            Donde seguimos a Kvothe, un hombre legendario que narra su vida llena de magia, aventuras y misterios.
            """;
    static final String misterio = """
            Libro recomendado para genero Misterio:
            
            "El silencio de los corderos" de Thomas Harris.
            Un thriller psicológico lleno de tensión.
            Donde el detective Clarice Starling trata de atrapar a un asesino en serie con la ayuda del temido Hannibal Lecter.
            """;
    static final String romance = """
            Libro recomendado para genero Romance:
            
            "Orgullo y prejuicio" de Jane Austen.
            Un clásico que explora el amor, las expectativas sociales y las segundas oportunidades.
            Con la memorable relación entre Elizabeth Bennet y el señor Darcy.
            """;
    static final String ciencia_ficcion = """
            Libro recomendado para genero Ciencia Ficción:
            
            "Dune" de Frank Herbert.
            Una épica espacial que trata temas de poder, religión y ecología.
            Ambientada en un futuro lejano en el planeta desértico de Arrakis.
            """;
    public static String recomendar_libro(int opcion){
        return switch (opcion) {
            case 1 -> fantasia;
            case 2 -> misterio;
            case 3 -> romance;
            case 4 -> ciencia_ficcion;
            default -> "Opción invalida.";
        };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su genero favorito: \n1. Fantasía \n2. Misterio \n3. Romance \n4. Ciencia Ficción \nSu opción: ");
        try{
            int opcion = sc.nextInt();
            System.out.println(recomendar_libro(opcion));
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
