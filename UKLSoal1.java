/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uklsoal1;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;

public class UKLSoal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;
        System.out.println("Masukkan angkanya! "); //tes tes
        angka = input.nextInt();

        if (bilanganPrima(angka)) {
            System.out.println(angka + " adalah bilangan prima"); //iya iya ini prima
        } else {
            System.out.println(angka + " bukan bilangan prima"); //bukan prima, siapa tau namanya citra atau dea
        }
    }

    public static boolean bilanganPrima(int angka) {
        if (angka <= 1) {
            return false; //kalo angkanya kurang dari sama dengan satu, bukan prima yaaa
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) { 
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
}
