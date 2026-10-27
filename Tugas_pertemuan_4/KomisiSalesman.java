/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */

import java.util.Scanner;

public class KomisiSalesman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== 5. Perhitungan Komisi Salesman ===");
        System.out.print("Masukan Total Penjualan Hari Ini : Rp  ");
        double penjualan = scanner.nextDouble();
        
        double uangJasa = 0, persentaseKomisi = 0;
        
        if(penjualan <= 2000000){
            uangJasa = 100000;
            persentaseKomisi = -.10;
        } else if (penjualan <= 5000000) {
            uangJasa = 200000;
            persentaseKomisi = 0.15;
        }else{
            uangJasa = 300000;
            persentaseKomisi = 0.20;
        }
        
        double Komisi = persentaseKomisi * penjualan;
        double TotalPendapatan = uangJasa + Komisi;
        
        System.out.println("\n--- Rincian Pendapatan Salesman ---");
        System.out.println("Total Penjualan     : Rp " + penjualan);
        System.out.println("Uang Jasa           : Rp " + uangJasa);
        System.out.println("Komisi (" + (int)(persentaseKomisi * 100) + "% )      : Rp " + Komisi);
        System.out.println("Total Pendapatan    : Rp " + TotalPendapatan);
        
        scanner.close();
    }
}
