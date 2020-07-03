/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_danielmorales;

/**
 *
 * @author danie
 */
public class DiscoDuro extends Parte  {

    private String tamaño;
    private String marca;

    public DiscoDuro(String tamaño, String marca, int tiempo) {
        super(tiempo);
        this.tamaño = tamaño;
        this.marca = marca;
    }

    public DiscoDuro() {
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DiscoDuro{" + "tama\u00f1o=" + tamaño + ", marca=" + marca + '}';
    }
    
    
}
