/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */

import java.util.Scanner;
       
public class TahunKabisat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== 4. Cek Tahun Kabisat ===");
        System.out.print("Masukan Tahun : ");
        int tahun = scanner.nextInt();
        
        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)){
            System.out.println(tahun + " Adalah Tahun Kabisat.");
        } else {
            System.out.println(tahun + " Bukan Tahun Kabisat.");
        }
        
        scanner.close();
    }
}
