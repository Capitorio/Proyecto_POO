package Backend;

public class Mesero {
    private static int TOTAL_MESEROS = 0;
    private final int idMesero;
    private String nombre;



    public Mesero(String nombre) {
        this.idMesero = ++TOTAL_MESEROS;
        this.nombre = nombre;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public String getNombre() {
        return nombre;
    }

    public static int getTotalMeseros() {
        return TOTAL_MESEROS;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Mesero mesero = (Mesero) obj;
        return idMesero == mesero.idMesero;
    }

    
    @Override
    public String toString() {
        return "Mesero{" +
                "idMesero=" + idMesero +
                ", nombre='" + nombre + '\'' +
                '}';
    }

}