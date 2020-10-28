/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faezolproject.uts;

import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class faezol {

    public static void main(String[] args) {

        programlpg(0, 0);

    }

    public static void programlpg(double a, double b) {

        String nama, nb = null;
        int pilih;
        String Y;
        double total = 0;
        double totalakhir = 0;
        int banyak = 0;
        int harga = 0;
        int diskon = 0;
        int pajak = 0;
        int nim;
        boolean run = true;

        do {
            nim = Integer.valueOf(JOptionPane.showInputDialog(null, "MASUKKAN AKHIRAN NIM NIM"));
            nama = JOptionPane.showInputDialog(null, "MASUKKAN NAMA PELANGGAN");
            pilih = Integer.valueOf(JOptionPane.showInputDialog(null, "NAMA BARANG YANG AKAN DI BELI"
                    + "\n 1.LPG 3 KG"
                    + "\n 2.LPG 7 KG"
                    + "\n 3.LPG BRIGHT GAS 5 KG"));
            banyak = Integer.valueOf(JOptionPane.showInputDialog(null, "MASUKKAN BANYAK YANG DI BELI"));

            switch (pilih) {
                case 1:
                    nb = "LPG 3 KG";
                    harga = 18000;
                    total = banyak * harga;
                    if (banyak > 3) {
                        diskon = (int) (total * 5 / 100);
                    } else {
                        diskon = 0;
                    }
                    pajak = (int) ((total - diskon) * 4 / 100);
                    totalakhir = (total - diskon + pajak);
                    break;

                case 2:
                    nb = "LPG 7 KG";
                    harga = nim*1000;
                    total = banyak * harga;
                    if (banyak > 2) {
                        diskon = (int) (total * 6 / 100);
                    } else {
                        diskon = 0;
                    }
                    pajak = (int) ((total - diskon) * 4 / 100);
                    totalakhir = (total - diskon + pajak);
                    break;
                case 3:
                    nb = "LPG BRIGHT GAS 5 KG";
                    harga = 41000;
                    total = banyak * harga;
                    pajak = (int) ((total - diskon) * 4 / 100);
                    totalakhir = (total - diskon + pajak);
                    break;

            }
            JOptionPane.showMessageDialog(null,
                    "NAMA PELANGGAN      :" + nama
                    + "\n NAMA BARANG      :" + nb
                    + "\n BANYAK BARANG    :" + banyak
                    + "\n TOTAL BARANG     :" + "RP" + total
                    + "\n PAJAK            :" + "RP."+pajak
                    + "\n DISKON           :" + "RP." + diskon
                    + "\n TOTALAKHIR BARANG:" + "RP." + totalakhir);

            Y = JOptionPane.showInputDialog(null, "Ingin Mencoba lagi (Y/T) ?:");

        } while (Y.equalsIgnoreCase("y"));

    }

}
