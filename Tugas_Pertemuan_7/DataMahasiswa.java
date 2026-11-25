/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.util.Scanner;

class MahasiswaFT {
    String nama;
    String npm;
    String kelas;

    void setData(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    void tampilData() {
        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("Nama  : " + this.nama);
        System.out.println("NPM   : " + this.npm);
        System.out.println("Kelas : " + this.kelas);
    }
}

public class DataMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MahasiswaFT mhs = new MahasiswaFT();

        System.out.print("Masukkan Nama  : ");
        String nama = input.nextLine();

        System.out.print("Masukkan NPM   : ");
        String npm = input.nextLine();

        System.out.print("Masukkan Kelas : ");
        String kelas = input.nextLine();

        mhs.setData(nama, npm, kelas);
        mhs.tampilData();

        input.close();
    }
}