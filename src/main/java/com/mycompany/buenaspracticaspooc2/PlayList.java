
package com.mycompany.buenaspracticaspooc2;

public class PlayList extends Biblioteca{
    //Public constructor with no parameters
    public PlayList() {
        //
    }

    //Create a method to add a Cancion Object to the PlayList
    public void addCancion(Cancion cancion) {
        this.getCanciones().add(cancion);
    }
}
