/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operasimatematika;

/**
 *
 * @author hp
 */
public class OperasiMatematika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x = 22;
        double y = 33;

        double penjumlahan = x + y;
        double pengurangan = x - y;
        double perkalian = x * y;
        double pembagian = x / y;

        System.out.println("=== OPERASI MATEMATIKA ===");
        System.out.println("Nilai x = " + x + ", y = " + y);
        System.out.println("1. Penjumlahan (x + y) : " + penjumlahan);
        System.out.println("2. Pengurangan (x - y) : " + pengurangan);
        System.out.println("3. Perkalian   (x * y) : " + perkalian);
        System.out.println("4. Pembagian   (x / y) : " + pembagian);
    }
    
}
