
package com.gm.mundopc;


public class Teclado extends DispositivoEntrada{
    //atributos
    private int idTeclado;
    private static int contadorTeclado;
    
    
    
    
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado=++Teclado.contadorTeclado;
      
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{");
        sb.append("idTeclado=").append(idTeclado).append(", ");
        sb.append("{ ").append(super.toString()).append("} ");
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
