/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum10;

/**
 *
 * @author Praktikan
 */
public class Praktikum10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunDatar bd = new BangunDatar("blackie");
        
        System.out.println("Warna bangun datar: " + bd.getWarna());
        System.out.println();
        
        BangunDatar lk = new Lingkaran("Green tea", 26.0);
        System.out.println("Luas Lingkaran: " + String.format("%.2f", lk.Luas()));
        System.out.println("Keliling Lingkaran: " +String.format("%.2f",  lk.Keliling()));
        System.out.println();
        
        BangunDatar st = new SegiTiga("Red Velvet", 15, 7);
        System.out.println("Luas Segi Tiga: " + String.format("%.2f", st.Luas()));
        System.out.println("Keliling Segi Tiga: " + String.format("%.2f", st.Keliling()));
        System.out.println();
        
        BangunDatar se = new SegiEmpat("Black n Yellow", 10);
        System.out.println("Luas Segi Empat: " + String.format("%.2f", se.Luas()));
        System.out.println("Keliling Segi Empat: " + String.format("%.2f", se.Keliling()));
    }
    
}
