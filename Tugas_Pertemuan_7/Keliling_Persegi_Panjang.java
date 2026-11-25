/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */

import java.util.Scanner;

public class Keliling_Persegi_Panjang {
    static int hitungKeliling(int panjang, int lebar){
    return 2 * (panjang + lebar);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan Panjang : ");
        int panjang = input.nextInt();
        
        System.out.println("Masukan Lebar : ");
        int lebar = input.nextInt();
        
        int Keliling = hitungKeliling(panjang, lebar);
        System.out.println("Keliling Persegi Panjang = " + Keliling);
    }
}
