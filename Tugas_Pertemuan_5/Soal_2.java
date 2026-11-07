/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal_1;

/**
 *
 * @author hp
 */

import java.util.Scanner;

public class Soal_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan yang akan diinput: ");
        int n = input.nextInt();

        double total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            double bil = input.nextDouble();
            total += bil;
        }

        double rataRata = total / n;

        System.out.println("Total jumlah bilangan: " + total);
        System.out.println("Rata-rata: " + rataRata);
    }
}
