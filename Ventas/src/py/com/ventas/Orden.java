
package py.com.ventas;


public class Orden {
    //atributos
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int  MAX_PRODUCTOS=10;
    
    
    public Orden(){
        this.idOrden=++Orden.contadorOrdenes;
        this.productos=new Producto[MAX_PRODUCTOS]; 
    }
    
    public void agregarProducto(Producto producto){
        if(this.contadorProductos< Orden.MAX_PRODUCTOS){//no supera el limite 
            productos[this.contadorProductos++]=producto;
        }else{
            System.out.println("Se supero el numero maximo de la orden");
        }
    }
    
    public double calcularTotal(){
        double total=0;
        for(int i=0; i<this.contadorProductos; i++){
            total+=this.productos[i].getPrecio();
        }
        
        return total;
    }
    
    
    public void mostrarOrden(){
        System.out.println("orden: "+this.idOrden);
        System.out.println("precio: "+this.calcularTotal());
        System.out.println("Productos enlistados:");
        for(int i=0; i<contadorProductos;i++){
            System.out.println(this.productos[i].getNombre()+"\t"+this.productos[i].getPrecio());
        }
    }
    
    
    
}
