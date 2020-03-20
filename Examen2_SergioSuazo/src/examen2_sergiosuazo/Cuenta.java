/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_sergiosuazo;

import java.io.Serializable;

/**
 *
 * @author Workstation DSY
 */
public class Cuenta implements Serializable{
    private int numero,saldo;
    private String user;

    public Cuenta() {
    }

    public Cuenta(int numero, int saldo, String user) {
        this.numero = numero;
        this.saldo = saldo;
        this.user = user;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numero=" + numero + ", saldo=" + saldo + ", user=" + user + '}';
    }
    
}
