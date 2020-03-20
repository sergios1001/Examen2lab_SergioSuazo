/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_sergiosuazo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Workstation DSY
 */
public class adminMantenimiento {
    private ArrayList<Mantenimiento> listaMantenimiento=new ArrayList<>();
    private File archivo=null;

    public adminMantenimiento(String path) {
        archivo=new File(path);
    }

    public ArrayList<Mantenimiento> getListaMantenimiento() {
        return listaMantenimiento;
    }

    public void setListaMantenimiento(ArrayList<Mantenimiento> listaMantenimiento) {
        this.listaMantenimiento = listaMantenimiento;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setMantenimiento(Mantenimiento m)
    {
        this.listaMantenimiento.add(m);
    }
    
       
    public void cargarArchivo() {
        try {            
            listaMantenimiento = new ArrayList();
            Mantenimiento temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Mantenimiento) objeto.readObject()) != null) {
                        listaMantenimiento.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Mantenimiento t : listaMantenimiento) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
