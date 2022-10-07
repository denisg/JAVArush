
package abstracto.domain;


public class Circulo extends FiguraGeometrica{
    
    
    
    //constructor
    public Circulo(String tipoFigura){
        super(tipoFigura);
    }
    
    
    public void dibujar(){
        //se debe definir comportamiento, si no, toda la clase debe ser abstracta
        System.out.println("aqui se dibuja un..."+this.getClass().getSimpleName());
    }
    
    
}
