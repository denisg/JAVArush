package dominio;

/**
 *
 * @author Excelsis
 */
public class Persona {

    protected String nombre;//permite que se herede el atributo, 'private' no permite la heredacion de los atributos 
    protected char genero;
    protected int edad;
    protected String direccion;

    //contructores
    public Persona(){
        
    }
    
    public Persona(String nombre) {
        this.nombre=nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char geneero) {
        this.genero = geneero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
    }

    

}
