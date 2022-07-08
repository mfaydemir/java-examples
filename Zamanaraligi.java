

package com.mycompany.zaman;

/**
 *
 * @author fatihaydemir
 */
public class Zaman {
    int saniye;
    int dakika;
    int saat;

    public Zaman (int saat, int dakika, int saniye) {
        this.saat = saat;
        this.dakika = dakika;
        this.saniye = saniye;
    }

    public static void main(String[] args) {
       // zaman sınıfında objeler olusturulur
        Zaman basla = new Zaman(8, 12, 15);
        Zaman dur = new Zaman(12, 34, 55);
        Zaman fark;

        // fark hesaplayan method
        fark = difference(basla, dur);

        System.out.printf("Gecen zaman farkı: %d:%d:%d - ", basla.saat, basla.dakika, basla.saniye);
        System.out.printf("%d:%d:%d ", dur.saat, dur.dakika, dur.saniye);
        System.out.printf("= %d:%d:%d\n", fark.saat, fark.dakika, fark.saniye);
    }

    public static Zaman difference(Zaman basla, Zaman dur)
    {
        Zaman fark = new Zaman(0, 0, 0);

        // Eğer baslama saniyesi dur saniyesinden büyükse basla
        // Durması gereken dakikayı saniyeye çevir 60sn
       
        if(basla.saniye > dur.saniye){
            --dur.dakika;
            dur.saniye += 60;
        }

        fark.saniye = dur.saniye - basla.saniye;

      
        if(basla.dakika > dur.dakika){
            --dur.saat;
            dur.dakika += 60;
        }

        fark.dakika = dur.dakika - basla.dakika;
        fark.saat = dur.saat - basla.saat;

        // fark'a geri dön, gecen zaman farkı:---
        return(fark);
    }
}
