public class TostadoNegro extends Cafe {

    private static final double[] PRECIOS = {0.99, 1.09, 1.19}; // N, M, G

    public TostadoNegro(Tamano tamano) {
        super(tamano);
        descripcion = "Cafe Tostado Negro";
    }

    @Override
    public double costo() {
        return PRECIOS[tamano.ordinal()];
    }
}