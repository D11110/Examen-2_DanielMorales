/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_danielmorales;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class adminComputadoras {

    private ArrayList<Computadora> listaComputadoras = new ArrayList();
    private File archivo = null;

    public adminComputadoras(String path) {
        archivo = new File(path);
    }

    public ArrayList<Computadora> getListaComputadoras() {
        return listaComputadoras;
    }

    public void setListaComputadoras(ArrayList<Computadora> listaComputadoras) {
        this.listaComputadoras = listaComputadoras;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Computadora c : listaComputadoras) {
                bw.writeObject(c);
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

    public void cargarArchivo() {
        try {
            listaComputadoras = new ArrayList();
            Computadora temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Computadora) objeto.readObject()) != null) {
                        listaComputadoras.add(temp);

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
}
