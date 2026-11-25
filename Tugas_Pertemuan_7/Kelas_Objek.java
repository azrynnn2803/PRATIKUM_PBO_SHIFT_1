/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */

class SepedaMotor {
    String merk;
    int tahun;
    
    void infoMotor(){
        System.out.println("Merk  : " + merk);
        System.out.println("Tahun : " + tahun );
    }
}


public class Kelas_Objek {
    public static void main(String[] args) {
        SepedaMotor motor1 = new SepedaMotor();
        motor1.merk = "Honda Vario";
        motor1.tahun = 2022;
        
        motor1.infoMotor();
    }
}
