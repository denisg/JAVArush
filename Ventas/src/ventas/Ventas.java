
package ventas;

import py.com.ventas.*;

public class Ventas {
    public static void main(String[] args) {
        
        //creacion de productos
        Producto producto1=new Producto("Fideo", 4500);
        Producto producto2=new Producto("Carne", 31000);
        
        //creacion de orden
        Orden orden1=new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        
        orden1.mostrarOrden();
  
        
    }
}
