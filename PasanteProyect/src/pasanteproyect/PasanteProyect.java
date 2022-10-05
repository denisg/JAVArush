/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pasanteproyect;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Excelsis
 */
public class PasanteProyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola jefe:");
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa algun nro:");
        int varrand=parseInt(sc.nextLine());
        System.out.println("salida: "+varrand);
    }
    
}
