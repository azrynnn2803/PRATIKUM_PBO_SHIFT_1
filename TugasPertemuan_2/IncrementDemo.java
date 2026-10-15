/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package incrementdemo;

/**
 *
 * @author hp
 */
public class IncrementDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 10;
        int y = 10;

        System.out.println("=== ILUSTRASI OPERATOR INCREMENT ===");
        System.out.println("Nilai awal x = " + x);
        System.out.println("Nilai awal y = " + y);

        System.out.println("\nPre-increment (++x): " + (++x));
        System.out.println("Nilai x sekarang: " + x);
        System.out.println("\nPost-increment (y++): " + (y++));
        System.out.println("Nilai y setelah operasi: " + y);
    }
    
}
