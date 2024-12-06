/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklsoal3;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;

public class UKLSoal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        int[] hariHadir = new int[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan! Berapa hari siswa ke-" + (i + 1) + " hadir dalam sebulan?");
            hariHadir[i] = scanner.nextInt();
        }

        int totalHadir = 0;
        for (int i = 0; i < jumlahSiswa; i++) {
            totalHadir += hariHadir[i];
        }
        double rataRataHadir = (double) totalHadir / jumlahSiswa;

        System.out.println("Laporan Kehadiran Siswa:");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa " + (i + 1) + " hadir selama " + hariHadir[i] + " hari.");
        }

        System.out.println("Total hari hadir seluruh siswa: " + totalHadir);
        System.out.println("Rata-rata kehadiran siswa: " + rataRataHadir);

        System.out.println("Kesimpulan:");
        System.out.println("Siswa paling rajin:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (hariHadir[i] > rataRataHadir) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + hariHadir[i] + " hari)");
            }
        }

        System.out.println("Siswa malas-malasan:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (hariHadir[i] < rataRataHadir) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + hariHadir[i] + " hari)");
            }
        }

    }

}
