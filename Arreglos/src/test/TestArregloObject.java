
package test;

import dominio.Persona;


public class TestArregloObject {
    public static void main(String[] args) {
        Persona personas[]=new Persona[2];
        
        personas[0]=new Persona("Denis");
        personas[1]=new Persona("Froilan");
        System.out.println("personas 0 = " + personas[0]);
        System.out.println("personas 1 = " + personas[1]);
    }
}
