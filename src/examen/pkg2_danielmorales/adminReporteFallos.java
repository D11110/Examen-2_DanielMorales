/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_danielmorales;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author danie
 */
public class adminReporteFallos {
     private ArrayList<OrdenEnsamblaje> ensamblajes = new ArrayList();
    private File archivo = null;

    public adminReporteFallos() {
    }

    public adminReporteFallos(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<OrdenEnsamblaje> getEnsamblajesFallidos() {
        return ensamblajes;
    }

    public void setTecnicos(ArrayList<OrdenEnsamblaje> ensamblajes) {
        this.ensamblajes = ensamblajes;
    }

    @Override
    public String toString() {
        return "Numero fallidas=" + ensamblajes;
    }

    public void setOrden(OrdenEnsamblaje u) {
        this.ensamblajes.add(u);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        String auxProyecto = "";
        for (OrdenEnsamblaje ensam : ensamblajes) {
            try {
                fw = new FileWriter(archivo, false);
                bw = new BufferedWriter(fw);
                auxProyecto += "Hubo un fallo el dia: " + new Date() + "\n";
                auxProyecto += "El tecnico " + ensam.getTecnico().getNombre() + " fallo en ensamblar.\n";
                auxProyecto += "Computadora con num. de serie: " + ensam.getComputadora().getNumSerie() +"\n";
                auxProyecto += "---------------------------------------";
                bw.write(auxProyecto);
                bw.flush();
            } catch (Exception e) {
            }
        }
        bw.close();
        fw.close();
    }
}
