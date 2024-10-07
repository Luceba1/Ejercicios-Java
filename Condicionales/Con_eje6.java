import java.util.Scanner;

public class Con_eje6
{
    public static String evaluacion(int descanso, int ejercicio, int comidas){
        String resultado = "";
        if (descanso < 7){
            resultado += """
                    Intenta ajustar tu rutina para priorizar el descanso.
                    Establece horarios regulares, evita el uso de pantallas antes de dormir y crea un ambiente relajante en tu dormitorio.
                    Dormir lo suficiente es clave para tu energía y bienestar diario.
                    """;
        }
        else if (descanso > 9){
            resultado += """
                    Dormir en exceso puede afectar tu energía y estado de ánimo.
                    Intenta mantener un horario constante y asegúrate de que tu sueño sea de buena calidad, no solo cantidad.
                    Mantente activo durante el día para equilibrar tus niveles de energía.
                    """;
        }
        else resultado += """
                    Mantén esa buena rutina de sueño, ya que dormir entre 7 y 9 horas favorece tu salud y energía diaria.
                    Sigue priorizando la calidad del sueño, evitando distracciones antes de acostarte y manteniendo un horario constante.
                    """;

        if (ejercicio < 30){
            resultado += """
                    
                    Intenta aumentar gradualmente tu actividad física.
                    Incluso pequeñas caminatas, subir escaleras o estiramientos pueden marcar la diferencia.
                    Apunta a moverte al menos 30 minutos al día para mejorar tu salud y bienestar.
                    """;
        }
        else if (ejercicio > 150){
            resultado += """
                    
                    Asegúrate de equilibrar tu rutina con suficiente descanso y recuperación.
                    Escucha a tu cuerpo para evitar el sobreentrenamiento.
                    Mantén una dieta balanceada y recuerda que la calidad del ejercicio es tan importante como la cantidad.
                    """;
        }
        else resultado += """
                    
                    Hacer entre 30 y 150 minutos de ejercicio al día es excelente para tu salud.
                    Mantén la consistencia y asegúrate de variar tu rutina, incluyendo ejercicios de fuerza y flexibilidad para un entrenamiento equilibrado.
                    """;

        if (comidas < 3){
            resultado += """
                    
                    Intenta agregar al menos una comida balanceada más para mantener tu energía y nutrientes.
                    Distribuir tus comidas ayuda a evitar el hambre excesiva y a mejorar tu bienestar general.
                    """;
        }
        else if (comidas > 5){
            resultado += """
                    
                    Asegúrate de que las porciones sean adecuadas y que tu dieta sea equilibrada.
                    Mantén un enfoque en la calidad de los alimentos para evitar consumir excesos innecesarios.
                    Escucha a tu cuerpo y ajusta según sea necesario para mantener tu energía y bienestar.
                    """;
        }
        else resultado += """
                    
                    Comer entre 3 y 5 comidas saludables al día es ideal para mantener un nivel de energía constante.
                    Asegúrate de que cada comida sea equilibrada, incluyendo proteínas, carbohidratos y grasas saludables.
                    También, escucha a tu cuerpo y ajusta las porciones según tus necesidades.
                    """;
        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int descanso = -1;
            while (descanso < 0 || descanso > 24){
                System.out.print("Ingrese la cantidad de horas que duerme al dia: ");
                descanso = sc.nextInt();
            }
            int ejercicio = -1;
            while (ejercicio < 0 || ejercicio > 1440){
                System.out.print("Ingrese la cantidad de minutos que hace ejercicio al dia: ");
                ejercicio = sc.nextInt();
            }
            int comidas = -1;
            while (comidas < 0 || comidas > 10){
                System.out.print("Ingrese su cantidad de comidas saludables por dia: ");
                comidas = sc.nextInt();
            }
            System.out.println("\n" + evaluacion(descanso, ejercicio, comidas));
        }catch (Exception e){
            System.out.println("Error: " +e);
        }
    }
}
