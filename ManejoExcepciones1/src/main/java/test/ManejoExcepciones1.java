
package test;

import dominio.Division;
import dominio.OperacionExcepcion;



public class ManejoExcepciones1 {
    
    //puede existir excepciones, si hay, lo lanza en consola('throws OperacionExcepcion')....aqui se propaga el error
    //la otra solucion es envolver la excepcion con un try-catch
    public static void main(String[] args){
        try {
            Division division= new Division(10, 0);
        } catch (OperacionExcepcion ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();//hace que impila la pila de excepciones
        }
    }
    
    
}
