package test;

import dominio.*;

public class ClaseObject {

    public static void main(String[] args) {
        Empleado emp1 = new Empleado("juan", 10000);
        Empleado emp2 = new Empleado("Juan", 10000);

        
        compararObjetos(emp1, emp2);
    }
    
    
    private static void compararObjetos(Empleado emp1, Empleado emp2){
        System.out.println("emp1 = " + emp1);
        System.out.println("emp2 = " + emp2);
        
        //evaluacion por referencia
        if(emp1==emp2){
            System.out.println("misma direccion");
        }else{
            System.out.println("distinta direccion");
        }
        
        //revision del metodo equals
        if (emp1.equals(emp2)){
            System.out.println("mismo contenido");
        }else{
            System.out.println("distinto contenido");
        }
        
        //revision metodo hashcode()
        if(emp1.hashCode()==emp2.hashCode()){
            System.out.println("mismo codigo hash");
        }else{
            System.out.println("no tienen mismo codigo hash");
        }
        //OBS:si los objetos tienen el mismo contenido, el codigo hash debe ser igual
        //ya que el codigo hash se obtiene en base al contenido del objeto
        System.out.println("hash emp1: "+emp1.hashCode());
        System.out.println("hash emp2: "+emp2.hashCode());
        
    }
    
    
    
}
