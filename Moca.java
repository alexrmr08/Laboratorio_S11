public class Moca extends DecoradorComplemento {

    private static final double[] precios = {0.20, 0.30, 0.40}; //N, M, G.

    public Moca(Cafe bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Moca";
    }

    @Override
    public double costo() {
        return precios[tamano.ordinal()] + bebida.costo();
    }
    
}