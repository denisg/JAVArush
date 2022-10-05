/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Excelsis
 */
public class Empleado extends Persona{
    //atributos
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    public Empleado(){
        this.idEmpleado=++Empleado.contadorEmpleado;
    }

    public Empleado(String nombre, double sueldo) {
        //super(nombre);            //OBS:super() y this() no se pueden utilizar al mismo tiempo
        this(); //llama al contructor vacio de la clase(llamada interna de constructores)
        this.nombre=nombre;     //el atributo heredado se completa aqui entonces, no con super
        this.sueldo=sueldo; 
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();//permite modificar String, ya que originalmente son inmutables
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", ").append(super.toString()).append("}");
        sb.append(", sueldo=").append(sueldo); 
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
