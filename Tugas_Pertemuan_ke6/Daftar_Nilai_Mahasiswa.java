/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class Daftar_Nilai_Mahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa yang akan diinput: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); // membersihkan buffer

        String[] nama = new String[jumlah];
        int[] nilai = new int[jumlah];
        String[] status = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("Nama  : ");
            nama[i] = scanner.nextLine();
            System.out.print("Nilai : ");
            nilai[i] = scanner.nextInt();
            scanner.nextLine(); // membersihkan buffer

            // Menentukan status kelulusan (> 50 Lulus, <= 50 Tidak Lulus)
            if (nilai[i] > 50) {
                status[i] = "Lulus";
            } else {
                status[i] = "Tidak Lulus";
            }
        }

        // Menampilkan tabel hasil
        System.out.println("\n\t\tDaftar Nilai Mahasiswa");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-5s | %-20s | %-8s | %-12s\n", "No", "Nama", "Nilai", "Status");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-5d | %-20s | %-8d | %-12s\n", (i + 1), nama[i], nilai[i], status[i]);
        }
        System.out.println("-------------------------------------------------");

        scanner.close();
    }
}