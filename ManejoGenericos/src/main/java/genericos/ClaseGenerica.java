
package genericos;


public class ClaseGenerica<T> {
    //aributo
    T objeto;
    
    
    //constructor
    public ClaseGenerica(T objeto){
        this.objeto=objeto;
    }
    
    
    
    public void obtenerTipo(){
        System.out.println("Tipo: "+objeto.getClass().getSimpleName());
    }
}
