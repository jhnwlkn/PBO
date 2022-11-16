/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum12;

import java.util.ArrayList;

/**
 *
 * @author Praktikan
 */
public class Praktikum12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> nilai = new ArrayList<Integer>();
//        nilai.add(70);
//        nilai.add(75);
//        nilai.add(70);
        
        System.out.println(nilai);
        
        Mahasiswa mhs1 = new Mahasiswa("Joizy", "2117051024", nilai);
        System.out.println("Nilai rata-rata: " + mhs1.nilaiRataRata());
    }
    
}
