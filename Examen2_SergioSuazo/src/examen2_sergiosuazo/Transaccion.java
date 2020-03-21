/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_sergiosuazo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Workstation DSY
 */
public class Transaccion implements Serializable{
    private int id;
    private String cuenta,accion,fecha;


    public Transaccion() {
    }

    public Transaccion(String cuenta, int id, String accion, String fecha) {
        this.cuenta = cuenta;
        this.id = id;
        this.accion = accion;
        this.fecha = fecha;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }



    @Override
    public String toString() {
        return "Transaccion{" + "cuenta=" + cuenta + ", id=" + id + ", accion=" + accion + ", fecha=" + fecha + '}';
    }

    
}
