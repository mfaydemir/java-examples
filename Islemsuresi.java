

package com.mycompany.islemsuresi;

/**
 *
 * @author fatihaydemir
 */


/* 
Soru 4---
Yöntemin işlem süresini belirleyen Java Programını yazın
*/
public class Islemsuresi {

    
       
  public void display() {
    System.out.println("Method'un islem suresi hesaplaniyor:");
  }

  
  public static void main(String[] args) {

    // islem suresi için obje yaratıldı
    Islemsuresi obj = new Islemsuresi();

    // baslangic zamanini tespit etme
    long basla = System.nanoTime();

    // islem suresi methodunu cagir
    obj.display();

    // bitis zamani tespiti
    long bitir = System.nanoTime();

    // islem suresi
    long gecensure = bitir - basla;
    gecensure /= 1000;
    System.out.println("Islem suresi: " + gecensure + " mikrosaniye");
    }
}
