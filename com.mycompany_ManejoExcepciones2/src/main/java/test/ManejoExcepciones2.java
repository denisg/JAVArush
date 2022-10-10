package test;

import datos.*;
import excepciones.*;

public class ManejoExcepciones2 {

    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionMySql();

        datos.simularError(false);

        ejecutar(datos, "listar");
        
        AccesoDatos datos2 = new ImplementacionOracle();
        datos2.simularError(false);
        ejecutar(datos2, "insertar");
    }

    private static void ejecutar(AccesoDatos datos, String accion) {

        if ("listar".equals(accion)) {
            //en un bloque try/catch se pueden procesar varias sentencias catch
            //procesamos las excepciones de menos jerarquia a mayor jerarquia(hijos primeros y despues padres)
            try {
                datos.listar();
            } catch (LecturaDatosEx ex) {
                System.out.println("error lectura");
                ex.printStackTrace(System.out);//esto hace que tire el stackTrace a la consola
            } catch (AccesoDatosEx ex) {
                System.out.println("error acceso a datos");
                ex.printStackTrace(System.out);
            } catch (Exception ex) {
                System.out.println("error general");
                ex.printStackTrace(System.out);
            } finally {
                System.out.println("colocar esto es opcional, pero siempre se va a ejecutar");
            }
        } else if ("insertar".equals(accion)) {
            try {
                datos.insertar();
            } catch (AccesoDatosEx ex) {
                System.out.println("Error de acceso a datos");
                ex.printStackTrace(System.out);
            } finally {
                System.out.println("colocar esto es opcional, pero siempre se va a ejecutar");
            }
        }

    }

}
