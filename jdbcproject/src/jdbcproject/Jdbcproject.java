/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbcproject;

import db.DBHelper;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author John Wilken
 */
public class Jdbcproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        DBHelper.getConnection();

        Scanner sc = new Scanner(System.in);
        
        MahasiswaModel mhs = new MahasiswaModel();
        
        String npm = sc.nextLine();
        String nama = sc.nextLine();
        
        Mahasiswa mhs1 = new Mahasiswa(npm, nama);
        Mahasiswa mhs2 = new Mahasiswa("2117051024");
        Mahasiswa mhs3 = new Mahasiswa("2117051076", "2117051047", "Bagas Shaka");
        
        mhs.addMahasiswa(mhs1);
        mhs.deleteMahasiswa(mhs2);
        mhs.updateMahasiswa(mhs3);
        
        ArrayList<Mahasiswa> listMahasiswa = mhs.getMahasiswa();
        
        for(int i = 0; i < listMahasiswa.size(); i++){
            System.out.println("Nama : " +  listMahasiswa.get(i).getNama());
            System.out.println("NPM : " +  listMahasiswa.get(i).getNpm());
            System.out.println();
        }
    }
    
}
