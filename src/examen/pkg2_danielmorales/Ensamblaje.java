/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_danielmorales;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danie
 */
public class Ensamblaje extends Thread {

    private OrdenEnsamblaje orden;
    private ArrayList<Parte> listaLocalPartes = new ArrayList();
    private JTable tablaInstalacion;
    private boolean vive;
    private JProgressBar barraProgreso;
    Random r = new Random();

    public Ensamblaje() {
    }

    public Ensamblaje(OrdenEnsamblaje o, JTable tablaInstalacion, JProgressBar barraProgreso) {
        this.orden = o;
        this.tablaInstalacion = tablaInstalacion;
        this.barraProgreso = barraProgreso;
        vive = true;
        for (Parte p : o.getComputadora().getPartes()) {
            this.listaLocalPartes.add(p);
        }
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean flag) {
        this.vive = flag;
    }

    adminReporteFallos reportes = new adminReporteFallos("./reporteFallos.txt");

    public void run() {
        while (vive) {
            int aux = 0;
            int cont = 0;
            DefaultTableModel modelo = (DefaultTableModel) this.tablaInstalacion.getModel();
            for (int i = 0; i < listaLocalPartes.size(); i++) {
                barraProgreso.setValue(0);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Ensamblaje.class.getName()).log(Level.SEVERE, null, ex);
                }
                barraProgreso.setMaximum(listaLocalPartes.get(i).getTiempo());
                for (int j = 0; j < listaLocalPartes.get(i).getTiempo(); j++) {
                    barraProgreso.setValue(barraProgreso.getValue() + 1);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
                Object[] row = {listaLocalPartes.get(i).toString(), listaLocalPartes.get(i).getTiempo()};
                modelo.addRow(row);

                int canti = orden.getTecnico().getCantComputadoras();
                int fallo = 1 + r.nextInt(100);
                if (canti < 0 || canti >= 5) {
                    if (fallo < 30) {
                        cont++;
                    }
                } else if (canti < 6 || canti >= 15) {;
                    if (fallo < 22) {
                        cont++;
                    }
                } else if (canti < 16 || canti >= 30) {
                    if (fallo < 13) {;
                        cont++;
                    }
                } else if (canti < 30) {
                    if (fallo < 7) {
                        cont++;
                    }
                }

                aux++;
                if (aux == 6) {
                    vive = false;
                    JOptionPane.showMessageDialog(null, "El ensamblaje ha finalizado");
                    
                    if (cont != 0) {
                        JOptionPane.showMessageDialog(null, "Ocurrio un fallo en el ensamblaje");
                        try {
                            reportes.getEnsamblajesFallidos().add(orden);
                            reportes.escribirArchivo();
                        } catch (IOException ex) {
                            Logger.getLogger(Ensamblaje.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                this.tablaInstalacion.setModel(modelo);
            }
        }
    }
}
