/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
// Membuat kelas baru yang mewarisi Thread
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread anak sedang berjalan di dalam method run().");
    }
}

public class kelas_baru_yang_mewarisi {
    public static void main(String[] args) {
        // Menciptakan objek dari kelas tersebut
        MyThread t1 = new MyThread();
        
        // Memanggil start untuk memulai eksekusi thread baru
        t1.start();
        
        System.out.println("Thread utama (main) selesai mengeksekusi.");
    }
}

