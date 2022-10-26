/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum7;

/**
 *
 * @author Praktikan
 */
public class Mahasiswa {
    private String nama, npm, jurusan;
    private double nilaiUas, nilaiUts, nilaiTugas, NA;
    
    public Mahasiswa(){
        this.nama = "John WIlken";
        this.npm = "2117051024";
        this.nilaiUas = 90;
        this.nilaiUts = 85;
        this.nilaiTugas = 95;
        this.NA = (this.nilaiTugas*0.3) + (this.nilaiUts*0.35) + (this.nilaiUas * 0.35);
        this.jurusan = "Ilmu Komputer";
    }
    
    public Mahasiswa(String nama, String npm, double nilaiUas, double nilaiUts, double nilaiTugas){
        this.nama = nama;
        this.npm = npm;
        this.nilaiUas = nilaiUas;
        this.nilaiUts = nilaiUts;
        this.nilaiTugas = nilaiTugas;
        this.NA = (this.nilaiTugas*0.3) + (this.nilaiUts*0.35) + (this.nilaiUas * 0.35);
        this.jurusan = "Ilmu Komputer";
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public int sumValue(int x, int y){
        return x+y;
    }
    
//    public void hitungNA(){
//        this.NA = (this.nilaiTugas*0.3) + (this.nilaiUts*0.35) + (this.nilaiUas * 0.35);
//    }
//    
//    public void hitungNA(double nilaiTugas, double nilaiUts, double nilaiUas){
//        this.NA = (nilaiTugas*0.3) + (nilaiUts*0.35) + (nilaiUas * 0.35);   
//    }
    
    public void setHitungNA(double NA){
        this.NA = NA;
    }
    
    public double getHitungNA(){
        return NA;
    }
    
    public void printData(){
        System.out.println("NPM\t\t : " + this.npm);
        System.out.println("Nama\t\t : " + this.nama);
        System.out.println("Jurusan\t\t : " + this.jurusan);
        System.out.println("Nilai Akhir\t : " + this.NA);
        System.out.println("\n");
    }
}
