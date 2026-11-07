package Backend;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
    private static int TOTAL_COMANDAS = 0;
    private final int idComanda;
    private List<Producto> productos;
    private double totalComanda;
    private boolean comandaActiva;


    public Comanda(Mesero mesero) {
        this.idComanda = ++TOTAL_COMANDAS;
        this.productos = new ArrayList<>();
        this.totalComanda = 0.0;
        this.comandaActiva = true;
    }

    public int getIdComanda() {
        return idComanda;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        calcularTotal();
    }

    public boolean eliminarProducto(Producto producto) {
        if (productos.remove(producto)) {
            totalComanda -= producto.getPrecio();
            return true;
        }
        return false;   
    }

    public double calcularTotal() {
        this.totalComanda=0;
        for (int i = 0; i < productos.size(); i++) {
            Producto p=this.productos.get(i);
            this.totalComanda += p.getPrecio();
        
        }
        return this.totalComanda;
        
    }

    public void cerrarComanda() {
        comandaActiva = false;
    }

    public List<Producto> getProductosClonados() {
        return new ArrayList<>(productos);
    }

    public boolean getComandaActiva() {
        return comandaActiva;
    }

    @Override 
    public String toString() {
        return "Comanda{" +
                "idComanda=" + idComanda +
                ", productos=" + productos +
                ", totalComanda=" + totalComanda +
                ", comandaActiva=" + comandaActiva +
                '}';
    }



    
}
