package excepciones;

//RuntimeException, son excepciones unchecked, no hace falta reportarlas
public class AccesoDatosEx extends Exception {

    public AccesoDatosEx(String mensaje){
        super(mensaje);
    }

}
