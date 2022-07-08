
package com.mycompany.dizidegerarayici;

import java.util.Arrays;

/**
 *
 * @author fatihaydemir
 */
public class Dizidegerarayici {

    public static void main(String[] args) {
         String[] strings = {"Ocak","Sogan","Domates","Biber","Zeytinyagi","Tuz"};
    String ara= "Sogan";

    boolean bulucu = Arrays.stream(strings).anyMatch(t -> t.equals(ara));

    if(bulucu){
      System.out.println(ara + " bulunamadi. Menemen icin malzeme eksik.");}
    else{
      System.out.println(ara + " bulundu. Menemen yapabilirsin.");
    }
    }
}
