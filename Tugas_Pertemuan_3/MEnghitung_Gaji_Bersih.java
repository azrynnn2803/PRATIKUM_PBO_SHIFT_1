/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menghitung_gaji_bersih;

/**
 *
 * @author hp
 */
import java.util.Scanner;

public class MEnghitung_Gaji_Bersih {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nomor Induk Karyawan (NPM): ");
        String nik = scanner.nextLine();

        System.out.print("Masukkan Nama Karyawan: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan Alamat: ");
        String alamat = scanner.nextLine();

        String jabatan = "Manajer";
        double gajipokok = 2000000;
        double tunjanganJabatan = 300000;
        double tunjanganIstri = 200000;
        double tunjanganAnak = 150000;

        double totalGaji = gajipokok + tunjanganJabatan + tunjanganIstri + tunjanganAnak;
        double pajakPenghasilan = 0.10 * totalGaji;
        double gajiBersih = totalGaji - pajakPenghasilan;

        System.out.println("\n===== SLIP GAJI KARYAWAN =====");
        System.out.println("Nomor Induk Karyawan : " + nik);
        System.out.println("Nama Karyawan        : " + nama);
        System.out.println("Alamat               : " + alamat);
        System.out.println("Jabatan              : " + jabatan);
        System.out.println("Gaji Pokok           : Rp " + gajipokok);
        System.out.println("Tunjangan Jabatan    : Rp " + tunjanganJabatan);
        System.out.println("Tunjangan Istri      : Rp " + tunjanganIstri);
        System.out.println("Tunjangan Anak       : Rp " + tunjanganAnak);
        System.out.println("--------------------------------");
        System.out.println("Total Gaji           : Rp " + totalGaji);
        System.out.println("Pajak Penghasilan (10%): Rp " + pajakPenghasilan);
        System.out.println("Gaji Bersih          : Rp " + gajiBersih);
        
        scanner.close();
    }
}
    