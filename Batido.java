public class Batido extends Cafe {

    private static final double[] PRECIOS = {0.89, 0.99, 1.09}; // N, M, G

    public Batido(Tamano tamano) {
        super(tamano);
        descripcion = "Cafe Batido";
    }

    @Override
    public double costo() {
        return PRECIOS[tamano.ordinal()];
    }

}