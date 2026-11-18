/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class RataRataException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan yang akan dirata-rata: ");
        try {
            int n = scanner.nextInt();
            double[] bilangan = new double[n];
            double total = 0;

            for (int i = 0; i < n; i++) {
                boolean valid = false;
                while (!valid) {
                    try {
                        System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                        bilangan[i] = scanner.nextDouble();
                        total += bilangan[i];
                        valid = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Kesalahan: Harap masukkan angka yang valid!");
                        scanner.next(); // membersihkan input yang salah
                    }
                }
            }

            double rataRata = total / n;
            System.out.println("\nTotal keseluruhan: " + total);
            System.out.println("Nilai rata-ratanya adalah: " + rataRata);

        } catch (InputMismatchException e) {
            System.out.println("Kesalahan fatal: Input jumlah elemen harus berupa angka!");
        }

        scanner.close();
    }
}