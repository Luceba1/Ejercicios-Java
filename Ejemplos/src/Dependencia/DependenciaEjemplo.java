package Dependencia;

public class DependenciaEjemplo {
    public static void main(String[] args) {
        Lector lector = new Lector();
        Libro libro = new Libro("1984");
        lector.leer(libro); // Lector depende de Libro
    }
}
