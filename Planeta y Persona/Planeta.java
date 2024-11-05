import java.text.DecimalFormat;
public class Planeta {
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    // Atributos de la clase Planeta
    String nombre = null;
    int cantidadSatelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciaMediaSol = 0;
    TipoPlaneta tipoPlaneta;
    boolean observable = false;
    int periodoOrbital;      // Nuevo atributo (en años)
    double periodoRotacion;     // Nuevo atributo (en días)

    // Enumeración para tipo de planeta
    enum TipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    }

    /**
     * Constructor de la clase Planeta
     * @param nombre Nombre del planeta
     * @param cantidadSatelites Cantidad de satélites del planeta
     * @param masa Masa del planeta en kg
     * @param volumen Volumen del planeta en km³
     * @param diametro Diámetro del planeta en km
     * @param distanciaMediaSol Distancia media del planeta al Sol en millones de km
     * @param tipoPlaneta Tipo del planeta (GASEOSO, TERRESTRE, ENANO)
     * @param observable Si el planeta es observable a simple vista
     * @param periodoOrbital Periodo orbital del planeta en años
     * @param periodoRotacion Periodo de rotación del planeta en días
     */
    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaMediaSol, TipoPlaneta tipoPlaneta, boolean observable, int periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMediaSol = distanciaMediaSol;
        this.tipoPlaneta = tipoPlaneta;
        this.observable = observable;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    /**
     * Método para imprimir los datos de un planeta
     */
    public void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Cantidad de satélites = " + cantidadSatelites);
        System.out.println("Masa = " + masa);
        System.out.println("Volumen = " + volumen);
        System.out.println("Diámetro = " + diametro);
        System.out.println("Distancia media al Sol = " + distanciaMediaSol);
        System.out.println("Tipo de planeta = " + tipoPlaneta);
        System.out.println("Observable a simple vista = " + observable);
        System.out.println("Periodo orbital = " + periodoOrbital + " años");
        System.out.println("Periodo de rotación = " + decimalFormat.format(periodoRotacion) + " días");
        System.out.println();
    }

    /**
     * Método para calcular la densidad del planeta
     * @return Densidad del planeta como masa/volumen
     */
    public double calcularDensidad() {
        return volumen != 0 ? masa / volumen : 0;
    }

    /**
     * Método para determinar si el planeta es exterior
     * @return true si es un planeta exterior, false en caso contrario
     */
    public boolean esExterior() {
        double distanciaUA = distanciaMediaSol / 149597.870;  // Convertir km a UA
        return distanciaUA > 3.4;
    }

    /**
     * Método main para crear e imprimir dos objetos Planeta
     */
    public static void main(String[] args) {
        Planeta tierra = new Planeta("Tierra", 1, 5.97e24, 1.08e12, 12742, 149597870, TipoPlaneta.TERRESTRE, true, 1, 1);
        Planeta jupiter = new Planeta("Júpiter", 79, 1.898e27, 1.43e15, 139820, 778300000, TipoPlaneta.GASEOSO, true, 12, 0.41);

        tierra.imprimir();
        System.out.println("Densidad de Tierra: " + tierra.calcularDensidad());
        System.out.println("¿Es exterior? " + tierra.esExterior());

        jupiter.imprimir();
        System.out.println("Densidad de Júpiter: " + jupiter.calcularDensidad());
        System.out.println("¿Es exterior? " + jupiter.esExterior());
    }
}

