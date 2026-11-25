/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class Rekursif {

    // Menghitung faktorial secara rekursif
    static int faktorial(int n) {
        if (n <= 1) {
            return 1; // base case biar berhenti
        }
        return n * faktorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();

        System.out.println("Hasil faktorial " + angka + " = " + faktorial(angka));

        input.close();
    }
}