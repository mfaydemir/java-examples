

package com.mycompany.binarydecimal;

import java.util.Scanner;

public class Binarydecimal {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
      System.out.println("Bir binary sayi girisi yapiniz");
    long sayi = scan.nextLong();

    //methodu cagirma
    int decimal = binarydendecimal(sayi);

    System.out.println("Binary to Decimal");
    System.out.println(sayi + " = " + decimal);
  }

  public static int binarydendecimal(long sayi) {
    int decimalsayi = 0, i = 0;
    long kalan;
    
    while (sayi != 0) {                 // sayi 0'a eşit değilken
      kalan = sayi % 10;                // 10'a bolme isleminden kalan
      sayi /= 10;                       // sayi= sayi/10 
      decimalsayi += kalan * Math.pow(2, i);  //2^0+2^1+++++++2^i=decimal
      ++i;
    }
    
    return decimalsayi;
    }
}
