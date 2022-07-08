

package com.mycompany.computeseslisessiz;

/**
 *
 * @author fatihaydemir
 */
public class Computeseslisessiz {

    public static void main(String[] args) {
        String str = "BeginnersBook";
        int vcount = 0, ccount = 0;

        
        //Bütün karakterleri küçük harfe dönüştürme (büyük küçük karışmaması için)
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) { char ch = str.charAt(i); if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { vcount++; } else if((ch >= 'a'&& ch <= 'z')) {
                ccount++;
            }
        }
        System.out.println("Sesli harf sayisi: " + vcount);
        System.out.println("Sessiz harf sayisi: " + ccount);
    }
}
