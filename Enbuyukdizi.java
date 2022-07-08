

package com.mycompany.enbuyukdizi;

import java.util.Scanner;
public class Enbuyukdizi {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int enbuyuk = 0;
 
        int [] dizi = new int[10];
        
        for(int i = 0; i < 10; i++)
        {
            System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
            dizi[i] = scan.nextInt();
            if(dizi[i] > enbuyuk) {
                enbuyuk = dizi[i];
            }
        }
        System.out.println("Dizinin en buyuk elemanı = " + enbuyuk);
    }
    }

