/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal_1;

/**
 *
 * @author hp
 */
public class Soal_5_A {
    public static void main(String[] args) {
        int baris = 5;
        
        for(int i = 1; i <= baris; i++){
            for(int j = 1; j <= baris - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
