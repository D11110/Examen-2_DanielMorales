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
public class Bateria extends Parte {
    private int capacidad;
    private String material;

    public Bateria(int capacidad, String material, int tiempo) {
        super(tiempo);
        this.capacidad = capacidad;
        this.material = material;
    }

    public Bateria() {
    }
    
    

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Bateria";
    }
    
    
}
