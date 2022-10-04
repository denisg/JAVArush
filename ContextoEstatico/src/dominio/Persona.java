package dominio;

public class Persona {

    //atributos
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;

    //constructor
    public Persona(String nombre) {
        this.nombre = nombre;
        //incrementar por cada nuevo
        Persona.contadorPersonas++;
        //asignacion de nuevo valor a idPersona
        this.idPersona = Persona.contadorPersonas;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    

}