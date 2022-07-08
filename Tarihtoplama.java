

package com.mycompany.tarihtoplama;


import java.util.Calendar;


/**
 *
 * @author fatihaydemir
 */
public class Tarihtoplama {

    public static void main(String[] args) {
        
        Calendar T1 = Calendar.getInstance();
        Calendar T2 = Calendar.getInstance();
        Calendar Ttoplam = (Calendar) T1.clone();

        Ttoplam.add(Calendar.YEAR, T2.get(Calendar.YEAR));
        Ttoplam.add(Calendar.MONTH, T2.get(Calendar.MONTH) + 1); 
        Ttoplam.add(Calendar.DATE, T2.get(Calendar.DATE));
        Ttoplam.add(Calendar.HOUR_OF_DAY, T2.get(Calendar.HOUR_OF_DAY));
        Ttoplam.add(Calendar.MINUTE, T2.get(Calendar.MINUTE));
        Ttoplam.add(Calendar.SECOND, T2.get(Calendar.SECOND));
        Ttoplam.add(Calendar.MILLISECOND, T2.get(Calendar.MILLISECOND));

        System.out.format("%s + %s = %s", T1.getTime(), T2.getTime(), Ttoplam.getTime());
        

    
    }
}
