package Backend;

import java.util.*;


public class Restaurante {
    private String nombre;
    private List<Producto> menu;
    private List<Comanda> comandasActivas;
    private List<Mesero> plantillaMeseros;

    public Restaurante(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void darDeAltaProducto(Producto producto){
        menu.add(producto);
    }

    public void darDeBajaProducto(Producto producto){
        menu.remove(producto);
    }

    public void registrarMesero(Mesero mesero){
        plantillaMeseros.add(mesero);
    }

    public Comanda abrirNuevaComanda (Mesero mesero){
        Comanda nueva = new Comanda(mesero);
        comandasActivas.add(nueva);
        return nueva;
    }

    public boolean mandarComandaACaja(int idComanda){
        Optional<Comanda> encontrada = this.comandasActivas.stream().filter(c->c.getIdComanda() == idComanda).findFirst();
        if (encontrada.isPresent()) {
            Comanda c = encontrada.get();
            c.cerrarComanda();
            Caja.getInstance().cobrarComanda(c);
            this.comandasActivas.remove(c);
            return true;
            
        }
        return false;

    }


    public List<Producto> getMenuClonado(){
        List<Producto> duplicado = new ArrayList<>();
        duplicado.addAll(menu);
        return duplicado;
    }
}
