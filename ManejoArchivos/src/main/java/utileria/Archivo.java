
package utileria;

import java.io.*;






public class Archivo {
    
    public static void crearArchivo(String nombreArchivo){
        File archivo=new File(nombreArchivo);
        try {
            PrintWriter salida=new PrintWriter(archivo);//apertura de flujo
            salida.close();//cierre de flujo, para que se escriba en el disco duro
            System.out.println("Archivo creado correctamente");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }   
    }
    
    public static void escribirArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            String contenido="contenido a escribir";
            salida.println(contenido);
            salida.println();
            salida.println("fin de escritura");
            salida.close();
            System.out.println("se ha escrito correctamente el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
        
        
    }
    
    
    public static void leerArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));//creacion de objeto BufferedReader para poder leer lineas completas
            String lectura= entrada.readLine();
            
            while(lectura != null){
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        
        
        
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
    
    
    public static void anexarArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            //no se le pasa directamente el objeto 'File', mas bien un 'FileWriter', el 2do parametro es true, para que se anexen 
            //los datos(no sobre-escribe)
            PrintWriter salida= new PrintWriter(new FileWriter(archivo, true ));
            String contenido= "anexando info al archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fin anexado");
            salida.close();
            System.out.println("Anexado de info correcto");
            
            
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    
    
    
    
    
    
    
}
