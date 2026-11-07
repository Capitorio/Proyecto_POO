package Backend;
import java.util.ArrayList;
import java.util.List;
public class Caja {
    private static Caja instance=null;
    private ArrayList<Comanda>comandasCobradas;
    private double totalCaja;


    private Caja(){
        this.comandasCobradas= new ArrayList<>();
        this.totalCaja=0.0;
    }

    public static Caja getInstance(){
        if(instance ==null){
            instance = new Caja();
        }
        return instance;
    }

    public void cobrarComanda(Comanda comanda){
    
        comandasCobradas.add(comanda);
        this.totalCaja+=comanda.calcularTotal();
    }

    public double realizarCorteDeCaja(){
        return totalCaja;
    }


    public List<Comanda> getComandasCobradasClonadas(){
        return new ArrayList<>(this.comandasCobradas);
    }





    
}
