import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AlmacenSuper<Alimento> almacen = new AlmacenSuper<>();
        almacen.agregarElemento(new Alimento("Queso", 250));

        List<Producto> lista = new ArrayList<>(almacen.getElementos());
        almacen.imprimirElementos(lista);
    }
}
