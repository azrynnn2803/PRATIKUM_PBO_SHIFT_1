/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class TampilArrayAge {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};

        // Macam 1: Menggunakan Perulangan For Biasa
        System.out.println("Menampilkan dengan For Biasa:");
        for (int i = 0; i < age.length; i++) {
            System.out.println("Elemen ke-" + i + " : " + age[i]);
        }

        System.out.println("\n-----------------------------");

        // Macam 2: Menggunakan Perulangan For-Each
        System.out.println("Menampilkan dengan For-Each:");
        for (int nilai : age) {
            System.out.println("Nilai : " + nilai);
        }
    }
}