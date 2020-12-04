/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan37.rataratanilai;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  : 10119040
 * Kelas: IF1
 * program menampilkan nilai rata-rata dengan konsep 
 * pendekatan berbasis objek
 */
public class Mahasiswa {
    public double nilai = 0;
    public int mahasiswa;

    public void setNilai(double nilai) {
        this.nilai = this.nilai + nilai;
    }

    public int getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(int mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
    
    public double rataRata() {
        return nilai / mahasiswa;
    }
}
