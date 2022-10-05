
package mundoPc;

import com.gm.mundopc.*;


public class MundoPc {
    public static void main(String[] args) {
        Raton raton1=new Raton("alambrico","logitech");
        Raton raton2=new Raton("inhalambrico","razork");
        
        Teclado teclado1=new Teclado("USB","delmer");
        Teclado teclado2=new Teclado("Bluetooth","facherp");
        
        Monitor monitor1=new Monitor("Sony", 15.6);
        Monitor monitor2=new Monitor("Philips", 14);
        

        //error aqui, cachale
        Computadora computadora1=new Computadora("HP", 4500000.0, monitor2, teclado1, raton1);
        Computadora computadora2=new Computadora("Dell", 5500000.0, monitor1, teclado2, raton2);

        
        Orden orden=new Orden();
        
        orden.agregarComputadora(computadora1);
        orden.agregarComputadora(computadora2);
       
        orden.mostrarOrden();
        
        
    }
}
