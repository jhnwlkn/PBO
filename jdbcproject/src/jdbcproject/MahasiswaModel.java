/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcproject;

import java.sql.Connection;
import db.DBHelper;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author John Wilken
 */
public class MahasiswaModel {
    private final Connection CONN;

    public MahasiswaModel() {
        this.CONN = DBHelper.getConnection();
    }
    
    public void addMahasiswa(Mahasiswa mhs){
        String insert = "INSERT INTO mhs VALUES ('" 
                + mhs.getNpm() + "', '" 
                + mhs.getNama() + "');";
        
        System.out.println(insert);
        
        try {
            CONN.createStatement().executeUpdate(insert);
            System.out.println("Succesfully adding data");
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Failed adding data");
        }
    }
    
    public ArrayList<Mahasiswa> getMahasiswa(){
        String query = "SELECT * FROM mhs";
        ArrayList<Mahasiswa> mhs = new ArrayList<Mahasiswa>();
        
        try {
            ResultSet rs = CONN.createStatement().executeQuery(query);
            while(rs.next()){
                Mahasiswa temp = new Mahasiswa(rs.getString("npm"), rs.getString("nama"));
                mhs.add(temp);
            }
            System.out.println("Succesfully taking data");
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Failed taking data");
        }
        
        return mhs;
    }
    
    public void deleteMahasiswa(Mahasiswa mhs){
        String delete = "DELETE FROM mhs WHERE npm = '" 
                + mhs.getOldNpm() + "';";
        
//        System.out.println(insert);
        
        try {
            CONN.createStatement().executeUpdate(delete);
            System.out.println("Succesfully delete data");
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Failed delete data");
        }
    }
    
    public void updateMahasiswa(Mahasiswa mhs){
        String update = "UPDATE mhs SET npm = '"
                + mhs.getNewNPM() + "', nama = '"
                + mhs.getNewName() + "' WHERE npm = '"
                + mhs.getNpm()+"';";
        
//        System.out.println(insert);
        
        try {
            CONN.createStatement().executeUpdate(update);
            System.out.println("Succesfully update data");
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Failed update data");
        }
    }
}
