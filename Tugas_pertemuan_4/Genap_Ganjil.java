/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class Genap_Ganjil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== 1. CEK BILANGAN GENAP / GANJIL ===");
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = scanner.nextInt();
        
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan Genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan Ganjil.");
        }
        
        scanner.close();
    }
}