import java.util.Scanner;

public class Con_eje4
{
    static final String bajo_peso = """
            Bajo peso:
            
            Recomendación: Es importante aumentar la ingesta calórica de manera saludable,
            Preferiblemente bajo la guía de un nutricionista.
            Incorporar más alimentos ricos en nutrientes como:
            Proteínas, carbohidratos complejos, y grasas saludables puede ayudar a alcanzar un peso saludable.
            """;
    static final String peso_normal = """
            Peso normal:
            
            Recomendación: Mantener una alimentación balanceada y realizar actividad física regularmente es clave para conservar este peso.
            Un estilo de vida activo y saludable es fundamental para mantener una buena salud a largo plazo.
            """;
    static final String sobrepeso = """
            Sobrepeso:
            
            Recomendación: Es recomendable mejorar los hábitos alimenticios,
            Reducir el consumo de alimentos ultraprocesados y azúcares, e incrementar la actividad física.
            Consultar con un profesional puede ayudar a crear un plan adecuado para volver al rango de peso saludable.
            """;
    static final String obesidad = """
            Obesidad:
            
            Recomendación: En este caso, es importante adoptar un enfoque más estructurado para perder peso.
            Un nutricionista o dietista puede ayudar a diseñar un plan alimentario adecuado, y el ejercicio regular debe formar parte de la rutina.
            También se recomienda realizar chequeos médicos para evitar complicaciones relacionadas con la obesidad.
            """;
    public static String recomendacion(float IMC){

        if(IMC < 18.5){
            return bajo_peso;
        }
        else if(18.5 <= IMC && IMC <= 24.9){
            return peso_normal;
        }
        else if(25 <= IMC && IMC <= 29.9){
            return sobrepeso;
        }
        else if(IMC >= 30){
            return obesidad;
        }
        else return "Error";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Ingrese su peso en kilogramos: ");
            float peso = sc.nextFloat();
            System.out.print("Ingrese su altura en metros: ");
            float altura = sc.nextFloat();
            float IMC = (peso / (altura * altura));
            System.out.println(recomendacion(IMC));
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
