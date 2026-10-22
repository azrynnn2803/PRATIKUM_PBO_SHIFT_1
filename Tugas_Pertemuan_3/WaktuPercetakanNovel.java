/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menghitung_gaji_bersih;

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class WaktuPercetakanNovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Novel yang Dicetak : ");
        int jumlahNovel = input.nextInt();

        System.out.print("Masukkan Tebal Lembar per Novel      : ");
        int tebalLembar = input.nextInt();

        // Kecepatan = 1 lembar / detik
        long totalLembar = (long) jumlahNovel * tebalLembar;
        long totalDetik = totalLembar; // Karena 1 lembar membutuhkan 1 detik

        // Konversi
        long hari = totalDetik / 86400;
        long sisaHari = totalDetik % 86400;

        long jam = sisaHari / 3600;
        long sisaJam = sisaHari % 3600;

        long menit = sisaJam / 60;
        long detik = sisaJam % 60;

        System.out.println("\n===== ESTIMASI WAKTU PERCETAKAN =====");
        System.out.println("Total Lembar : " + totalLembar + " lembar");
        System.out.println("Waktu        : " + hari + " Hari, " + jam + " Jam, " + menit + " Menit, " + detik + " Detik");

        input.close();
    }
}