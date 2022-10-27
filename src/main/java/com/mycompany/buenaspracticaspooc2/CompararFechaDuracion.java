
package com.mycompany.buenaspracticaspooc2;

import java.util.Comparator;

/**
 *
 * @author maicol
 */
public class CompararFechaDuracion implements Comparator<Cancion>{

    @Override
    public int compare(Cancion o1, Cancion o2) {
        return o1.getDate().compareTo(o2.getDate());
    }
    
}
