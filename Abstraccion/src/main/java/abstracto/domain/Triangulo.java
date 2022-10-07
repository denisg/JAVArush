
package abstracto.domain;


public class Triangulo  extends FiguraGeometrica{
    //constructor
    public Triangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    
    public void dibujar(){
        //se debe definir comportamiento, si no, toda la clase debe ser abstracta
        System.out.println("aqui se dibuja un..."+this.getClass().getSimpleName());
    }
}
