/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_sergiosuazo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Workstation DSY
 */
public class adminTransaccion {
    private ArrayList<Transaccion> listaTransaccion = new ArrayList<>();
    private File archivo=null;

    public adminTransaccion(String path) {
        archivo=new File(path);
    }

    public ArrayList<Transaccion> getListaTransaccion() {
        return listaTransaccion;
    }

    public void setListaTransaccion(ArrayList<Transaccion> listaTransaccion) {
        this.listaTransaccion = listaTransaccion;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setTransaccion(Transaccion l)
    {
        this.listaTransaccion.add(l);
    }
        
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Transaccion p : listaTransaccion) {
                bw.write(p.getCuenta()+ ";");
                bw.write(p.getId() + ";");
                bw.write(p.getAccion() + ";");
                bw.write(p.getFecha() + ";");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo(){
        listaTransaccion = new ArrayList<>();
        if (archivo.exists()) {
            try {
                String linea;
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                while ((linea=br.readLine()) != null) {
                    String[] tokens = linea.split(";");
                    listaTransaccion.add(new Transaccion(tokens[0],Integer.parseInt(tokens[1]), tokens[2],tokens[3]));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
