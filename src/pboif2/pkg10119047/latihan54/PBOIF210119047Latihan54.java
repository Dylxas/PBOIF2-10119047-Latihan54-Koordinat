/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan54;

import data.WarnaKoordinat;
/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENAMPILKAN DATA KELINCI
 */

public class PBOIF210119047Latihan54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        WarnaKoordinat warnaKoordinat = new WarnaKoordinat(10, 4, "Jingga");
                
        System.out.println("Warna Koordinat : " + warnaKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + warnaKoordinat.getX() + ", y : " + warnaKoordinat.getY());
    }
    
}
