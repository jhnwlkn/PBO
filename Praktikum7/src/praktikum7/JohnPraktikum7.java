/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum7;

import java.util.Scanner;

/**;
 *
 * @author Praktikan
 */
public class JohnPraktikum7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama, npm;
        double nilaiUas, nilaiUts, nilaiTugas, NA;
        
        Scanner sc = new Scanner(System.in);
        
        Mahasiswa mhs1 = new Mahasiswa();
        
        nama = sc.nextLine();
        npm = sc.nextLine();
        nilaiTugas = sc.nextInt();
        nilaiUts = sc.nextInt();
        nilaiUas = sc.nextInt();
            
        Mahasiswa mhs2 = new Mahasiswa(nama, npm, nilaiUas, nilaiUts, nilaiTugas);
        
        System.out.println("\n");
        mhs1.printData();
        mhs2.printData();
    }
    
}
