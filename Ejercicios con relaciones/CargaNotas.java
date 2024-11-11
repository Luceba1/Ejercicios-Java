import java.util.ArrayList;
import java.util.Scanner;

class Nota {
    private String catedra;
    private double notaExamen;

    public Nota(String catedra, double notaExamen) {
        this.catedra = catedra;
        this.notaExamen = notaExamen;
    }

    public double getNotaExamen() {
        return notaExamen;
    }

    @Override
    public String toString() {
        return "Cátedra: " + catedra + ", Nota: " + notaExamen;
    }
}

class Alumno {
    private String nombreCompleto;
    private long legajo;
    private ArrayList<Nota> notas;

    public Alumno(String nombreCompleto, long legajo) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(Nota nota) {
        notas.add(nota);
    }

    public double calcularPromedio() {
        double suma = 0;
        for (Nota nota : notas) {
            suma += nota.getNotaExamen();
        }
        return notas.isEmpty() ? 0 : suma / notas.size();
    }

    @Override
    public String toString() {
        return "Nombre: " + nombreCompleto + ", Legajo: " + legajo + ", Promedio: " + calcularPromedio();
    }
}

public class CargaNotas {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.print("Nombre del alumno: ");
            String nombre = scanner.nextLine();

            System.out.print("Legajo: ");
            long legajo = scanner.nextLong();
            scanner.nextLine();

            Alumno alumno = new Alumno(nombre, legajo);

            System.out.print("Ingrese la cantidad de notas para " + nombre + ": ");
            int cantidadNotas = scanner.nextInt();
            scanner.nextLine();

            for (int j = 0; j < cantidadNotas; j++) {
                System.out.print("Cátedra: ");
                String catedra = scanner.nextLine();

                System.out.print("Nota: ");
                double notaExamen = scanner.nextDouble();
                scanner.nextLine();

                alumno.agregarNota(new Nota(catedra, notaExamen));
            }

            alumnos.add(alumno);
        }

        System.out.println("\nInformación de alumnos:");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}

