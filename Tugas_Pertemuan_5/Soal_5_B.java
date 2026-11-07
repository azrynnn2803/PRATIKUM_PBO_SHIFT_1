/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal_1;

/**
 *
 * @author hp
 */
public class Soal_5_B {
    public static void main(String[] args) {
        int n = 3;
        
        //Bagian Atas 
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //Bagian Bawah
        for(int i = n -1; i >= 1; i--){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
        }
            for(int k = 1; k <= (2 * i -1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
