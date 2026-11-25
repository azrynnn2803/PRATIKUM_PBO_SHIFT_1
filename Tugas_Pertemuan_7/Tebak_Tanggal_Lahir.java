/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */

import java.util.Scanner;

public class Tebak_Tanggal_Lahir {
    
    static int TebakBulanTanggal(int bulan, int tanggal){
        int hasil = (bulan * 100) + tanggal;
        return hasil;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Angka Bulan Lahir (1-12) : ");
        int Bulan = input.nextInt();
        
        System.out.print("Masukan Tanggal Lahir (1-31) : ");
        int Tanggal = input.nextInt();
        
        int hasilAkhir = TebakBulanTanggal(Bulan, Tanggal);
        System.out.println("Hasil Akhirnya = " + hasilAkhir);
        
        input.close();
    }
}
