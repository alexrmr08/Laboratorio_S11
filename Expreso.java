public class Expreso extends Cafe {

    private static final double[] PRECIOS = {1.99, 2.09, 2.15}; // N, M, G

    public Expreso(Tamano tamano) {
        super(tamano);
        descripcion = "Cafe Expreso";
    }

    @Override
    public double costo() {
        return PRECIOS[tamano.ordinal()];
    }
}