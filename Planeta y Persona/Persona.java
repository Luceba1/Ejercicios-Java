public class Persona {
    // Atributos de la clase Persona
    String nombre;
    String apellidos;
    String numeroDocumentoIdentidad;
    int añoNacimiento;
    String paisNacimiento;  // Nuevo atributo
    char genero;            // Nuevo atributo ('H' o 'M')

    /**
     * Constructor de la clase Persona
     * @param nombre Parámetro que define el nombre de la persona
     * @param apellidos Parámetro que define los apellidos de la persona
     * @param numeroDocumentoIdentidad Parámetro que define el número de documento de identidad
     * @param añoNacimiento Parámetro que define el año de nacimiento de la persona
     * @param paisNacimiento Parámetro que define el país de nacimiento de la persona
     * @param genero Parámetro que define el género de la persona ('H' o 'M')
     */
    public Persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int añoNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    /**
     * Método que imprime en pantalla los datos de una persona
     */
    public void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellidos = " + apellidos);
        System.out.println("Número de documento de identidad = " + numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + añoNacimiento);
        System.out.println("País de nacimiento = " + paisNacimiento);
        System.out.println("Género = " + genero);
        System.out.println();
    }

    /**
     * Método main para crear e imprimir dos objetos Persona
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Pedro", "Pérez", "1053121010", 1998, "Argentina", 'H');
        Persona p2 = new Persona("Luis", "León", "1053223344", 2001, "Chile", 'M');

        p1.imprimir();
        p2.imprimir();
    }
}
