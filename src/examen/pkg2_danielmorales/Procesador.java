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
public class Procesador extends Parte {
    private int numNucleos;
    private Double velocidad;

    public Procesador(int numNucleos, Double velocidad, int tiempo) {
        super(tiempo);
        this.numNucleos = numNucleos;
        this.velocidad = velocidad;
    }

    public Procesador() {
    }

    public int getNumNucleos() {
        return numNucleos;
    }

    public void setNumNucleos(int numNucleos) {
        this.numNucleos = numNucleos;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Procesador";
    }
    
    
}
