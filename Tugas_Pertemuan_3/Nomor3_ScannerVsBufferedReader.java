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
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Nomor3_ScannerVsBufferedReader {
    public static void main(String[] args) throws IOException {
        // Contoh Penggunaan Scanner
        System.out.println("=== Menggunakan Scanner ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Angka Pertama: ");
        int angka1 = scanner.nextInt(); // Otomatis mengonversi ke integer

        // Contoh Penggunaan BufferedReader
        System.out.println("\n=== Menggunakan BufferedReader ===");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Angka Kedua: ");
        String inputStr = reader.readLine(); // Harus dibaca sebagai String dahulu
        int angka2 = Integer.parseInt(inputStr); // Konversi manual ke integer

        int total = angka1 + angka2;
        System.out.println("\nHasil Penjumlahan: " + total);
    }
}