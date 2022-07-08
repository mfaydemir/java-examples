/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.yuvarlayici;


// Java Program to Round a Number to n Decimal Places
// Via Multiply and Divide the number with 10^n
 


public class Yuvarlayici {

    public static void main(String[] args) {
        // Declaring and initializing double number
        double number = 12.983665;
 
        // Getting the number of decimal places required
        int n = 3;
 
        // Rounding off the number
        // using pow() and round() method of Math class
        number = Math.round(number * Math.pow(10, n))
                 / Math.pow(10, n);
 
        // Printing the rounded number
        System.out.println(number);
    }
}
