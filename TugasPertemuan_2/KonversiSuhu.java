/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversisuhu;

/**
 *
 * @author hp
 */
public class KonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double C = 10;
        double F = 15;
        double R = 5;

        System.out.println("=== KONVERSI SUHU ===");
        System.out.println("Nilai awal -> C = " + C + ", F = " + F + ", R = " + R);

        double cToF = (C * 9.0 / 5.0) + 32;
        double fToC = (F - 32) * 5.0 / 9.0;
        System.out.println("\na. Celcius <-> Fahrenheit:");
        System.out.println("   " + C + " Celcius = " + cToF + " Fahrenheit");
        System.out.println("   " + F + " Fahrenheit = " + fToC + " Celcius");

        double cToR = C * 4.0 / 5.0;
        double rToC = R * 5.0 / 4.0;
        System.out.println("\nb. Celcius <-> Reamur:");
        System.out.println("   " + C + " Celcius = " + cToR + " Reamur");
        System.out.println("   " + R + " Reamur = " + rToC + " Celcius");

        double fToR = 4.0 / 9.0 * (F - 32);
        double rToF = (9.0 / 4.0 * R) + 32;
        System.out.println("\nc. Fahrenheit <-> Reamur:");
        System.out.println("   " + F + " Fahrenheit = " + fToR + " Reamur");
        System.out.println("   " + R + " Reamur = " + rToF + " Fahrenheit");
    }
    
}
