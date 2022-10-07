/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

//se pueden implementar mas de una interfaz en una clase
//OBS se deben implementar las funciones de la interface, si no, esta clase debe ser abstracta
public class ImplementacionOracle implements AccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar desde oracle");
    }

    @Override
    public void listar() {
        System.out.println("listar desde oracle");
    }
    
}
