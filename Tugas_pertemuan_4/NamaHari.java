/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class NamaHari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== 2. MENENTUKAN NAMA HARI ===");
        System.out.print("Masukkan kode hari (1-7): ");
        int kodeHari = scanner.nextInt();
        
        switch (kodeHari) {
            case 1: System.out.println("1 = Senin"); break;
            case 2: System.out.println("2 = Selasa"); break;
            case 3: System.out.println("3 = Rabu"); break;
            case 4: System.out.println("4 = Kamis"); break;
            case 5: System.out.println("5 = Jumat"); break;
            case 6: System.out.println("6 = Sabtu"); break;
            case 7: System.out.println("7 = Minggu"); break;
            default: System.out.println("Kode hari tidak valid! Masukkan angka 1 sampai 7.");
        }
        
        scanner.close();
    }
}
