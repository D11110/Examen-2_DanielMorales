package examen.pkg2_danielmorales;

public class Parte {
    private String tiempo;

    public Parte(String tiempo) {
        this.tiempo = tiempo;
    }

    public Parte() {
    }
    
    

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Parte{" + "tiempo=" + tiempo + '}';
    }
    
    
}
