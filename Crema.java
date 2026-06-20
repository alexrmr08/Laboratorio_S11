public class Crema extends DecoradorComplemento {
    
    private static final double[] precios = {0.10, 0.15, 0.20}; //N, M, G.
    
    public Crema(Cafe bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Crema";
    }

    @Override
    public double costo() {
        return precios[tamano.ordinal()] + bebida.costo();
    }
}