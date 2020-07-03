/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_danielmorales;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author danie
 */
public class Computadora implements Serializable{
    private int numSerie;
    private String año;
    private String color;
    private String material;
    private RAM ram;
    private DiscoDuro discoDuro;
    private Bateria bateria;
    private Teclado teclado;
    private Pantalla pantalla;
    private Procesador procesador;

    public Computadora(int numSerie, String año, String color, String material, RAM ram, DiscoDuro discoDuro, Bateria bateria, Teclado teclado, Pantalla pantalla, Procesador procesador) {
        this.numSerie = numSerie;
        this.año = año;
        this.color = color;
        this.material = material;
        this.ram = ram;
        this.discoDuro = discoDuro;
        this.bateria = bateria;
        this.teclado = teclado;
        this.pantalla = pantalla;
        this.procesador = procesador;
    }

    public Computadora() {
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public DiscoDuro getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(DiscoDuro discoDuro) {
        this.discoDuro = discoDuro;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Computadora{" + "numSerie=" + numSerie + ", a\u00f1o=" + año + ", color=" + color + ", material=" + material + ", ram=" + ram + ", discoDuro=" + discoDuro + ", bateria=" + bateria + ", teclado=" + teclado + ", pantalla=" + pantalla + ", procesador=" + procesador + '}';
    }
    
    
}
