/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
class CustomThread extends Thread {
    private int threadId;

    public CustomThread(int id) {
        this.threadId = id;
    }

    @Override
    public void run() {
        System.out.println("Thread anak ke-" + threadId + " sedang aktif dan berjalan.");
    }
}

public class MultiTreadExample {
    public static void main(String[] args) {
        System.out.println("Thread utama dimulai.");

        // Menentukan jumlah thread anak yang diinginkan (misal: 5 thread)
        int jumlahThread = 5;

        for (int i = 1; i <= jumlahThread; i++) {
            CustomThread t = new CustomThread(i);
            t.start();
        }

        System.out.println("Semua thread anak telah dipanggil dari thread utama.");
    }
}