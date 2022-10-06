
package test;


public class EjemploVarArgs {
    public static void main(String[] args) {
        //impresion de varios elementos
        imprimirNumeros(12,43,56,43,64);
    }
    
    
    
    private static void imprimirNumeros(int... numeros){
        for(int i=0; i<numeros.length;i++){
            System.out.println("numero: "+numeros[i]);
        }
    }
}
