/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_progra2_eduardoguevara;

/**
 *
 * @author edujg
 */
public abstract class Naves {

    private int numeros;
    private Planetas destino;
    private int velocidad;

    public Naves() {
    }

    public Naves(int numeros, Planetas destino, int velocidad) {
        this.numeros = numeros;
        this.destino = destino;
        this.velocidad = velocidad;
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public Planetas getDestino() {
        return destino;
    }

    public void setDestino(Planetas destino) {
        this.destino = destino;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return numeros+"";
    }

    public abstract double[] tiempo();
}
