/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
class Civitas {
    String nama;
    String status;
    String fakultas = "Fakultas Teknik";

    Civitas(String nama, String status) {
        this.nama = nama;
        this.status = status;
    }

    void tampilData() {
        System.out.println("Nama     : " + nama);
        System.out.println("Status   : " + status);
        System.out.println("Fakultas : " + fakultas);
        System.out.println("---------------------------");
    }
}

class Dosen extends Civitas {
    Dosen(String nama) {
        super(nama, "Dosen");
    }
}

class Mahasiswa extends Civitas {
    Mahasiswa(String nama) {
        super(nama, "Mahasiswa");
    }
}

class Staff extends Civitas {
    Staff(String nama) {
        super(nama, "Staff");
    }
}

public class CivitasAkademika {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("Pak Budi");
        Mahasiswa m1 = new Mahasiswa("Rizky");
        Staff s1 = new Staff("Bu Sari");

        d1.tampilData();
        m1.tampilData();
        s1.tampilData();
    }
}
