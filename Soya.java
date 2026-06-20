public class Soya extends DecoradorComplemento {

    private static final double[] precios = {0.15, 0.20, 0.25}; //N, M, G.

    public Soya(Cafe bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Soya";
    }

    @Override
    public double costo() {
        return precios[tamano.ordinal()] + bebida.costo();
    }
    
}