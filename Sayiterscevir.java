

package com.mycompany.sayiterscevir;
import java.util.Scanner;
public class Sayiterscevir {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        
        System.out.print("Girdiğiniz sayinin tersten yazılısı = ");
        while(sayi > 0) {
            
            System.out.print(sayi % 10);
            sayi /= 10;
            
            /*Gerceklesen islem 12345 sayısı örnek alınırsa:
            (12345%10)=5 --- (12345/10)=1234
            (1234%10)=4 --- (1234/10)=123
            (123%10)=3 --- (123/10)=12
            (12%10)=2 ---- (12/10)=1
            1
            54321 
            */
        }
    }
}
