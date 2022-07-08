

package com.mycompany.listedizi;

/**
 *
 * @author fatihaydemir
 */
import java.util.ArrayList;

import java.util.List;

import java.util.*;

public class Listedizi {

    public static void main(String[] args) {
        
        
        //Boş linkedlist string tipinde oluştur
        List<String> list = new LinkedList<String>();
 
       
        //Liste elemanlarını linkedlist içine ekle
        // add() ekleme methodu kullan
        list.add("listeden");
        list.add("diziye");
        list.add("diziden");
        list.add("listeye");
        list.add("ceviriyorum");
       
        // listenin boyutunu sakla
        int n = list.size();
 
       
        //Listeyi scope resolution (dürbün ayıklama-çözümleme) yöntemi ile diziye çevir
        // stream methodunu kullanarak diziye string olarak aktar
        
        String[] arr
            = list.stream().toArray(String[] ::new);
 
        // Diziyi yazdır
        // For döngüsünde dizi elemanlarını genişleterek yazdır
        for (String x : arr){
            System.out.print(x + " ");
        }
      
    
      //Çevirdiğim diziden tekrar listeye dönüyorum
      List<String> list2 = new ArrayList<String>();
      for(String x : arr) {
         list2.add(x);
         
      }
    System.out.println("\n"+list2+" ");
   
            
        }
       
          

        
}
    
 