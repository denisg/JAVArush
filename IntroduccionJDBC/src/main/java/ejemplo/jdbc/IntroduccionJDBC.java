
package ejemplo.jdbc;

import java.sql.*;



public class IntroduccionJDBC {
    public static void main(String[] args) {
        
        //paso 1, creacion de nuestra cadena de conexion a mysql
        String url="jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";
        
        try {
            //paso 2, creacio nde objeto conexion a la base de datos
            Connection conexion=DriverManager.getConnection(url,"root", "admin");
            
            //paso 3, creacion de objeto statement
            Statement instruccion=conexion.createStatement();
            
            //paso 4, creacion de sentencia query
            String sql="select id_persona, nombre, apellido, email, telefono from persona";
            
            //paso 5, ejecucion de query
            ResultSet resultado=instruccion.executeQuery(sql);
            
            //paso 6, procesamos el resultado
            while (resultado.next()){
                System.out.println("Id_persona: "+resultado.getInt(1));
                System.out.println(" Nombre: "+resultado.getString(2));
                System.out.println(" Apellido: "+resultado.getString(3));
                System.out.println(" Email: "+resultado.getString(4));
                System.out.println(" Telefono: "+resultado.getString(5));
            }
            
            //cerramos objetos que se conectan a la base de datos 
            resultado.close();
            instruccion.close();
            conexion.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
        
    }
}
