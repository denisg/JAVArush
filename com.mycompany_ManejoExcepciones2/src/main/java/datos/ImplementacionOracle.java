
package datos;

import excepciones.*;

//se pueden implementar mas de una interfaz en una clase
//OBS se deben implementar las funciones de la interface, si no, esta clase debe ser abstracta
public class ImplementacionOracle implements AccesoDatos {

    private boolean simularError;

    @Override
    public void insertar() throws AccesoDatosEx {
        if (this.simularError) {
            throw new EscrituraDatosEx("error al ingresar desde oracle");
        } else {
            System.out.println("Insertar desde oracle");
        }

    }

    @Override
    public void listar() throws AccesoDatosEx {
        if (this.simularError) {
            throw new LecturaDatosEx("error en la lectura de datos oracle");
        } else {
            System.out.println("listar desde oracle");
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
