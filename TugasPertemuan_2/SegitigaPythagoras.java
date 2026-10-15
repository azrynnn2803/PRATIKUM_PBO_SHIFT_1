/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segitigapythagoras;

/**
 *
 * @author hp
 */
public class SegitigaPythagoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = 6;//tinggi
        double b = 8;//alas
        double c = Math.sqrt((a * a) + (b * b));
        double keliling = a + b + c;

        System.out.println("=== Segitiga Pythagoras & KELILING SEGITIGA ===");
        System.out.println("Sisi a : " + a);
        System.out.println("Sisi b : " + b);
        System.out.println("Sisi c (Hypotenuse): " + c);
        System.out.println("Keliling segitiga: " + keliling);
    }
    
}
