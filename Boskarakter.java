/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.boskarakter;

/**
 *
 * @author requ
 */
public class Boskarakter {

    public static void main(String[] args) {
        String str = "Bos luk lar i kaldi  riyo rum";  
        //1st way  
        String noSpaceStr = str.replaceAll("\\s", ""); // using built in method  
        System.out.println(noSpaceStr);  
        //2nd way  
        char[] strArray = str.toCharArray();  
        StringBuffer stringBuffer = new StringBuffer();  
        for (int i = 0; i < strArray.length; i++) {  
            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {  
                stringBuffer.append(strArray[i]);  
            }  
        }  
        String noSpaceStr2 = stringBuffer.toString();  
        System.out.println(noSpaceStr2);  
    }
}
