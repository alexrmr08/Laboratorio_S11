public class Descafeinado extends Cafe{
    
    private static final double[] PRECIOS = {1.05, 1.15, 1.25}; // N, M, G

    public Descafeinado(Tamano tamano) {
        super(tamano);
        descripcion = "Cafe Descafeinado";
    }

    @Override
    public double costo() {
        return PRECIOS[tamano.ordinal()];
    }
    
}