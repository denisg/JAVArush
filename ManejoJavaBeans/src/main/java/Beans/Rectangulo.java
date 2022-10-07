
package Beans;


public class Rectangulo {
    //tiene un constructor vacio por defecto para considerarse un javabeans
    //puede luego tener sus respectivos constructores
    private int base;
    private int altura;
    
    
    public int getAltura(){
        return this.altura;
    }
    
    public void setAltura(int altura){
        this.altura=altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
    public int getArea(){
        return this.base*this.altura;
    }
    
}
