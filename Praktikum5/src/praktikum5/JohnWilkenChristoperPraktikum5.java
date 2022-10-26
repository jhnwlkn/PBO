/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class JohnWilkenChristoperPraktikum5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "wilz";
        String longName = firstName + " " + lastName;
        String upperName = longName.toUpperCase();
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
    
        System.out.println(longName);
        System.out.println("Length of the string : " + longName.length());
        System.out.println(upperName);
        System.out.println(a + b);
    }
    
}
