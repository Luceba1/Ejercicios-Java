public class Numero implements Operable<Numero> {
    private double valor;

    public Numero(double valor) {
        this.valor = valor;
    }

    @Override
    public Numero suma(Numero otro) {
        return new Numero(this.valor + otro.valor);
    }

    @Override
    public Numero resta(Numero otro) {
        return new Numero(this.valor - otro.valor);
    }

    @Override
    public Numero producto(Numero otro) {
        return new Numero(this.valor * otro.valor);
    }

    @Override
    public Numero division(Numero otro) {
        if (otro.valor == 0) throw new ArithmeticException("División por cero");
        return new Numero(this.valor / otro.valor);
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}
