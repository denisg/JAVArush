
package test;

import java.util.Scanner;

public class EntradaDatos2 {
    
    public static void main(String[] args) {
        String captura;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese datos: ");
        captura= sc.nextLine();//lee la linea completa
        while(!"salir".equals(captura)){
            System.out.println("Dato introducido: "+captura);
            captura= sc.nextLine();
        }
        
        
        
    }
    
    
    
}
