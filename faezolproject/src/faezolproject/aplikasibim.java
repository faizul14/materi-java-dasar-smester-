/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faezolproject;

import javax.swing.JOptionPane;

/**
 *
 * @author YOUNGER_art
 */
public class aplikasibim {

    public static void main(String[] args) {

        //Deklarasi Variabel
        String tinggi, berat, nama;

        double BIM;

        //CODINGAN
        JOptionPane.showMessageDialog(null, "SELAMAT DATANG DI APLIKASI BIM");
        nama = JOptionPane.showInputDialog(null, "MASUKKAN NAMA ANDA");
        berat = JOptionPane.showInputDialog(null, "MASUKKAN BERAT ANDA (kg)");
        double n = Double.parseDouble(berat);
        tinggi = JOptionPane.showInputDialog(null, "MASUKKAN TINGGI ANDA (M)");
        double m = Double.parseDouble(tinggi);

        BIM = (double) (n / (m * m));
        //n dan m adakah variabel pengganti dari berat dan tinggi
        //yang sudah di deklarasikan ke double 

        JOptionPane.showMessageDialog(null, "APAKAH BENAR DATA YANG ANDA MASUKKAN"
                + "\nNAMA    :" + nama
                + "\nBERAT   :" + n + " KG"
                + "\nTINGGI   :" + m + " M");
        if (BIM >= 30) {
            System.out.println("LIHAT DATA ANDA");
            System.out.println("NAMA     :" + nama);
            System.out.println("TINGGI   :" + m + " (M)");
            System.out.println("BERAT    :" + n + " kg");
            System.out.println("HASIL BIM:" + BIM);
            System.out.println("KRITERIA ANDA ADALAH OBESITAS :(");
        } else if ((BIM >= 25.0) && (BIM < 30)) {
            System.out.println("LIHAT DATA ANDA");
            System.out.println("NAMA     :" + nama);
            System.out.println("TINGGI   :" + m + " (M)");
            System.out.println("BERAT    :" + n + " kg");
            System.out.println("HASIL BIM:" + BIM);
            System.out.println("KRITERIA ANDA ADALAH GENDUT :-)");
        } else if ((BIM >= 18.5) && (BIM < 24.9)) {
            System.out.println("LIHAT DATA ANDA");
            System.out.println("NAMA     :" + nama);
            System.out.println("TINGGI   :" + m + " (M)");
            System.out.println("BERAT    :" + n + " kg");
            System.out.println("HASIL BIM:" + BIM);
            System.out.println("KRITERIA ANDA ADALAH NORMAL");
        } else if (BIM < 18.5) {
            System.out.println("LIHAT DATA ANDA");
            System.out.println("NAMA     :" + nama);
            System.out.println("TINGGI   :" + m + " (M)");
            System.out.println("BERAT    :" + n + " kg");
            System.out.println("HASIL BIM:" + BIM);
            System.out.println("KRITERIA ANDA ADALAH KURUS");
        }

    }
}
