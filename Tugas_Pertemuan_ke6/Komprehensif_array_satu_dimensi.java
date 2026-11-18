/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */

import java.util.Scanner;
import java.util.Arrays;

public class Komprehensif_array_satu_dimensi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Jumlah Elemen Array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Masukan Nilai Elemen: ");
        for(int i = 0; i < n; i++){
            System.out.print("ELemen ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        
        int Max = arr[0], Min = arr[0];
        int idxMax = 0, idxMin = 0;
        for (int i = 1; i < n; i++){
            if (arr[i] > Max){
             Max = arr[i];
             idxMax = i;
            }
            if (arr[i] < Min) {
                Min = arr[i];
                idxMin = i;
            }
        }
        
        System.out.println("\nNilai Terbesar: " + Max + " Pada Indeks Ke-" + idxMax);
        System.out.println("Nilai Terkecil: " + Min + " Pada Indeks Ke-" + idxMin);
        
        double jumlah = 0;
        for (int i = 0; i < n; i++) {
            jumlah += arr[i];
        }
        double rataRata = jumlah / n;
        System.out.println("Jumlah Total Elemen: " + jumlah);
        System.out.println("Nilai Rata-rata: " + rataRata);
        
        int jumlahIndeksGanjil = 0;
        for (int i = 1; i < n; i += 2) {
            jumlahIndeksGanjil += arr[i];
        }
        System.out.println("Jumlah Elemen Berindeks Ganjil: " + jumlahIndeksGanjil);
        
        int jumlahIndeksGenap = 0;
        for (int i = 0; i < n; i += 2) {
            jumlahIndeksGenap += arr[i];
        }
        System.out.println("Jumlah Elemen Berindeks Genap: " + jumlahIndeksGenap);
        
        String statusGanjilGenap = (jumlahIndeksGenap % 2 == 0) ? "Genap" : "Geanjil";
        System.out.println("Jumlah Elemen Indeks Genap Bernilai: " + statusGanjilGenap);
        
        Arrays.sort(arr);
        System.out.println("Array Setelah Diurutkan: " + Arrays.toString(arr));
        
        input.close();
    }
}
