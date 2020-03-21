/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_sergiosuazo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Workstation DSY
 */
public class Cliente extends Usuario{
    private ArrayList<Cuenta> cuentas=new ArrayList<>();
    private ArrayList<Transaccion> mistransacciones=new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String nombre1, String nombre2, String apellido1, String apellido2, String user, String contra, Date fecha, Date afiliacion) {
        super(nombre1, nombre2, apellido1, apellido2, user, contra, fecha, afiliacion);
    }

    

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public ArrayList<Transaccion> getMistransacciones() {
        return mistransacciones;
    }

    public void setMistransacciones(ArrayList<Transaccion> mistransacciones) {
        this.mistransacciones = mistransacciones;
    }
    

    @Override
    public String toString() {
        return super.getNombre1();
    }
    
}
