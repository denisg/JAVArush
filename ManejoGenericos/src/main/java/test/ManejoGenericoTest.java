
package test;
import genericos.*;


public class ManejoGenericoTest {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt=new ClaseGenerica(15);
        objetoInt.obtenerTipo();
        
        ClaseGenerica<String> objetoStr = new ClaseGenerica("Denis");
        objetoStr.obtenerTipo(); 
        
        //OBS: los genericos no pueden ser aplicados a tipos primitivos
        //ClaseGenerica<int> objetoPrimitivo = new ClaseGenerica(10);
    }
}
