/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal_1;

/**
 *
 * @author hp
 */

import java.util.Scanner;

public class Soal_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka ke-1: ");
        int angka = input.nextInt();
        int max = angka;
        int min = angka;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka = input.nextInt();
            
            if (angka > max) {
                max = angka;
            }
            if (angka < min) {
                min = angka;
            }
        }

        System.out.println("Bilangan terbesar: " + max);
        System.out.println("Bilangan terkecil: " + min);
    }
}