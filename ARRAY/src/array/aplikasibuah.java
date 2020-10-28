/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class aplikasibuah {

    public static void main(String[] args) {
        int isi, ulang;
        boolean flag = true;

        isi = Integer.valueOf(JOptionPane.showInputDialog(null, "MASUKKAN BANYAK BUAH"));
        String[] buah = new String[isi];

        do {
            String info = "SELAMAT DATNG DI SISTEM DAFTAR BUAH";
            JOptionPane.showMessageDialog(null, info);

            for (int i = 0; i < isi; i++) {
                buah[i] = JOptionPane.showInputDialog(null, "MASUKKAN NAMA  BUAH  " + (i + 1));
            }

            for (int i = 0; i < isi; i++) {
                JOptionPane.showMessageDialog(null, "buah" + " " + buah[i]);
            }

            ulang = JOptionPane.showConfirmDialog(null,
                    "APAKAH ANDA INGIN MENGULANG",
                    "KONFIRMASI",
                    JOptionPane.YES_NO_OPTION);

            if (ulang != JOptionPane.OK_OPTION) {
                flag = false;
            }

        } while (flag == true);
    }
}
