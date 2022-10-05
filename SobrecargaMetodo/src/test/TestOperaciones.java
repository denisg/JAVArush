/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import operaciones.Operaciones;

public class TestOperaciones {

    public static void main(String[] args) {
        int resultado = Operaciones.sumar(5, 7);
        System.out.println("resultado = " + resultado);

        double resultado2 = Operaciones.sumar(5D, 12);
        System.out.println("resultado2 = " + resultado2);
        
        //en este caso va a tomar la funcion en donde los argumentos soporte el tipo de parametro(double soporta un tipo long)
        double resultado3 = Operaciones.sumar(8, 12L);
        System.out.println("resultado3 = " + resultado3);

    }

}
