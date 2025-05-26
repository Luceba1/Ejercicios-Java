import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        almacen.agregarProducto(new Alimento("Pan", 100));
        almacen.agregarProducto(new Electronico("TV", 40000));

        System.out.println("Productos del almacén:");
        almacen.imprimirProductos(almacen.getProductos());
    }
}
