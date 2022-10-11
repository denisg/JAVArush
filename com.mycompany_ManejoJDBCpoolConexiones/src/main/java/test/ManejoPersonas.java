package test;

import datos.PersonaDaoJDBC;
import domain.PersonaDTO;
import java.util.List;
import datos.*;
import java.sql.*;


public class ManejoPersonas {

    public static void main(String[] args) {

        Connection conexion = null;
        try {
            conexion=Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            //utilizamos Interface
            PersonaDao personaDao = new PersonaDaoJDBC(conexion);

            List<PersonaDTO> personas = personaDao.select();
            
            for (PersonaDTO persona: personas){
                System.out.println("Persona DTO: "+persona);
            }
            

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
