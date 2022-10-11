package test;

import datos.PersonaJDBC;
import domain.Persona;
import java.util.List;
import datos.*;
import java.sql.*;


public class ManejoPersonas {

    public static void main(String[] args) {

        Connection conexion = null;
        try {
            conexion=Conexion.getConnection();//tenemos conexion fuera de la clase JDBC(PersonaJDBC en este caso)
            //autocommit hace que se guarden los cambios automaticamente despues de una sentencia en la BD
            //ahora se verifica el autocommit de la conexion, ya que se desean hacer transacciones, nosotros manejaremos el commit, autocommit=false
            if (conexion.getAutoCommit()) {//si es verdadero
                conexion.setAutoCommit(false);//se pasa a falso
            }

            PersonaJDBC personaJDBC = new PersonaJDBC(conexion);//aqui se le pasa la conexion a la clase, es externa, pq se genero aqui la conexion
            //si no se pasa como parametro, no esta mal, solo que no se aplica el concepto de transaccion

            //se procede a ejecutar varias sentencias
            //update
            Persona cambioPersona = new Persona();
            cambioPersona.setId_persona(2);
            cambioPersona.setNombre("Karla Ivonne");
            cambioPersona.setApellido("Gomez");
            cambioPersona.setEmail("kgomez@gmail.com");
            cambioPersona.setTelefono("0982782562");
            personaJDBC.update(cambioPersona);

            //insert
            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Carlos");
            //nuevaPersona.setApellido("dkfvbdzjdnbfjkzvnlriknuzlirgnulieaunafksgdfhajdsbfuybkfuhgleiurjn");//inducimos el error(superar limite de 45 caracteres)
            nuevaPersona.setApellido("ramirez");
            personaJDBC.insert(nuevaPersona);

            //si todo funciona despues de las sentencias se realiza el commit 
            conexion.commit();//aqui recien se reflejan los cambio en la BD

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Error, se realiza rollback");
            try {
                //la variable conexion debe ser creada fuera del bloque try-catch
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }

    }

}
