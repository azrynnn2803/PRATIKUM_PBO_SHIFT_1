/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== 3. PERHITUNGAN GAJI BERSIH KARYAWAN ===");
        System.out.print("Masukkan NIK           : "); 
        String nik = scanner.next();
        scanner.nextLine(); // membersihkan buffer
        System.out.print("Masukkan Nama          : "); 
        String nama = scanner.nextLine();
        System.out.print("Masukkan Kode Golongan (1-4): "); 
        int kodeGolongan = scanner.nextInt();
        System.out.print("Masukkan Jumlah Anak   : "); 
        int jumlahAnak = scanner.nextInt();
        
        double gajiPokok = 0;
        switch (kodeGolongan) {
            case 1: gajiPokok = 1200000; break;
            case 2: gajiPokok = 1500000; break;
            case 3: gajiPokok = 1750000; break;
            case 4: gajiPokok = 2000000; break;
            default:
                System.out.println("Golongan tidak valid!");
                scanner.close();
                return;
        }
        
        double tunjanganPasangan = 0.10 * gajiPokok;
        double tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;
        double totalTunjangan = tunjanganPasangan + tunjanganAnak;
        double gajiBersih = gajiPokok + totalTunjangan;
        
        System.out.println("\n----------------------------------------");
        System.out.println("            STRUK GAJI KARYAWAN           ");
        System.out.println("----------------------------------------");
        System.out.println("NIK               : " + nik);
        System.out.println("Nama              : " + nama);
        System.out.println("Golongan          : " + kodeGolongan);
        System.out.println("Gaji Pokok        : Rp " + gajiPokok);
        System.out.println("Tunjangan Pasangan: Rp " + tunjanganPasangan);
        System.out.println("Tunjangan Anak    : Rp " + tunjanganAnak);
        System.out.println("Total Tunjangan   : Rp " + totalTunjangan);
        System.out.println("Gaji Bersih       : Rp " + gajiBersih);
        System.out.println("----------------------------------------");
        
        scanner.close();
    }
}