
package datos;

import excepciones.*;



public class ImplementacionMySql implements AccesoDatos {

    private boolean simularError;

    @Override
    public void insertar() throws AccesoDatosEx{
        if (this.simularError) {
            throw new EscrituraDatosEx("Error en la escritura de datos mysql");
        } else {
            System.out.println("insertar desde mysql");
        }

    }

    @Override
    public void listar() throws AccesoDatosEx{
        if(this.simularError){
            throw new LecturaDatosEx("error de lectura de datos mysql");
        }else{
            System.out.println("listar desde mysql");
        }        
    }

    @Override
    public void simularError(boolean simularError) {
        this.simularError = simularError;
    }

    public boolean isSimularError() {
        return this.simularError;
    }

}
