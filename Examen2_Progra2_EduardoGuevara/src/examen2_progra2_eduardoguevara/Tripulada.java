/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_progra2_eduardoguevara;

import java.util.ArrayList;

/**
 *
 * @author edujg
 */
public class Tripulada extends Naves {

    private String lugar;
    private ArrayList<Astronautas> crew = new ArrayList();

    public Tripulada(String lugar) {
        this.lugar = lugar;
    }

    public Tripulada(String lugar, int numeros, Planetas destino, int velocidad) {
        super(numeros, destino, velocidad);
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public ArrayList<Astronautas> getCrew() {
        return crew;
    }

    public void setCrew(ArrayList<Astronautas> crew) {
        this.crew = crew;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double[] tiempo() {
        double[] t = new double[2];
        int pesos = 0;
        for (Astronautas d : this.getCrew()) {
            pesos += d.getPeso();
        }
        t[0] = super.getDestino().getDist() / (super.getVelocidad() * (Math.pow(pesos, 2) / 100));
        t[1] = super.getDestino().getDist() / (super.getVelocidad() * (pesos / 100));
        return t;
    }

}
