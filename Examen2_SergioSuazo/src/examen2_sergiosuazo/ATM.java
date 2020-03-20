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
public class ATM implements Serializable{
    private int id,dinero;
    private String ubicacion,mantenimiento;
    private Date fecha;

    public ATM() {
    }

    public ATM(int id, int dinero, String ubicacion, String mantenimiento, Date fecha) {
        this.id = id;
        this.dinero = dinero;
        this.ubicacion = ubicacion;
        this.mantenimiento = mantenimiento;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(String mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return ubicacion;
    }
    
}
