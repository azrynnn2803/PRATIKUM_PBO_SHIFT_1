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

public class SelisihWaktu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== WAKTU PERTAMA ===");
        System.out.print("Jam   : ");
        int j1 = scanner.nextInt();
        System.out.print("Menit : ");
        int m1 = scanner.nextInt();
        System.out.print("Detik : ");
        int d1 = scanner.nextInt();

        System.out.println("\n=== WAKTU KEDUA ===");
        System.out.print("Jam   : ");
        int j2 = scanner.nextInt();
        System.out.print("Menit : ");
        int m2 = scanner.nextInt();
        System.out.print("Detik : ");
        int d2 = scanner.nextInt();

        // Konversi ke total detik
        int totalDetik1 = (j1 * 3600) + (m1 * 60) + d1;
        int totalDetik2 = (j2 * 3600) + (m2 * 60) + d2;

        int selisihDetik = Math.abs(totalDetik2 - totalDetik1);

        // Konversi kembali ke Jam, Menit, Detik
        int jamRes = selisihDetik / 3600;
        int sisaDetik = selisihDetik % 3600;
        int menitRes = sisaDetik / 60;
        int detikRes = sisaDetik % 60;

        System.out.println("\n===== SELISIH WAKTU =====");
        System.out.println(jamRes + " Jam, " + menitRes + " Menit, " + detikRes + " Detik");

        scanner.close();
    }
}