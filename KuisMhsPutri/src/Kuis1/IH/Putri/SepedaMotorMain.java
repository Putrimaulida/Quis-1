/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis1.IH.Putri;

/**
 *
 * @author asus
 */
public class SepedaMotorMain {
    public static void main(String[] args) {
        SepedaMotor sm = new SepedaMotor();
        sm.merk = "Honda";
        sm.kontakMotor = false;
        sm.kecepatanMotor = 100;
        sm.nyalakanMotor(false);
        sm.tambahKecepatanMotor(5);
        sm.kurangiKecepatanMotor(5);
        
        System.out.println("Merk : Honda, Yamaha, Ducati, Suzuki");
        System.out.println("Kontak Motor : ");
        
    }
}
