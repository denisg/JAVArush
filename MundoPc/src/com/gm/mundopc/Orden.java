
package com.gm.mundopc;


public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS=5;
    
    
    public Orden(){
        this.idOrden=++Orden.contadorOrdenes;
        this.computadoras=new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    
    public void agregarComputadora(Computadora computadora){
        //verificacion de que no supere el maximo
        if (this.contadorComputadoras<Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++]=computadora;
        }else{
            System.out.println("sobrepasas el limite");
        }
    }
    
    public double calcularTotal(){
        double total=0;
        for(int i=0;i<this.contadorComputadoras; i++){
            total+=this.computadoras[i].getCosto();
        }
        
        return total;
    }
    
    
    public void mostrarOrden(){
        System.out.println("orden: "+this.idOrden);
        System.out.println("costo total: "+this.calcularTotal());
        System.out.println("computadoras enlistadas: ");
        for(int i=0;i<this.contadorComputadoras;i++){
            Computadora computadora=this.computadoras[i];
            System.out.println(computadora.getNombre()+"\t"+computadora.getCosto());
            System.out.print("Mouse: "+computadora.getRaton().getMarca()+"\tTeclado "+computadora.getTeclado().getMarca());
        }
    }
    
    
}
