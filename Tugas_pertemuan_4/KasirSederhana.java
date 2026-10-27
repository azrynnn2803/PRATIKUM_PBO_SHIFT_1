/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class KasirSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== 6. PROGRAM KASIR SEDERHANA ===");
        System.out.print("Apakah memiliki kartu member? (y/n): ");
        char punyaMember = scanner.next().charAt(0);
        System.out.print("Masukkan total belanja: Rp ");
        double totalBelanja = scanner.nextDouble();
        System.out.print("Masukkan uang yang diberikan: Rp ");
        double uangDiberikan = scanner.nextDouble();
        
        double diskon = 0;
        if (punyaMember == 'y' || punyaMember == 'Y') {
            if (totalBelanja > 500000) {
                diskon = 50000;
            } else if (totalBelanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (totalBelanja > 100000) {
                diskon = 10000;
            }
        }
        
        double totalBayar = totalBelanja - diskon;
        double kembalian = uangDiberikan - totalBayar;
        
        System.out.println("\n----------------------------------------");
        System.out.println("            STRUK PEMBELANJAAN            ");
        System.out.println("----------------------------------------");
        System.out.println("Total Belanja           : Rp " + totalBelanja);
        System.out.println("Diskon                  : Rp " + diskon);
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);
        System.out.println("Uang Diberikan          : Rp " + uangDiberikan);
        System.out.println("Kembalian               : Rp " + kembalian);
        System.out.println("----------------------------------------");
        
        scanner.close();
    }
}