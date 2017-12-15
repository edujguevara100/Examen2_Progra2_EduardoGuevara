/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_progra2_eduardoguevara;

import java.io.Serializable;

/**
 *
 * @author edujg
 */
public class Planetas implements Serializable {
    private static final long SerialVersionUID = 777L;
    private String nombre;
    private int temp;
    private boolean anillos;
    private String superficie;
    private int dist;

    public Planetas(String nombre, int temp, boolean anillos, String superficie, int dist) {
        this.nombre = nombre;
        this.temp = temp;
        this.anillos = anillos;
        this.superficie = superficie;
        this.dist = dist;
    }

    public Planetas() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public boolean isAnillos() {
        return anillos;
    }

    public void setAnillos(boolean anillos) {
        this.anillos = anillos;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public int getDist() {
        return dist;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
