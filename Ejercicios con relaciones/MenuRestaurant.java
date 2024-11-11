import java.util.ArrayList;
import java.util.Scanner;

class Ingrediente {
    private String nombre;
    private double cantidad;
    private String unidadMedida;

    public Ingrediente(String nombre, double cantidad, String unidadMedida) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
    }

    @Override
    public String toString() {
        return nombre + " " + cantidad + " " + unidadMedida;
    }
}

class Plato {
    private String nombreCompleto;
    private double precio;
    private boolean esBebida;
    private ArrayList<Ingrediente> ingredientes;

    public Plato(String nombreCompleto, double precio, boolean esBebida) {
        this.nombreCompleto = nombreCompleto;
        this.precio = precio;
        this.esBebida = esBebida;
        this.ingredientes = new ArrayList<>();
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        if (!esBebida) {
            ingredientes.add(ingrediente);
        }
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("Plato: " + nombreCompleto + ", Precio: $" + precio);
        if (!esBebida) {
            info.append("\nIngredientes:");
            for (Ingrediente ingrediente : ingredientes) {
                info.append("\n- ").append(ingrediente);
            }
        }
        return info.toString();
    }
}

public class MenuRestaurant {
    public static void main(String[] args) {
        ArrayList<Plato> platosMenu = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de platos: ");
        int cantidadPlatos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidadPlatos; i++) {
            System.out.print("Nombre del plato: ");
            String nombre = scanner.nextLine();

            System.out.print("Precio: ");
            double precio = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("¿Es bebida? (true/false): ");
            boolean esBebida = scanner.nextBoolean();
            scanner.nextLine();

            Plato plato = new Plato(nombre, precio, esBebida);

            if (!esBebida) {
                System.out.print("Cantidad de ingredientes: ");
                int cantidadIngredientes = scanner.nextInt();
                scanner.nextLine();

                for (int j = 0; j < cantidadIngredientes; j++) {
                    System.out.print("Nombre del ingrediente: ");
                    String nombreIngrediente = scanner.nextLine();

                    System.out.print("Cantidad: ");
                    double cantidad = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Unidad de medida: ");
                    String unidad = scanner.nextLine();

                    plato.agregarIngrediente(new Ingrediente(nombreIngrediente, cantidad, unidad));
                }
            }
            platosMenu.add(plato);
        }

        System.out.println("\nMenú del restaurante:");
        for (Plato plato : platosMenu) {
            System.out.println(plato);
        }
    }
}

