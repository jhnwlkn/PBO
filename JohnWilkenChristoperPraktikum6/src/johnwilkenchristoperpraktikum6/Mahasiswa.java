/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnwilkenchristoperpraktikum6;

/**
 *
 * @author Praktikan
 */
public class Mahasiswa {
    public String nama, npm;
    private double nilaiUas, nilaiUts;
    
    public void insertNilaiUas(double nilai){
        nilaiUas = nilai;
    }
    
    public void insertNilaiUts(double nilai){
        nilaiUts = nilai;
    }
    
    public void dataMhs(){
        System.out.println("Nama\t\t : " + nama);
        System.out.println("NPM\t\t : " + npm);
        System.out.println("Nilai UAS\t : " + nilaiUas);
        System.out.println("Nilai UTS\t : " + nilaiUts);
    }
    
    public double nilaiAkhir(){
        return (nilaiUts+nilaiUas)/2;
    }
}
