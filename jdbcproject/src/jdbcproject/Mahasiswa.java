/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcproject;

/**
 *
 * @author John Wilken
 */
public class Mahasiswa {
    private String npm, nama, oldNpm, newNPM, newName;

    public Mahasiswa(String npm, String nama) {
        this.npm = npm;
        this.nama = nama;
    }

    public Mahasiswa(String oldNpm) {
        this.oldNpm = oldNpm;
    }

    public Mahasiswa(String npm, String newNPM, String newName) {
        this.npm = npm;
        this.nama = nama;
        this.newNPM = newNPM;
        this.newName = newName;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public String getOldNpm() {
        return oldNpm;
    }

    public String getNewNPM() {
        return newNPM;
    }

    public void setNewNPM(String newNPM) {
        this.newNPM = newNPM;
    }

    public void setOldNpm(String oldNpm) {
        this.oldNpm = oldNpm;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
