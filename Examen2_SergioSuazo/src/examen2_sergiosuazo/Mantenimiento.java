
package examen2_sergiosuazo;

import java.util.ArrayList;
import java.util.Date;

public class Mantenimiento extends Usuario{
    private ArrayList<ATM> atm = new ArrayList<>();

    public Mantenimiento() {
    }

    public Mantenimiento(String nombre1, String nombre2, String apellido1, String apellido2, String user, String contra, Date fecha, Date afiliacion) {
        super(nombre1, nombre2, apellido1, apellido2, user, contra, fecha, afiliacion);
    }

    public ArrayList<ATM> getAtm() {
        return atm;
    }

    public void setAtm(ArrayList<ATM> atm) {
        this.atm = atm;
    }

    @Override
    public String toString() {
        return "Mantenimiento{" + "atm=" + atm + '}';
    }
    
}
