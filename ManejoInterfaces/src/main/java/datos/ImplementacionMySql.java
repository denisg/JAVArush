/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

/**
 *
 * @author DenisG
 */
public class ImplementacionMySql implements AccesoDatos{

    @Override
    public void insertar() {
        System.out.println("insertar desde mysql");
    }

    @Override
    public void listar() {
        System.out.println("listar desde mysql");
    }
    
}
