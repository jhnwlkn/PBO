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
public class SegiEmpat extends BangunDatar{
    private double sisi;

    public SegiEmpat(String warna, double sisi) {
        super(warna);
        this.sisi = sisi;
    }

    public SegiEmpat() {
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double Luas(){
        return this.sisi*this.sisi;
    }
    
    @Override
    public double Keliling(){
        return 4*this.sisi;
    }
}
