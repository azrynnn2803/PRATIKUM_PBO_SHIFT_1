/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persamaankuadrat;

/**
 *
 * @author hp
 */
public class Persamaankuadrat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = 2;
        double b = 10;
        double c = 5;

        // Menghitung persamaan b^2 - 4ac
        double hasil = (b * b) - (4 * a * c);

        System.out.println("=== MENGHITUNG PERSAMAAN KUADRAT (b^2 - 4ac) ===");
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c);
        System.out.println("Hasil dari b^2 - 4ac adalah: " + hasil);
    }
    
}
