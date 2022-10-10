package manejoColecciones;

import java.util.*;

public class ManejoColecciones {

    public static void main(String[] args) {
        //'List' es una interface, por lo tanto no se pueden instanciar
        //pero una clase que si la implementa la interface es 'ArrayList'
        List miLista = new ArrayList(); //permite ingresar elementos de forma dinamica y de forma ordenada
        //se pueden agregar cualquier tipo de elementos
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        //elemento repetido
        miLista.add(3);//si acepta elementos duplicados
        //imprimir(miLista);

        //'Set' de nuevo es una interface y una clase que la implementa y que generalmente se utiliza es 'HashSet'
        Set miSet = new HashSet();
        miSet.add(100);
        miSet.add(200);
        miSet.add(300);
        //element duplicado
        miSet.add(300);//no agrega elementos duplicados
        //imprimir(miSet);

        //'Map' es una interface,  de nuevo, la clase que lo implementa es 'HashMap'
        Map miMapa = new HashMap();
        //aqui a diferencia de Set y List es que se maneja el par {llave, valor}
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Camila");
        miMapa.put("valor3", "Carlos");
        //elemento repetido, en este caso se sustituye el valor en la clave especificada
        miMapa.put("valor3", "Rosario");
        //para imprimir, aquie se pueden imprimir las llaves  y los valores, juntos o por separado
        //aqui no hay orden, en la impresion de 'Map's        
        //impresion de llaves
        //imprimir(miMapa.keySet());
        
        //impresion de valores
        //imprimir(miMapa.values());
        
        //si queremos imprimir un valor especifico asociado a una llave
        System.out.println(miMapa.get("valor3"));
        

    }

    //'Collection' es la interface padre de lo que vamos a ir utilizando(list, set o map)
    private static void imprimir(Collection coleccion) {
        for (Object elemento : coleccion) {
            System.out.println("Elemento: " + elemento);
        }
        System.out.println("");

    }

}
