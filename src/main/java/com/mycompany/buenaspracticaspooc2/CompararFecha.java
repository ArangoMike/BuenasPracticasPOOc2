
package com.mycompany.buenaspracticaspooc2;


import java.util.Comparator;

public class CompararFecha implements Comparator<Cancion>{

    // Método compare  usado para comparar el atributo date de la clase Cancion.
    @Override
    public int compare(Cancion o1, Cancion o2) {
        return o1.getDate().compareTo(o2.getDate());   
    }
    
}
