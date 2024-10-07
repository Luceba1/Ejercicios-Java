import java.util.Scanner;

public class Sec_eje6
{
    static String principiante = """
            Objetivo: Familiarizarte con los conceptos básicos de programación.
            
            Día 1-7: Introducción a la programación: variables, tipos de datos, condicionales.
            Día 8-14: Estructuras de control: bucles (for, while), condicionales (if, else).
            Día 15-21: Funciones y modularización del código.
            Día 22-28: Práctica con pequeños proyectos, como calculadoras simples o conversores de unidades.
            """;
    static String principiante_intermedio = """
            Objetivo: Desarrollar habilidades en la resolución de problemas y estructuras de datos básicas.
            
            Día 1-7: Fundamentos de programación y estructuras de control.
            Día 8-14: Arreglos y listas. Introducción a las funciones.
            Día 15-21: Introducción a la recursión y algoritmos básicos (búsqueda, ordenamiento).
            Día 22-28: Implementación de estructuras de datos simples: pilas, colas.
            Día 29-35: Proyecto simple como un juego de adivinanzas o una agenda de contactos.
            """;
    static String intermedio = """
            Objetivo: Aprender conceptos más avanzados y comenzar con programación orientada a objetos (POO).
            
            Día 1-5: Repaso rápido de conceptos básicos y estructuras de datos.
            Día 6-10: Algoritmos avanzados: búsqueda binaria, ordenamiento por mezcla, etc.
            Día 11-15: Introducción a la POO: clases, objetos, herencia.
            Día 16-20: Aplicación de POO en proyectos.
            Día 21-25: Proyecto intermedio: un sistema de gestión de tareas o un juego sencillo con POO.
            """;
    static String intermedio_avanzado = """
            Objetivo: Fortalecer la capacidad de resolución de problemas con estructuras de datos y comenzar con bases de datos.
            
            Día 1-5: Repaso de algoritmos y estructuras de datos.
            Día 6-10: Profundización en POO y diseño de patrones.
            Día 11-15: Introducción a bases de datos SQL y consultas básicas.
            Día 16-20: Proyecto: Crear una aplicación CRUD (crear, leer, actualizar, eliminar).
            Día 21-25: Optimización de algoritmos y análisis de la complejidad temporal.
            Día 26-30: Proyecto avanzado que incluya bases de datos y diseño modular.
            """;
    static String avanzado = """
            Objetivo: Aplicar lo aprendido a través de proyectos completos.
            
            Día 1-5: Revisión de algoritmos, estructuras de datos avanzadas (árboles, grafos).
            Día 6-10: Desarrollo de un proyecto de una aplicación web usando HTML/CSS y JavaScript o un framework.
            Día 11-15: Práctica con APIs y manejo de bases de datos relacionales y no relacionales.
            Día 16-20: Desarrollo de backend: Node.js, Django, o Flask.
            Día 21-25: Optimización de código y prácticas de testing automatizado.
            Día 26-30: Despliegue del proyecto y uso de herramientas en la nube (AWS, Heroku, etc.).
            """;
    static String avanzado_2 = """
            Objetivo: Crear un portafolio de proyectos sólidos y trabajar en habilidades técnicas específicas.
            
            Día 1-5: Práctica intensiva de algoritmos avanzados y optimización.
            Día 6-10: Desarrollo de un proyecto de software más complejo (gestor de tareas, aplicación web avanzada).
            Día 11-15: Introducción a inteligencia artificial y machine learning básico (Python, Scikit-learn).
            Día 16-20: Proyecto de IA simple, como un recomendador básico o sistema de clasificación.
            Día 21-25: Desarrollo de aplicaciones móviles (Flutter o React Native).
            Día 26-30: Publicación de proyectos y mejoras en la arquitectura de software.
            """;
    static String avanzado_experto = """
            Objetivo: Dominar áreas avanzadas como desarrollo web full-stack o aplicaciones móviles.
            
            Día 1-5: Repaso y práctica de estructuras avanzadas (árboles, grafos) y optimización.
            Día 6-10: Desarrollo de una aplicación full-stack (frontend y backend).
            Día 11-15: Profundización en machine learning o inteligencia artificial aplicada.
            Día 16-20: Aplicación de DevOps (CI/CD, Docker, Kubernetes).
            Día 21-25: Proyecto avanzado de machine learning o big data.
            Día 26-30: Preparación de portafolio y publicación en GitHub.
            """;
    static String experto = """
            Objetivo: Alcanzar un nivel profesional mediante proyectos reales y preparación para el mundo laboral.
            
            Día 1-5: Intensivo en algoritmos, estructuras de datos y su optimización.
            Día 6-10: Desarrollo y diseño de una API escalable y eficiente.
            Día 11-15: Profundización en IA avanzada, como redes neuronales y deep learning.
            Día 16-20: Desarrollo de un proyecto completo de IA (reconocimiento de imágenes, chatbot).
            Día 21-25: Aplicación de blockchain o tecnologías emergentes.
            Día 26-30: Preparación para entrevistas técnicas y desafíos de código (LeetCode, HackerRank).
            """;

    public static void plan_de_estudio(int horas){
        System.out.print("\n");
        switch(horas){
            case 1:
                System.out.println(principiante);
                break;
            case 2:
                System.out.println(principiante_intermedio);
                break;
            case 3:
                System.out.println(intermedio);
                break;
            case 4:
                System.out.println(intermedio_avanzado);
                break;
            case 5:
                System.out.println(avanzado);
                break;
            case 6:
                System.out.println(avanzado_2);
                break;
            case 7:
                System.out.println(avanzado_experto);
                break;
            case 8:
                System.out.println(experto);
                break;
            default:
                System.out.println("Numero ingresado incorrecto.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de horas de 1 a 8: ");
        try{
            int horas = sc.nextInt();
            if (horas > 0 && horas <= 8){
                plan_de_estudio(horas);
            }
            else System.out.println("Numero fuera de rango.");
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
