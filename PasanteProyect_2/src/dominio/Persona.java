/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Excelsis
 */
public class Persona {

    //atributos
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    //Constructor
    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    
    //getters/ setters
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo=sueldo;
    }
    
    public boolean isEliminado(){
        return this.eliminado;
    }
    
    public void setEliminado(boolean eliminado){
        this.eliminado=eliminado;
    }
    
    
    public String toString(){
        return "Persona [ nombre "+this.nombre+
                ", sueldo: "+this.sueldo+
                ", eliminado: "+this.eliminado+" ]";
    }
    
    
}
