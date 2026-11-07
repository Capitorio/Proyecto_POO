package Backend;

public abstract class Producto {
    protected static int TOTAL_PRODUCTOS = 999;
    protected final int idProducto;
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.idProducto = ++TOTAL_PRODUCTOS;
        this.nombre = nombre;
        this.precio = precio;
    }

    public static int getTotalProductos() {
        return TOTAL_PRODUCTOS;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override 
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Producto producto = (Producto) obj;
        return idProducto == producto.idProducto;
    }




    
}
