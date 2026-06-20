public abstract class DecoradorComplemento extends Cafe{
    
    protected Cafe bebida; // objeto que estamos envolviendo

    public DecoradorComplemento(Cafe bebida) {
        super(bebida.getTamano()); // hereda el tamaño de la bebida
        this.bebida = bebida;
    }

    @Override
    public abstract String getDescripcion();

    @Override
    public abstract double costo();

}
