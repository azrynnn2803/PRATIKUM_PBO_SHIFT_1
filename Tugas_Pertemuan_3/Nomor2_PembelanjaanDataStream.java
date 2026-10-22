/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menghitung_gaji_bersih;

/**
 *
 * @author hp
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Nomor2_PembelanjaanDataStream {
    public static void main(String[] args) {
        DataInputStream dis = new DataInputStream(System.in);

        try {
            System.out.print("Nama             : ");
            String nama = dis.readLine();

            System.out.print("Total Belanja    : ");
            double totalBelanja = Double.parseDouble(dis.readLine());

            System.out.print("Diskon (%)       : ");
            double diskonPersen = Double.parseDouble(dis.readLine());

            double jumlahDiskon = totalBelanja * (diskonPersen / 100);
            double total = totalBelanja - jumlahDiskon;

            System.out.print("Bayar            : ");
            double bayar = Double.parseDouble(dis.readLine());

            double kembalian = bayar - total;

            System.out.println("\n===== STRUK PEMBELANJAAN =====");
            System.out.println("Nama             : " + nama);
            System.out.println("Total Belanja    : Rp " + totalBelanja);
            System.out.println("Diskon (%)       : " + diskonPersen + "%");
            System.out.println("Total            : Rp " + total);
            System.out.println("Bayar            : Rp " + bayar);
            System.out.println("Kembalian        : Rp " + kembalian);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan input/output: " + e.getMessage());
        }
    }
}

