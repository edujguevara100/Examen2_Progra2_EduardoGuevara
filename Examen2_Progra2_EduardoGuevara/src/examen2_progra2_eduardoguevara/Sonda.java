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
public class Sonda extends Naves {

    private String material;
    private int peso;

    public Sonda(String material, int peso, int numeros, Planetas destino, int velocidad) {
        super(numeros, destino, velocidad);
        this.material = material;
        this.peso = peso;
    }

    public Sonda(String material, int peso) {
        this.material = material;
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double[] tiempo() {
        double[] t = new double[2];
        t[0] = super.getDestino().getDist() / super.getVelocidad();
        t[1] = 9.8 * super.getVelocidad();
        return t;
    }

}
