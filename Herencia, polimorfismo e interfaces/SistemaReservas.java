import java.util.ArrayList;

// Clase abstracta Vuelo
abstract class Vuelo {
    String numeroVuelo, origen, destino, fecha;

    public Vuelo(String numeroVuelo, String origen, String destino, String fecha) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }

    abstract double calcularPrecio();

    @Override
    public abstract String toString();
}

// Interfaz Promocionable
interface Promocionable {
    void aplicarPromocion();
}

// Clase VueloRegular que implementa Promocionable
class VueloRegular extends Vuelo implements Promocionable {
    int numeroAsientos;
    double precioBase;

    public VueloRegular(String numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioBase) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
        this.precioBase = precioBase;
    }

    @Override
    double calcularPrecio() {
        return numeroAsientos * precioBase;
    }

    @Override
    public void aplicarPromocion() {
        precioBase *= 0.9; // Aplica un 10% de descuento
    }

    @Override
    public String toString() {
        return "Vuelo Regular: " + numeroVuelo + " | Origen: " + origen + " | Destino: " + destino +
                " | Fecha: " + fecha + " | Precio por asiento: $" + precioBase +
                " | Asientos: " + numeroAsientos + " | Precio total: $" + calcularPrecio();
    }
}

// Clase VueloCharter que implementa Promocionable
class VueloCharter extends Vuelo implements Promocionable {
    double precioTotal;

    public VueloCharter(String numeroVuelo, String origen, String destino, String fecha, double precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    @Override
    double calcularPrecio() {
        return precioTotal;
    }

    @Override
    public void aplicarPromocion() {
        precioTotal *= 0.85; // Aplica un 15% de descuento
    }

    @Override
    public String toString() {
        return "Vuelo Charter: " + numeroVuelo + " | Origen: " + origen + " | Destino: " + destino +
                " | Fecha: " + fecha + " | Precio total: $" + calcularPrecio();
    }
}

// Clase Reservas
class Reservas {
    ArrayList<Vuelo> vuelos = new ArrayList<>();

    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public double calcularPrecioTotal() {
        return vuelos.stream().mapToDouble(Vuelo::calcularPrecio).sum();
    }

    public void aplicarPromociones() {
        for (Vuelo vuelo : vuelos) {
            if (vuelo instanceof Promocionable) {
                ((Promocionable) vuelo).aplicarPromocion();
            }
        }
    }

    public void mostrarVuelos() {
        for (Vuelo vuelo : vuelos) {
            System.out.println(vuelo.toString());
        }
    }
}

// Clase principal
public class SistemaReservas {
    public static void main(String[] args) {
        Reservas reservas = new Reservas();

        // Agregar vuelos
        Vuelo vuelo1 = new VueloRegular("VR001", "Mendoza", "Buenos Aires", "2024-12-01", 100, 1500);
        Vuelo vuelo2 = new VueloCharter("VC001", "Mendoza", "Bariloche", "2024-12-02", 100000);

        reservas.agregarVuelo(vuelo1);
        reservas.agregarVuelo(vuelo2);

        // Mostrar vuelos antes de promociones
        System.out.println("Vuelos antes de aplicar promociones:");
        reservas.mostrarVuelos();

        // Mostrar precio total antes de promociones
        System.out.println("\nPrecio total antes de promociones: $" + reservas.calcularPrecioTotal());

        // Aplicar promociones
        reservas.aplicarPromociones();

        // Mostrar vuelos después de promociones
        System.out.println("\nVuelos después de aplicar promociones:");
        reservas.mostrarVuelos();

        // Mostrar precio total después de promociones
        System.out.println("\nPrecio total después de promociones: $" + reservas.calcularPrecioTotal());
    }
}
