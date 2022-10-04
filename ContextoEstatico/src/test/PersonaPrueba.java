package test;

import dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        //System.out.println("persona1 = " + persona1);

        Persona persona2 = new Persona("denis");
        //System.out.println("persona2 = " + persona2);
        //el contador subio por que es estatico
        
        imprimir(persona1);
        imprimir(persona2);
        
        
        //observacion: la palabra 'this' no se puede utilizar en el contexto estatico
        //una variable dinamica no puede ser referenciada desde un contexto estatico

    }

    //en metodos estaticos no se pueden llamar a metodos no estaticos  
    public static void imprimir(Persona persona) {
        System.out.println("persona = " + persona);
    }

}
