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
public class SepedaMotor {
    public String merk;
    public boolean kontakMotor;
    public int kecepatanMotor;
    
    public SepedaMotor(){
    }
    
    public SepedaMotor(String mrk){
        merk = mrk;
    }
    
    public void nyalakanMotor(boolean kontak){
        kontakMotor = kontak;
    }
    
    public void matikanMotor(boolean kontak){
        kontakMotor = kontak;
    }
    
    public void tambahKecepatanMotor(int kec){
        kecepatanMotor = kec;
    }
    
    public void kurangiKecepatanMotor(int kec){
        kecepatanMotor = kec;
    }
    
    public void info(){
    }
}
