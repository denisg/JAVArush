
package datos;

import excepciones.*;


public interface AccesoDatos {
    //las variables que se guardan aqui deben ser constantes
    //'public static' el compilador se encarga de eso
    public static int MAX_REGISTROS=10;
    
    
    //metodos, de la misma manera 'public abstract' en los metodos se encarga de poner el compi
    public abstract void insertar() throws AccesoDatosEx;
    
    public abstract void listar() throws AccesoDatosEx;
    
    public abstract void simularError(boolean simularError);
    
    
}
