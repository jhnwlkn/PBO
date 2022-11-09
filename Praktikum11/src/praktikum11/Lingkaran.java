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
public class Lingkaran extends BangunDatar{
    private double jari;

    public Lingkaran(double jari, String warna) {
        this.jari = jari;
        this.warna = warna;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
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
        return Math.PI*jari*2;
    }
    
    @Override
    public double Luas(){
        return Math.PI * jari * jari;
    }
    
    @Override
    public void print(){
        System.out.println("Lingkaran");
        System.out.println("Warna: " + getWarna());
        System.out.println("Jari-jari: " + getJari());
        System.out.println("Luas: " + Luas());
        System.out.println("Keliling: " + Keliling());
        System.out.println();
    }
}
