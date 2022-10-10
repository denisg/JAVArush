
package test;

import java.io.*;



public class EntradaDatos1 {
    
    public static void main(String[] args) {
        String captura;
        InputStreamReader input = new InputStreamReader(System.in);//lee de a consola  caracter por caracter
        BufferedReader brInput = new BufferedReader(input);//con la ayuda de esto podemos leer lineas completas, ya que la clase de la linea anterior solo lee caracter por caracter
        
        System.out.println("Introduzca dato: ");
        try {
            captura = brInput.readLine();
            System.out.println("Dato introducido: "+ captura);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
    
    
}
