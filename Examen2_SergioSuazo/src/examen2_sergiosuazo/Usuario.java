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
public class Usuario implements Serializable{
    private String nombre1,nombre2,apellido1,apellido2,user,contra;
    private Date fecha,afiliacion;

    public Usuario() {
    }

    public Usuario(String nombre1, String nombre2, String apellido1, String apellido2, String user, String contra, Date fecha,Date afiliacion) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.user = user;
        this.contra = contra;
        this.fecha = fecha;
        this.afiliacion = afiliacion;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(Date afiliacion) {
        this.afiliacion = afiliacion;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre1=" + nombre1 + ", apellido1=" + apellido1 + '}';
    }
    
    
}
