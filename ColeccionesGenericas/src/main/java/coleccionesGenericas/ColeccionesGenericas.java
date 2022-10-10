package coleccionesGenericas;

import java.util.*;

public class ColeccionesGenericas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList();//de esta manera ya definimos el tipo de dato a guardar('String'), no se puede agregar de otro tipo
        miLista.add("Denis");
        miLista.add("Dina");
        miLista.add("Monica");
        miLista.add("Dina");
        //imprimir(miLista);
        
        
        Set<String> miSet=new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        miSet.add("100");
        //imprimir(miSet);
        
        
        
        Map<String, String> miMapa=new HashMap();
        miMapa.put("valor1", "1000");
        miMapa.put("valor2", "2000");
        miMapa.put("valor3", "3000");
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
        
        
        
    }
    
    private static void imprimir(Collection<String> col){
        for(String elemento: col){
            System.out.println("Elemento: "+elemento);
        }
        System.out.println("");
    }

}
