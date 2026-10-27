/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class LuasBangundatar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== 7. PROGRAM PERHITUNGAN LUAS BANGUN DATAR ===");
        System.out.println("Pilih Bangun Datar:");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");
        System.out.print("Masukkan pilihan (1-5): ");
        int pilihan = scanner.nextInt();
        
        double luas = 0;
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang sisi: ");
                double sisi = scanner.nextDouble();
                luas = sisi * sisi;
                System.out.println("Luas Persegi = " + luas);
                break;
                
            case 2:
                System.out.print("Masukkan alas: "); double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi: "); double tinggi = scanner.nextDouble();
                luas = 0.5 * alas * tinggi;
                System.out.println("Luas Segitiga = " + luas);
                break;
                
            case 3:
                System.out.print("Masukkan jari-jari (r): ");
                double r = scanner.nextDouble();
                luas = 3.14 * r * r;
                System.out.println("Luas Lingkaran = " + luas);
                break;
                
            case 4:
                System.out.print("Masukkan sisi sejajar a: "); double a = scanner.nextDouble();
                System.out.print("Masukkan sisi sejajar b: "); double b = scanner.nextDouble();
                System.out.print("Masukkan tinggi trapesium: "); double t = scanner.nextDouble();
                luas = 0.5 * (a + b) * t;
                System.out.println("Luas Trapesium = " + luas);
                break;
                
            case 5:
                System.out.print("Masukkan diagonal 1 (d1): "); double d1 = scanner.nextDouble();
                System.out.print("Masukkan diagonal 2 (d2): "); double d2 = scanner.nextDouble();
                luas = 0.5 * d1 * d2;
                System.out.println("Luas Layang-layang = " + luas);
                break;
                
            default:
                System.out.println("Pilihan menu tidak valid!");
        }
        
        scanner.close();
    }
}