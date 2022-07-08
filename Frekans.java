

package com.mycompany.frekans;

/**
 *
 * @author fatihaydemir
 */
public class Frekans {

    public static void main(String[] args) {
String str = "Karakterlerin frekansini hesapliyorum";  
        int[] frek = new int[str.length()];  
        System.out.println("Girilen string: "+str);
        
        //Verilen string'i karakter dizisine çevirmek
        char str1[] = str.toCharArray();            
        for(int i = 0; i <str.length(); i++) 
        {  
            frek[i] = 1;  
            for(int j = i+1; j <str.length(); j++) 
            {  
                if(str1[i] == str1[j])
                {  
                    frek[i]++;  
                      
                    
                    //Karakterlerin print olmasini önlemek için str1[j]=0 ayarlanir
                    str1[j] = '0';  
                }  
            }  
        }            
          
        //Karakterlerin kullanim frekanslarini goruntuleme
        System.out.println("Karakterlerin frekanslari asagidaki gibidir "); 
        System.out.println("Karakter frekansi");  
        for(int i = 0; i <frek.length; i++) 
        {  
            if(str1[i] != ' ' && str1[i] != '0')  
                System.out.println(str1[i] + "              " + frek[i]);  
        }  
    }
}
