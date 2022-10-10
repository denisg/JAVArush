
package test;

import java.util.Scanner;
import static calculadora.Operaciones.*;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("ingrese primer valor");
        int a= sc.nextInt();//esta funcion no procesa el '\n'
        System.out.println("Ingrese segundo valor");
        int b= sc.nextInt();
        int resultado=sumar(a, b);
        System.out.println("resultado de la suma: "+resultado);
    }
}
