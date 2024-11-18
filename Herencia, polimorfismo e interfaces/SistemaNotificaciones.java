import java.util.ArrayList;

// Clase abstracta CanalNotificacion
abstract class CanalNotificacion {
    String usuario, mensaje;

    public CanalNotificacion(String usuario, String mensaje) {
        this.usuario = usuario;
        this.mensaje = mensaje;
    }

    abstract void enviarNotificacion();
}

// Interfaz Personalizable
interface Personalizable {
    void personalizarMensaje(String nuevoMensaje);
}

// Clase CorreoElectronico
class CorreoElectronico extends CanalNotificacion implements Personalizable {
    String direccionCorreo;

    public CorreoElectronico(String usuario, String mensaje, String direccionCorreo) {
        super(usuario, mensaje);
        this.direccionCorreo = direccionCorreo;
    }

    @Override
    void enviarNotificacion() {
        System.out.println("Enviando correo a " + direccionCorreo + ": " + mensaje);
    }

    @Override
    public void personalizarMensaje(String nuevoMensaje) {
        this.mensaje = nuevoMensaje;
    }
}

// Clase MensajeTexto
class MensajeTexto extends CanalNotificacion implements Personalizable {
    String numeroTelefono;

    public MensajeTexto(String usuario, String mensaje, String numeroTelefono) {
        super(usuario, mensaje);
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    void enviarNotificacion() {
        System.out.println("Enviando mensaje de texto a " + numeroTelefono + ": " + mensaje);
    }

    @Override
    public void personalizarMensaje(String nuevoMensaje) {
        this.mensaje = nuevoMensaje;
    }
}

// Clase Notificaciones
class Notificaciones {
    ArrayList<CanalNotificacion> canales = new ArrayList<>();

    public void agregarCanal(CanalNotificacion canal) {
        canales.add(canal);
    }

    public void enviarNotificaciones() {
        for (CanalNotificacion canal : canales) {
            canal.enviarNotificacion();
        }
    }

    public void personalizarMensajes(String nuevoMensaje) {
        for (CanalNotificacion canal : canales) {
            if (canal instanceof Personalizable) {
                ((Personalizable) canal).personalizarMensaje(nuevoMensaje);
            }
        }
    }

    public void mostrarInformacion() {
        for (CanalNotificacion canal : canales) {
            System.out.println(canal);
        }
    }
}

// Clase principal
public class SistemaNotificaciones {
    public static void main(String[] args) {
        Notificaciones notificaciones = new Notificaciones();

        CanalNotificacion correo = new CorreoElectronico("Lucas", "Bienvenido a nuestro servicio.", "lucas@correo.com");
        CanalNotificacion mensaje = new MensajeTexto("Lucas", "Tu código de verificación es 1234.", "123456789");

        notificaciones.agregarCanal(correo);
        notificaciones.agregarCanal(mensaje);

        System.out.println("Notificaciones originales:");
        notificaciones.enviarNotificaciones();

        System.out.println("\nPersonalizando mensajes...");
        notificaciones.personalizarMensajes("Este es un mensaje personalizado.");

        System.out.println("\nNotificaciones personalizadas:");
        notificaciones.enviarNotificaciones();
    }
}
