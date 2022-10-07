
package ejemploAbstraccion;

import abstracto.domain.*;

public class EjemploAbstraccion {
    public static void main(String[] args) {
        //no se puede instanciar
        //FiguraGeometrica figuraGeometrica¡ new FiguraGeometrica();
    
        //se define un objeto rectangulo, pero declarando como un objeto de la clase padre
        //para almacenar referencias de clases hijas
        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
        System.out.println("rectangulo = " + rectangulo);
        rectangulo.dibujar();
        
        FiguraGeometrica triangulo = new Triangulo("Triangulo");
        System.out.println("triangulo = " + triangulo);
        triangulo.dibujar();
        
        FiguraGeometrica circulo = new Circulo("circulo");
        System.out.println("circulo = " + circulo);
        circulo.dibujar();
    
    
    
    
    
    }
}
