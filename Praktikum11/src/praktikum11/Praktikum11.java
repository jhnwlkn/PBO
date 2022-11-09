/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum11;

/**
 *
 * @author Praktikan
 */
public class Praktikum11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BangunDatar lkr = new Lingkaran(10, "Merah");
        BangunDatar st = new SegiTiga(13, 5, "Biru");
        BangunDatar se = new SegiEmpat(5, "Hitam");
        
        BangunDatar[] bd = new BangunDatar[3];
        bd[0] = lkr;
        bd[1] = st;
        bd[2] = se;
        
//        for(int i = 0; i < 3; i++){
//            System.out.println("Bangun Datar " + (i+1));
//            System.out.println("Warna: " + bd[i].getWarna());
//            System.out.println("Luas: " + bd[i].Luas());
//            System.out.println("Keliling: " + bd[i].Keliling());
//            System.out.println();
//        }
        
        for(int i = 0; i < 3; i++)bd[i].print();
    }
    
}
