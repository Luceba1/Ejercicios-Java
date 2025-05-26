import java.util.ArrayList;
import java.util.List;

public class AlmacenSuper<T> {
    private List<T> elementos = new ArrayList<>();

    public void agregarElemento(T elemento) {
        elementos.add(elemento);
    }

    public void imprimirElementos(List<? super T> lista) {
        for (Object elem : lista) {
            System.out.println(elem);
        }
    }

    public List<T> getElementos() {
        return elementos;
    }
}
