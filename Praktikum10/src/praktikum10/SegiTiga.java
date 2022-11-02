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
public class SegiTiga extends BangunDatar{
    private double alas, tinggi;

    public SegiTiga(String warna, double alas, double tinggi) {
        super(warna);
        this.alas = alas;
        this.tinggi = tinggi;
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

    public SegiTiga() {
    }
    
    @Override
    public double Luas(){
        return this.alas*this.tinggi/2;
    }
    
    @Override
    public double Keliling(){
        return 3*this.alas;
    }
}
