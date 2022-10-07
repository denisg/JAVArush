
package abstracto.domain;

//ojo, no se puede instanciar esta clase abstracta
public abstract class FiguraGeometrica {
    //atributo
    protected String tipoFigura;
    
    //constructor
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura=tipoFigura;
    }
    
    
    //metodos abstractos, se definen en las clases hijas
    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }
    
    
    
    
    
    
    
    
}
