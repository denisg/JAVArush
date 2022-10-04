
package test;

import dominio.*;

/**
 *
 * @author Excelsis
 */
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1=new Persona("Denis", 5000.00, false);
        persona1.setNombre("Denis Gabriel");
        //System.out.println("nombre:"+persona1.getNombre());
        System.out.println("persona1: "+persona1.toString());
    }
}
