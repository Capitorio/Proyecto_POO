package Backend;

public class Bebida extends Producto {
    private int mililitros;
    private boolean conAlcohol;

    public Bebida(String nombre, double precio, int mililitros, boolean conAlcohol) {
        super(nombre, precio);
        this.mililitros = mililitros;
        this.conAlcohol = conAlcohol;

    }

    @Override
    public String toString() {
        return "Bebida{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", mililitros=" + mililitros +
                ", conAlcohol=" + conAlcohol +
                '}';
    }
    
}
