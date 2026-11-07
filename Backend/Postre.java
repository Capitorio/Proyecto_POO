package Backend;

public class Postre extends Producto {
    private int tiempoPreparacionMin;
    private int gramos;


    public Postre(String nombre, double precio, int tiempoPreparacionMin, int gramos) {
        super(nombre, precio);
        this.tiempoPreparacionMin = tiempoPreparacionMin;
        this.gramos = gramos;
    }

    @Override
    public String toString() {
        return "Postre{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", tiempoPreparacionMin=" + tiempoPreparacionMin +
                ", gramos=" + gramos +
                '}';
    }

}