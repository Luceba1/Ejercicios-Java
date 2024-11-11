import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

class DetalleFactura {
    private String codigoArticulo;
    private String nombreArticulo;
    private int cantidad;
    private double precioUnitario;
    private double descuentoItem;
    private double subtotal;

    public DetalleFactura(String codigo, String nombre, int cantidad, double precioUnitario) {
        this.codigoArticulo = codigo;
        this.nombreArticulo = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        if (cantidad > 5) {
            this.descuentoItem = precioUnitario * 0.1;
        } else {
            this.descuentoItem = 0;
        }
        this.subtotal = (precioUnitario - descuentoItem) * cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    @Override
    public String toString() {
        return codigoArticulo + " " + nombreArticulo + " " + cantidad + " " + precioUnitario + " " + descuentoItem + " " + subtotal;
    }
}

class Factura {
    private String fechaFactura;
    private long numeroFactura;
    private String cliente;
    private double totalCalculadoFactura;
    private ArrayList<DetalleFactura> detallesFactura = new ArrayList<>();

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public void setNumeroFactura(long numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void agregarDetalle(DetalleFactura detalle) {
        detallesFactura.add(detalle);
    }

    public void calcularMontoTotal() {
        totalCalculadoFactura = detallesFactura.stream().mapToDouble(DetalleFactura::getSubtotal).sum();
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("Fecha: " + fechaFactura + "\nNúmero: " + numeroFactura + "\nCliente: " + cliente + "\nDetalles:\n");
        for (DetalleFactura detalle : detallesFactura) {
            info.append(detalle).append("\n");
        }
        info.append("Total: ").append(totalCalculadoFactura);
        return info.toString();
    }
}

public class Facturacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Item> items = new ArrayList<>();
        double total = 0;

        System.out.print("Fecha de factura (ejemplo: 01/11/2024): ");
        String fecha = scanner.nextLine();

        System.out.print("Número de factura: ");
        int numeroFactura = Integer.parseInt(scanner.nextLine());

        System.out.print("Cliente: ");
        String cliente = scanner.nextLine();

        while (true) {
            System.out.print("Ingrese el código del artículo a facturar (o 'salir' para finalizar): ");
            String codigo = scanner.nextLine();
            if (codigo.equalsIgnoreCase("salir")) break;

            System.out.print("Cantidad: ");
            int cantidad = Integer.parseInt(scanner.nextLine());

            // Aquí deberías buscar los detalles del artículo, por ejemplo:
            String descripcion = obtenerDescripcionArticulo(codigo);
            double precioUnitario = obtenerPrecioArticulo(codigo);

            double subtotal = cantidad * precioUnitario;
            total += subtotal;

            items.add(new Item(codigo, descripcion, cantidad, precioUnitario, subtotal));
        }

        // Imprimir la factura
        System.out.println("\nFactura generada:");
        System.out.printf("Fecha: %s\n", fecha);
        System.out.printf("Número: %d\n", numeroFactura);
        System.out.printf("Cliente: %s\n", cliente);
        System.out.println("Detalles:");
        System.out.printf("%-10s %-15s %-10s %-10s %-10s\n", "Código", "Descripción", "Cantidad", "Precio", "Subtotal");

        for (Item item : items) {
            System.out.printf("%-10s %-15s %-10d %-10.2f %-10.2f\n", item.codigo, item.descripcion, item.cantidad, item.precioUnitario, item.subtotal);
        }

        System.out.printf("Total: %.2f\n", total);
    }

    public static String obtenerDescripcionArticulo(String codigo) {
        // Aquí debes retornar la descripción del artículo basado en su código.
        if (codigo.equals("104")) return "Arroz";
        if (codigo.equals("101")) return "Leche";
        return "Desconocido";
    }

    public static double obtenerPrecioArticulo(String codigo) {
        // Aquí debes retornar el precio del artículo basado en su código.
        if (codigo.equals("104")) return 28.0;
        if (codigo.equals("101")) return 25.0;
        return 0.0;
    }

    static class Item {
        String codigo;
        String descripcion;
        int cantidad;
        double precioUnitario;
        double subtotal;

        public Item(String codigo, String descripcion, int cantidad, double precioUnitario, double subtotal) {
            this.codigo = codigo;
            this.descripcion = descripcion;
            this.cantidad = cantidad;
            this.precioUnitario = precioUnitario;
            this.subtotal = subtotal;
        }
    }
}