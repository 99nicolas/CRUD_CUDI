public class Producto {

    //Atributos id, nombre,precio
    private int idProducto;
    private String nombreProducto;
    private double precioProducto;

    //constructor
    public Producto(int id, String nombre, double precio){
        this.idProducto = id;
        this.nombreProducto = nombre;
        this.precioProducto = precio;

    }

    //get(obtener) and set(setear o cambiar)

    public int getIdProducto() {
        return idProducto;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public double getPrecioProducto() {
        return precioProducto;
    }

    //Mutadores Set(setear o cambiar)

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    //toString
    @Override
    public String toString() {
        return "\nId producto: " + idProducto + "\nNombre producto: " + nombreProducto + "\nPrecio producto: " + precioProducto;
    }


}