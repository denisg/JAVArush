
package com.gm.mundopc;


public class Raton extends DispositivoEntrada{
    //atributos
    private int idRaton;
    private static int contadorRatones;
    
    
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton=++Raton.contadorRatones;
        
    }

    public int getIdRaton() {
        return idRaton;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{");
        sb.append("idRaton=").append(idRaton).append(", ");
        sb.append("{ ").append(super.toString()).append("} ");
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
    
}
