package examen.pkg2_danielmorales;

import java.io.Serializable;

public class Parte implements Serializable{
    private int tiempo;

    public Parte(int tiempo) {
        this.tiempo = tiempo;
    }

    public Parte() {
    }
    
    

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Parte{" + "tiempo=" + tiempo + '}';
    }
    
    
}
