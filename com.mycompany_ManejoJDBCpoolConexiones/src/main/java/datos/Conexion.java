
package datos;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;


public class Conexion {
    private static final String JDBC_URL="jdbc:mysql://localhost/test?useSSL=false&serverTimezone=UTC";
    private static final String JDBC_USER="root";   
    private static final String JDBC_PASS="admin";
    
    
    //crear metodo que se encarga de inicializar el objeto de pool de conexiones, a este metodo se le pide luego las conexiones a la BD
    public static DataSource getDataSource (){
        BasicDataSource ds=new BasicDataSource();
        
        ds.setUrl(JDBC_URL);
        ds.setUsername(JDBC_USER);
        ds.setPassword(JDBC_PASS);
        
        //definimos tamanho inicial del pool de conexiones
        ds.setInitialSize(5);//ojo con cuantas conexiones por default hay a la BD 
        
        return ds;
        
        
        
    }
    
    
    
    public static Connection getConnection() throws SQLException{
        return getDataSource().getConnection();//retorna la conexion basicamente...getConnection sin parametros ya que en getDataSource se pasaron todos los parametros ya
    }
    
    //metodos para cerrar los objetos que hacen conexion con la bd
    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    
    
}
