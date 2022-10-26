/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Praktikan
 */
public class Tabung {
    private static final double phi = 3.14159265359;

    
    public static double Volume(double r, double t){
        return phi*r*r*t;
    }
    
    public static double luasPermukaan(double r, double t){
        return 2*phi*r*(r+t);
    }
}
