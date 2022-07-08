
package com.mycompany.palindrome;

import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
     String ilkkelime, terskelime = ""; 
    Scanner in = new Scanner(System.in);
    System.out.println("Kelime girisi yapiniz");
    ilkkelime = in.nextLine(); 

    int length = ilkkelime.length();

    for (int i = length - 1; i >= 0; i--)
      terskelime = terskelime + ilkkelime.charAt(i);    //for döngüsünde -1,-2,-3,... i değeri azaltılarak kelime karakterleri tersten yazılır.

    if (ilkkelime.equals(terskelime)){                  // eğer ilk girilen sözcük, sözcüğün ters haline eşitse palindromedur.
      System.out.println("Palindrome.");
    }
      else{
      System.out.println("Palindrome degil.");          // eşit değilse, palindrome değildir.
        }
    }
}
