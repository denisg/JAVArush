//Esta clase se encarga de realizar las operaciones sobre la tabla de base de datos 'persona'
//leer, insertar, modificar, eliminar
package datos;

import domain.PersonaDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaDaoJDBC implements PersonaDao{

    private Connection conexionTransaccional;//para manejar transacciones, por si reciba por fuera de la clase

    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";//se desconocen los valores, se envian despues
    private static final String SQL_UPDATE = "UPDATE persona SET nombre=?, apellido=?, email=?, telefono=? WHERE id_persona=?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona=?";

    public PersonaDaoJDBC() {

    }

    public PersonaDaoJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;//maneja la conexion
        //en este caso no se cierra la conexion al ejecutar uno de los metodos de esta clase
        //la transaccion se maneja fuera de esta clase, clase externa es la que se encarga de decidir cuando
        //hacer commit  o rollback
    }

    //metodo para modificar un registro
    public List<PersonaDTO> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        PersonaDTO persona = null;
        List<PersonaDTO> personas = new ArrayList<PersonaDTO>();

        try {
            //se verifica si la conexion es nula, si lo es, obtiene una nueva conexion, si no lo es, entonces el parametro es el que trajo la conexion desde afuera de la clase
            //mas abajo se verifica de donde viene la conexion, para saber si el metodo de esta clase debe encargar se cerrar la conexion(parte del finally)
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_persona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                persona = new PersonaDTO();
                persona.setId_persona(id_persona);
                persona.setNombre(nombre);
                persona.setApellido(apellido);
                persona.setEmail(email);
                persona.setTelefono(telefono);
                personas.add(persona);
            }

        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {//si el parametro es nulo, quiere decir que la conexion se creo en este metodo, por lo tanto debe tambien cerrarse aqui la conexion
                Conexion.close(conn);
            }//si la conexion vino de afuera, aqui no se cierra

        }
        return personas;
    }

    public int insert(PersonaDTO persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int rows = 0;//para saber cuantos registros han sido afectados
        try {
            //se verifica si la conexion es nula, si lo es, obtiene una nueva conexion, si no lo es, entonces el parametro es el que trajo la conexion desde afuera de la clase
            //mas abajo se verifica de donde viene la conexion, para saber si el metodo de esta clase debe encargar se cerrar la conexion(parte del finally)
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            //se pasan ahora los parametros a la consulta
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());

            System.out.println("Ejecutando query " + SQL_INSERT);
            rows = stmt.executeUpdate();//aqui no hace falta mandar de nuevo el query, ya lo  mandamos en .prepareStatement()
            System.out.println("registros afectados: " + rows);
        } finally {
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {//si el parametro es nulo, quiere decir que la conexion se creo en este metodo, por lo tanto debe tambien cerrarse aqui la conexion
                Conexion.close(conn);
            }//si la conexion vino de afuera, aqui no se cierra
        }
        return rows;
    }

    public int update(PersonaDTO persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            //se verifica si la conexion es nula, si lo es, obtiene una nueva conexion, si no lo es, entonces el parametro es el que trajo la conexion desde afuera de la clase
            //mas abajo se verifica de donde viene la conexion, para saber si el metodo de esta clase debe encargar se cerrar la conexion(parte del finally)
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            System.out.println("Ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            stmt.setInt(5, persona.getId_persona());

            rows = stmt.executeUpdate();
            System.out.println("Registros Actualizados: " + rows);

   
        } finally {
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {//si el parametro es nulo, quiere decir que la conexion se creo en este metodo, por lo tanto debe tambien cerrarse aqui la conexion
                Conexion.close(conn);
            }//si la conexion vino de afuera, aqui no se cierra
        }

        return rows;

    }

    public int delete(PersonaDTO persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            //se verifica si la conexion es nula, si lo es, obtiene una nueva conexion, si no lo es, entonces el parametro es el que trajo la conexion desde afuera de la clase
            //mas abajo se verifica de donde viene la conexion, para saber si el metodo de esta clase debe encargar se cerrar la conexion(parte del finally)
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            System.out.println("Ejecutando query : " + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getId_persona());
            rows = stmt.executeUpdate();
            System.out.println("Registros alterados: " + rows);
        } finally {
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {//si el parametro es nulo, quiere decir que la conexion se creo en este metodo, por lo tanto debe tambien cerrarse aqui la conexion
                Conexion.close(conn);
            }//si la conexion vino de afuera, aqui no se cierra
        }
        return rows;
    }

}
