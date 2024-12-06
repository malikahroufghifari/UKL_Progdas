/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklsoal2;

/**
 *
 * @author LOQ
 */import java.util.Scanner;

public class UKLSoal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jumlahBulan;
        System.out.println("Berapa bulan kamu nabung? ");
        jumlahBulan = input.nextInt();

        int a = 100000; //a = bismillah semoga berkah
        int b = 20000; //b = gue lagi kaya nih, nabungnya nambah
        int c = 0; //c = nah jadi bulan ini gue nabung sejumlah...
        int totalTabungan = 0; //saldo segini semoga bisa buat naik haji

        for (int i = 1; i <= jumlahBulan; i++) {
            if (i == 1) {
                c = a;
            } else {
                c = a + (i - 1) * b;
            }
            totalTabungan += c;

            System.out.println("Nabung bulan ke-" + i + " = " + c);
        }

        System.out.println("Saldo tabungan kamu = " + totalTabungan);

    }

}
