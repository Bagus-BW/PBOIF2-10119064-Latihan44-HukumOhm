/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan44.hukumohm;

import model.Baterai;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program menampilkan penjelasan hukum ohm
 * dan untuk menghhitung tegangan
 */
public class PBOIF210119064Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inisialisasi objek Baterai dan baterai2
        Baterai baterai = new Baterai();
        
        Baterai baterai2 =  new Baterai(3, 12);
        
        //output
        System.out.println("Kuat Arus : " + baterai2.getKuatArus() + " ampere");
        System.out.println("Hambatan  : " + baterai2.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + baterai2.hitungtegangan() + " volt");
        
    }
    
}
