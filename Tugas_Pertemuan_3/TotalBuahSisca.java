/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menghitung_gaji_bersih;

/**
 *
 * @author hp
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TotalBuahSisca {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Data sesuai soal
            int manggaAwal = 70;
            int tetangga = 4;
            int jambuPerTetangga = 30;
            int manggaBusuk = 15;

            // Perhitungan
            int totalJambu = tetangga * jambuPerTetangga; // 4 * 30 = 120
            int manggaSisa = manggaAwal - manggaBusuk;    // 70 - 15 = 55
            int totalBuahDibelikan = manggaSisa + totalJambu;

            System.out.println("===== PERHITUNGAN BUAH IBU SISCA =====");
            System.out.println("Jumlah Mangga Dibereli      : " + manggaAwal + " pcs");
            System.out.println("Jumlah Mangga Busuk (Retur) : " + manggaBusuk + " pcs");
            System.out.println("Jumlah Mangga Layak         : " + manggaSisa + " pcs");
            System.out.println("Total Jambu Diberikan       : " + totalJambu + " pcs");
            System.out.println("---------------------------------------");
            System.out.println("Total Akhir Buah yang Dibeli : " + totalBuahDibelikan + " pcs");

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input.");
        }
    }
}