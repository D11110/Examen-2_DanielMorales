/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_danielmorales;

import java.awt.Color;

/**
 *
 * @author danie
 */
public class Teclado extends Parte{
    private String material;
    private Color color;

    public Teclado(String material, Color color, String tiempo) {
        super(tiempo);
        this.material = material;
        this.color = color;
    }

    public Teclado() {
    }
    
    

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Teclado{" + "material=" + material + ", color=" + color + '}';
    }
    
    
    
}
