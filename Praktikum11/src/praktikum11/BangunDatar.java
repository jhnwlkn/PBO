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
public abstract class BangunDatar implements ViewData{
    protected String warna;

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public abstract double Luas();
    
    public abstract double Keliling();
    
}
