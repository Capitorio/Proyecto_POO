package Backend;

public class Platillo extends Producto {
    int gramos;
    int tiempoPreparacionMin;


    public Platillo(String nombre, double precio, int tiempoPreparacionMin, int gramos) {
        super(nombre, precio);
        this.tiempoPreparacionMin = tiempoPreparacionMin;
        this.gramos = gramos;
    }

    @Override 
    public String toString() {
        return "Platillo{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", tiempoPreparacionMin=" + tiempoPreparacionMin +
                '}';
    }
}
