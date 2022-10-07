
package manejoInterfaces;

import datos.*;


public class ManejoInterfaces {
    public static void main(String[] args) {
        //se define un objeto del tipo interface
        //estos pueden apuntar a objetos de clases que implementaron la interface
        
        AccesoDatos datos = new ImplementacionOracle();
        
        datos.insertar();
        datos.listar();
        
        datos=new ImplementacionMySql();
        datos.insertar();
        datos.listar();
        
        System.out.println(AccesoDatos.MAX_REGISTROS+"");
        
        
        
    }
}
