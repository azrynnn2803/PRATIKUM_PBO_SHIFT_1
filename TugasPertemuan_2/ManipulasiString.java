/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipulasistring;

/**
 *
 * @author hp
 */
public class ManipulasiString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String stra = "Saya Belajar Java";
        String strb = "Saya Belajar Java";

        System.out.println("== MANIPULASI STRING ==");
        System.out.println("String a awal : " + stra);
        System.out.println("String a diubah menjadi huruf kecil : " + stra.toLowerCase());

        System.out.println("\nString b awal : " + strb);
        System.out.println("String b diubah menjadi huruf besar : " + strb.toUpperCase());
    }
    
}
