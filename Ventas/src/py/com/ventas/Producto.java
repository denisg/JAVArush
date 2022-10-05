
package py.com.ventas;


public class Producto {
    private int idProducto; 
    private String nombre;
    private double precio;
    private static int contadorProducto;
    
    
    //constructor privado
    private Producto(){
        this.idProducto= ++Producto.contadorProducto;
    }
    
    public Producto(String nombre, double sueldo){
        this();//llamada al constructor vacio
        this.nombre=nombre;
        this.precio=sueldo;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double sueldo) {
        this.precio = sueldo;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
    
    
}
