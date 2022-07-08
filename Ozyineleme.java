

package com.mycompany.ozyineleme;

/**
 *
 * @author fatihaydemir
 */

public class Ozyineleme {

  
public static String terscumle (String cumle) {

    cumle = cumle.trim();

    StringBuilder terscumleyapici = new StringBuilder();
    StringBuilder yardimcicumleyapici = new StringBuilder();

    for (int i = 0; i < cumle.length(); i++) {

        char currentChar = cumle.charAt(i);

        if (currentChar != ' ' && currentChar != '-') {
            yardimcicumleyapici.append(currentChar);
        } else {
            terscumleyapici.insert(0, currentChar + yardimcicumleyapici.toString());
            yardimcicumleyapici.setLength(0);
        }

    }

    return terscumleyapici.insert(0, yardimcicumleyapici.toString()).toString();

}
public static void main(String[] args) {

    printTest("Bir ornek");
    printTest("Bu bir ornek cumledir");
    printTest("Ornekler icerisinde bir ordek");
    printTest("Cumlelerle oynuyorum");

}

private static void printTest(String S) {

    System.out.printf("Ilk durum ve son durum %s: %s\n", S, terscumle(S));

}
        
}
