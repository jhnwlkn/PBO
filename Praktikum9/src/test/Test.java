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

public class Test {
    public String atributBukanStatic = "Atribut Bukan Static";
    static String atributStatic = "Atribut Static"; 
    
    public void bukanStatic(){
        System.out.println("Bukan Static");
    }
    static void methodStatic(){
        System.out.println("Method Static");
    }
    
    public static class Tabung {
        private static final double phi = 3.14159265359;


        public static double Volume(double r, double t){
            return phi*r*r*t;
        }

        public static double luasPermukaan(double r, double t){
            return 2*phi*r*(r+t);
        }
    }
    
    public static void main(String[] args) {
        Test ho = new Test();
        
        System.out.println(ho.atributBukanStatic);
        System.out.println(atributStatic);
        
        
        ho.bukanStatic();
        methodStatic();
        
        double r = 13;
        double t = 30;
        
        double vol = Tabung.Volume(r, t);
        double lp = Tabung.luasPermukaan(r, t);
        
        System.out.println(vol);
        System.out.println(lp);
    }
    
}
