import java.util.ArrayList;

// Clase abstracta MetodoPago
abstract class MetodoPago {
    String titular, numero;

    public MetodoPago(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
    }

    abstract void realizarPago();
}

// Interfaz Cancelable
interface Cancelable {
    void cancelarPago();
}

// Clase TarjetaCredito
class TarjetaCredito extends MetodoPago implements Cancelable {
    String fechaExpiracion;
    int codigoSeguridad;

    public TarjetaCredito(String titular, String numero, String fechaExpiracion, int codigoSeguridad) {
        super(titular, numero);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    void realizarPago() {
        System.out.println("Pago realizado con Tarjeta de Crédito.");
    }

    @Override
    public void cancelarPago() {
        System.out.println("Pago con Tarjeta de Crédito cancelado.");
    }
}

// Clase PayPal
class PayPal extends MetodoPago implements Cancelable {
    String correoElectronico;

    public PayPal(String titular, String numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
    }

    @Override
    void realizarPago() {
        System.out.println("Pago realizado con PayPal.");
    }

    @Override
    public void cancelarPago() {
        System.out.println("Pago con PayPal cancelado.");
    }
}

// Clase Pagos
class Pagos {
    ArrayList<MetodoPago> metodosPago = new ArrayList<>();

    public void agregarMetodoPago(MetodoPago metodo) {
        metodosPago.add(metodo);
    }

    public void realizarPagos() {
        for (MetodoPago metodo : metodosPago) {
            metodo.realizarPago();
        }
    }

    public void cancelarPagos() {
        for (MetodoPago metodo : metodosPago) {
            if (metodo instanceof Cancelable) {
                ((Cancelable) metodo).cancelarPago();
            }
        }
    }
}

// Clase principal
public class SistemaPagos {
    public static void main(String[] args) {
        Pagos pagos = new Pagos();

        MetodoPago tarjeta = new TarjetaCredito("Lucas Pujada", "123456789", "12/26", 123);
        MetodoPago paypal = new PayPal("Lucas Pujada", "987654321", "lucas@correo.com");

        pagos.agregarMetodoPago(tarjeta);
        pagos.agregarMetodoPago(paypal);

        pagos.realizarPagos();
        pagos.cancelarPagos();
    }
}
