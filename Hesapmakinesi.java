

package com.mycompany.hesapmakinesi;

import java.util.Scanner;
public class Hesapmakinesi {

    public static void main(String[] args) {
      
        Scanner scan=new Scanner(System.in);
        
             
        System.out.println("1. TOPLAMA");
        System.out.println("2. CIKARMA");
        System.out.println("3. CARPMA");
        System.out.println("4. BOLME");
        
        System.out.println("Yapmak istediginiz islemi seciniz");
        
        int secim = scan.nextInt();
        
        System.out.println("1. sayiyi giriniz");
        float sayi1 = scan.nextFloat();
        System.out.println("2. sayiyi giriniz");
        float sayi2 = scan.nextFloat();
        
        switch(secim){
            case 1 -> System.out.println("Toplama isleminin sonucu "+(sayi1+sayi2));
            case 2 -> System.out.println("Cikarma isleminin sonucu "+(sayi1-sayi2));
            case 3 -> System.out.println("Carpma isleminin sonucu "+(sayi1*sayi2));
            case 4 -> System.out.println("Bolme isleminin sonucu "+(sayi1/sayi2));
            default -> System.out.println("Yanlis secim yaptiniz. Seciminizi kontrol ediniz.");
        }
        
        
        
    }
}
