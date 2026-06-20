public abstract class Cafe {
    
    public enum Tamano { NORMAL, MEDIANO, GRANDE }

    protected String descripcion = "Bebida desconocida";
    protected Tamano tamano;

    public Cafe(Tamano tamano) {
        this.tamano = tamano;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Tamano getTamano() {
        return tamano;
    }

    public abstract double costo();

}
