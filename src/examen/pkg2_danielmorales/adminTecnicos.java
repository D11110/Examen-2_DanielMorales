package examen.pkg2_danielmorales;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class adminTecnicos {
    
    private ArrayList<Tecnico> listaTecnicos = new ArrayList();
    private File archivo = null;
    
    public adminTecnicos() {
    }
    
    public adminTecnicos(String path) {
        archivo = new File(path);
    }
    
    public File getArchivo() {
        return archivo;
    }
    
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public ArrayList<Tecnico> getListaTecnicos() {
        return listaTecnicos;
    }
    
    public void setTecnicos(ArrayList<Tecnico> tecnicos) {
        this.listaTecnicos = tecnicos;
    }
    
    @Override
    public String toString() {
        return "tecnicos=" + listaTecnicos;
    }

    //extra mutador
    public void setTecnico(Tecnico u) {
        this.listaTecnicos.add(u);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        String auxProyecto = "";
        for (Tecnico lp : listaTecnicos) {
            try {
                fw = new FileWriter(archivo, false);
                bw = new BufferedWriter(fw);
                auxProyecto += lp.getNombre() + ";" + lp.getGenero() + ";" + lp.getEdad() + ";" + lp.getCantComputadoras()+ "\n";
                bw.write(auxProyecto);
                bw.flush();
            } catch (Exception e) {
            }
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() {
        try {
            FileReader fr = null;
            BufferedReader br = null;
            listaTecnicos = new ArrayList();
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            if (archivo.exists()) {
                String linea = "";
                try {
                    while ((linea = br.readLine()) != null) {
                        try {
                            String datos[] = linea.split(";");
                            Tecnico p = new Tecnico(datos[0], Integer.parseInt(datos[2]), datos[1]);
                            p.setCantComputadoras(Integer.parseInt(datos[3]));
                            listaTecnicos.add(p);
                        } catch (Exception ex) {
                        }
                    }
                } catch (IOException ex) {
                    Logger.getLogger(adminTecnicos.class.getName()).log(Level.SEVERE, null, ex);
                }
            } //FIN IF

        } catch (FileNotFoundException ex) {
            Logger.getLogger(adminTecnicos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
