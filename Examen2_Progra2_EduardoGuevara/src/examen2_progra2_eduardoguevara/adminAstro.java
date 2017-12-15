/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_progra2_eduardoguevara;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author edujg
 */
public class adminAstro {

    private ArrayList<Astronautas> listaa = new ArrayList();
    private File archivo = new File("./astro.def");

    public adminAstro(String path) {
        archivo = new File("./astro.def");
    }

    public adminAstro() {
    }

    public ArrayList<Astronautas> getListaa() {
        return listaa;
    }

    public void setListaa(ArrayList<Astronautas> listaa) {
        this.listaa = listaa;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setAstro(Astronautas a) {
        listaa.add(a);
    }

    public void cargar() {
        try {
            listaa = new ArrayList();
            Astronautas temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Astronautas) objeto.readObject()) != null) {
                        listaa.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribir() throws IOException {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Astronautas t : listaa) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
}
