
package bloquescodigo;


public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    //bloque de inicializacion de codigo estatico
    static{//este bloque no se relaciona con los objetos de la clase
        //aqui no se pueden utilizar variables no estaticas
        contadorPersonas=10;
        System.out.println("bloque estatico");
        
        
    }
   
    //bloque dinamico, cada objeto ejecuta este bloque
    {
        System.out.println("bloque dinamico");
        this.idPersona= ++ contadorPersonas;
    }
    
    //constructor
    public Persona(){
        System.out.println("Constructor");
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }  
}
