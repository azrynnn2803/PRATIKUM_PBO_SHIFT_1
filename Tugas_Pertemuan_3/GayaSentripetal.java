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

public class GayaSentripetal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Massa benda (M dalam kg): ");
        double m = input.nextDouble();

        System.out.print("Masukkan Kecepatan (v dalam m/s): ");
        double v = input.nextDouble();

        System.out.print("Masukkan Jari-jari lintasan (r dalam meter): ");
        double r = input.nextDouble();

        // Rumus Fc = (m * v^2) / r
        double fc = (m * Math.pow(v, 2)) / r;

        System.out.println("\n------------------------------------");
        System.out.println("Gaya Sentripetal (Fc) = " + fc + " N (Newton)");
        
        input.close();
    }
}