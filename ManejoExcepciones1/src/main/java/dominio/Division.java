
package dominio;


public class Division {
    private int numerador;
    private int denominador;
    
    
    //'throws' indica que el constructor puede emitir excepciones, dentro de su codigo puede arrojar la excepcion
    public Division(int numerador, int denominador) throws OperacionExcepcion{
        if(this.denominador==0){
            throw new OperacionExcepcion("Denominador igual a cero");
        }
        
        this.numerador=numerador;
        this.denominador=denominador;
    }
    
    public void visualizarOperacion(){
        System.out.println("El resultado de la division es: "+this.numerador/this.denominador);
    }
    
    
}
