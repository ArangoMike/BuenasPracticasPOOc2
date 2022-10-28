
package com.mycompany.buenaspracticaspooc2;

import com.mycompany.buenaspracticaspooc2.Cancion;
import java.util.Comparator;

/**
 *
 * @author maicol
 */
public class CompararFecha implements Comparator<Cancion>{

    @Override
    public int compare(Cancion o1, Cancion o2) {
        return o1.getDate().compareTo(o2.getDate());   
    }
    
}
