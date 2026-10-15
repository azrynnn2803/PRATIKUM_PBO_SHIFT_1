/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package waktutempuhcahaya;

/**
 *
 * @author hp
 */
public class WaktuTempuhCahaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double jarakBulan = 384400.0;
       double jarakMatahari = 152100000.0;
       double kecepatanCahaya = 300000.0;

       double waktuBulanDetik = jarakBulan / kecepatanCahaya;
       double waktuMatahariDetik = jarakMatahari / kecepatanCahaya;
       double waktuBulanMenit = waktuBulanDetik / 60;

       System.out.println("=== Waktu Tempuh Cahaya ===");
       System.out.println("Kecepatan Cahaya : " + kecepatanCahaya + " km/s");
       System.out.println("\n1. Bumi ke Bulan : ");
       System.out.println("Jarak : " + jarakBulan + " km");
       System.out.println("Waktu Tempuh : " + waktuBulanDetik + " detik");
    

       System.out.println("\n2. Bumi ke Matahari : ");
       System.out.println("Jarak : " + jarakMatahari + " km");
       System.out.println("Waktu Tempuh : " + waktuMatahariDetik + " detik(" + waktuMatahariDetik / 60 + " menit)");
    }
    
}
