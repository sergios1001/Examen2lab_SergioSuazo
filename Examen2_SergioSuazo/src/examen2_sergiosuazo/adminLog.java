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
public class adminLog {
    private ArrayList<Log> listaLog = new ArrayList<>();
    private File archivo=null;

    public adminLog(String path) {
        archivo=new File(path);
    }

    public ArrayList<Log> getListaLog() {
        return listaLog;
    }

    public void setListaLog(ArrayList<Log> listaLog) {
        this.listaLog = listaLog;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setLog(Log l)
    {
        this.listaLog.add(l);
    }
        
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Log p : listaLog) {
                bw.write(p.getUser()+ ";");
                bw.write(p.getAccion() + ";");
                bw.write(p.getFecha() + ";");
                bw.write(p.getHora() + ";");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo(){
        listaLog = new ArrayList<>();
        if (archivo.exists()) {
            try {
                String linea;
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                while ((linea=br.readLine()) != null) {
                    String[] tokens = linea.split(";");
                    listaLog.add(new Log(tokens[0], tokens[1], tokens[2],tokens[3]));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
