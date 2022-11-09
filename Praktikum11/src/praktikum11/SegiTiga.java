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
public class SegiTiga extends BangunDatar {
    private double alas, tinggi;

    public SegiTiga(double alas, double tinggi, String warna) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.warna = warna;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public String getWarna() {
        return warna;
    }

    @Override
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    @Override
    public double Keliling(){
        return this.alas*3;
    }
    
    @Override
    public double Luas(){
        return this.alas*this.tinggi/2;
    }
    
    @Override
    public void print(){
        System.out.println("Segi Tiga");
        System.out.println("Warna: " + getWarna());
        System.out.println("Alas: " + getAlas());
        System.out.println("Tinggi: " + getTinggi());
        System.out.println("Luas: " + Luas());
        System.out.println("Keliling: " + Keliling());
        System.out.println();
    }
}
