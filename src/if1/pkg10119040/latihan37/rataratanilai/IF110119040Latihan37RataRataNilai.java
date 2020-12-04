/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan37.rataratanilai;
import java.util.Scanner;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  : 10119040
 * Kelas: IF1
 * program menampilkan nilai rata-rata dengan konsep 
 * pendekatan berbasis objek
 */
public class IF110119040Latihan37RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa mahasiswa = new Mahasiswa();
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        mahasiswa.setMahasiswa(scanner.nextInt());
        
        for(int i = 1; i<= mahasiswa.getMahasiswa(); i++) {
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            mahasiswa.setNilai(scanner.nextDouble());
        }
        System.out.println();
        System.out.println("Maka, Rata-rata Nilainya adalah " +
                mahasiswa.rataRata());
        System.out.println("Developed by : Agus Deri Dermawan");
    }
    
}
