/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_progra2_eduardoguevara;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author edujg
 */
public class Expedicion extends Thread {

    private Planetas pla;
    private Naves nav;
    boolean vive = true;

    public Expedicion(Planetas pla, Naves nav) {
        this.pla = pla;
        this.nav = nav;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public Planetas getPla() {
        return pla;
    }

    public void setPla(Planetas pla) {
        this.pla = pla;
    }

    public Naves getNav() {
        return nav;
    }

    public void setNav(Naves nav) {
        this.nav = nav;
    }

    @Override
    public String toString() {
        return "Expedicion{" + "pla=" + pla + ", nav=" + nav + '}';
    }

    @Override

    public void run() {
        double[] x = nav.tiempo();
        while (vive) {
            try {
                Thread.sleep((long) (x[0] * 1000));
                JOptionPane.showMessageDialog(null, "LLego al Planeta");
                Thread.sleep(1000);
                JOptionPane.showMessageDialog(null, "Inicia el regreso");
                Thread.sleep((Math.round(x[1]) * 1000));
                JOptionPane.showMessageDialog(null, "LLego a la Tierra");
                vive = false;
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
