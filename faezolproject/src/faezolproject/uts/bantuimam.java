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
public class bantuimam {

    public static void main(String[] args) {

        programlpg(0, 0);

    }

    public static void programlpg(double a, double b) {

        String nama, nj = null;
        int pilih;
        String Y;
        double total = 0;
        double totalakhir = 0;
        int lama = 0;
        int harga = 0;
        int diskon = 0;
        int nim;
        double bayar = 0, kembalian = 0;
        boolean run = true;

        do {
            nim = Integer.valueOf(JOptionPane.showInputDialog(null, "MASUKKAN  NIM ANDA"));
            nama = JOptionPane.showInputDialog(null, "MASUKKAN NAMA ");
            pilih = Integer.valueOf(JOptionPane.showInputDialog(null, "PILIH NAMA JASA"
                    + "\n 1. PIJAT REFLEKSI "
                    + "\n 2. PIJAT AROMATERAPI"
                    + "\n 3. INCREAMENT"));
            lama = Integer.valueOf(JOptionPane.showInputDialog(null, "MASUKKAN LAMA JASA"));

            switch (pilih) {
                case 1:
                    nj = "PIJAT REFLEKSI";
                    harga = 50000;
                    total = lama * harga;
                    if (lama > 2) {
                        diskon = (int) (total * 10 / 100);
                    } else if (lama > 4) {
                        diskon = (int) (total * 20 / 100);
                    } else {
                        diskon = 0;
                    }
                    totalakhir = (total - diskon);
                    break;

                case 2:
                    nj = "PIJAT AROMATERAPI";
                    harga = 25000;
                    total = lama * harga;
                    if (lama > 2) {
                        diskon = (int) (total * 10 / 100);
                    } else if (lama > 4) {
                        diskon = (int) (total * 20 / 100);
                    } else {
                        diskon = 0;
                    }
                    totalakhir = (total - diskon);
                    break;
                case 3:
                    nj = "INCREAMENT";
                    harga = 75000;
                    total = lama * harga;
                    if (lama > 2) {
                        diskon = (int) (total * 10 / 100);
                    } else if (lama > 4) {
                        diskon = (int) (total * 20 / 100);
                    } else {
                        diskon = 0;
                    }
                    totalakhir = (total - diskon);
                    break;

            }
            System.out.println("=======DETAIL TRANSAKSI======="
                    + "\nNIM          :" + nim
                    + "\nNAMA         :" + nama
                    + "\nJASA         :" + nj
                    + "\nBIAYA        :RP" + harga
                    + "\nLAMA         :" + lama + " jam"
                    + "\nSUB TOTAL    :RP" + total
                    + "\nDISKON       :RP" + diskon
                    + "\nTOTAL AKHIR  :RP" + totalakhir
                    + "\n==============================");
            JOptionPane.showMessageDialog(null, "=========DETAIL TRANSAKSI=========="
                    + "\nNIM        :" + nim
                    + "\nNAMA       :" + nama
                    + "\nJASA       :" + nj
                    + "\nBAIAYA     :RP" + harga
                    + "\nLAMA       :" + lama + " jam"
                    + "\nSUB TOTAL  :RP" + total
                    + "\nDISKON     :RP" + diskon
                    + "\nTOTAL AKHIR:RP" + totalakhir
                    + "\n====================================");

            bayar = Double.valueOf(JOptionPane.showInputDialog(null, "MASUKKAN UANG ANDA"));
            kembalian = bayar - totalakhir;
            JOptionPane.showMessageDialog(null,
                    "   ======TRANSAKSI======"
                    + "\n UANG ANDA  :RP" + bayar
                    + "\n KEMBALIAN  :" + kembalian
                    + "\n"
                    + "\n TERIMAKASIH TELAH "
                    + "\n MENGGUNAKAN JASA KAMI :0!"
                    + "\n=======================");

            Y = JOptionPane.showInputDialog(null, "Ingin Mencoba lagi (Y/T) ?:");

        } while (Y.equalsIgnoreCase("y"));

    }

}
