
package com.mycompany.buenaspracticaspooc2;

//Import arraylist
import java.util.ArrayList;

/**
 *
 * @author maicol
 */
public class Biblioteca {
    //Create a private arraylist of Cancion objects
    private ArrayList<Cancion> canciones = new ArrayList<Cancion>();

    //Getter and setter
    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    //Public constructor with no parameters
    public Biblioteca() {
        //
    }
}
