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
public class SegiEmpat extends BangunDatar{
    private double sisi;

    public SegiEmpat(double sisi, String warna) {
        this.sisi = sisi;
        this.warna = warna;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
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
    public double Luas(){
        return getSisi()*getSisi();
    }
    
    @Override
    public double Keliling(){
        return getSisi()*4;
    }
    
    @Override
    public void print(){
        System.out.println("Segi Empat");
        System.out.println("Warna: " + getWarna());
        System.out.println("Sisi: " + getSisi());
        System.out.println("Luas: " + Luas());
        System.out.println("Keliling: " + Keliling());
        System.out.println();
    }   
}
