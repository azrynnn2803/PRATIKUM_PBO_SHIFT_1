/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class CampurData {
    public static void main(String[] args) {
        // Menggunakan array bertipe Object untuk menampung berbagai macam tipe data
        Object[] data = {19, 0.2, 'C', "java", true};

        // Menampilkan data untuk membuktikannya
        System.out.println("Menampung data campuran dalam satu array:");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Indeks " + i + " = " + data[i] + " (Tipe: " + data[i].getClass().getSimpleName() + ")");
        }
    }
}