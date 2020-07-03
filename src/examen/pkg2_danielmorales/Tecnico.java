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
public class Tecnico {
    private String nombre;
    private int edad;
    private String genero;
    private int cantComputadoras;

    public Tecnico(String nombre, int edad, String genero, int cantComputadoras) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.cantComputadoras = cantComputadoras;
    }

    public Tecnico() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantComputadoras() {
        return cantComputadoras;
    }

    public void setCantComputadoras(int cantComputadoras) {
        this.cantComputadoras = cantComputadoras;
    }

    @Override
    public String toString() {
        return "Tecnicos{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", cantComputadoras=" + cantComputadoras + '}';
    }
    
    
}
