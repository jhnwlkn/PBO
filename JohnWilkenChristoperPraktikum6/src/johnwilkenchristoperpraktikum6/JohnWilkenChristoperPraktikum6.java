package johnwilkenchristoperpraktikum6;

import johnwilkenchristoperpraktikum6.Mahasiswa;

public class JohnWilkenChristoperPraktikum6 {
    
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        
        mhs1.nama = "John Wilken";
        mhs1.npm = "2117051024";
        
//        System.out.println("Nama\t\t : " + mhs1.nama);
//        System.out.println("Nama\t\t : " + mhs1.npm);
        
        mhs1.insertNilaiUas(90);
        mhs1.insertNilaiUts(100);
        
        mhs1.dataMhs();
        
        System.out.println("Nilai akhir\t : " + mhs1.nilaiAkhir());
        
//        System.out.println("Nilai Uas\t : " + mhs1.nilaiUas);
//        System.out.println("Nilai Uas\t : " + mhs1.nilaiUas);
    }
    
}
