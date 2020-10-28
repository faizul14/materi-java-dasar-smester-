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
public class harirabu {

    public static void main(String[] args) {

        int isi;
        isi = Integer.valueOf(JOptionPane.showInputDialog(null, "MASUKKAN PANJANG ARRAY"));
        String[] nama = new String[isi];

        String[] umur = new String[isi];

        String[] status = new String[isi];

        for (int i = 0; i < isi; i++) {
            nama[i] = JOptionPane.showInputDialog(null, "MASUKKAN NAMA ");
            umur[i] = JOptionPane.showInputDialog(null, "MASUKKAN UMUR  ");
            status[i] = JOptionPane.showInputDialog(null, "MASUKKAN STATUS ");
        }

//        for (int i = 0; i < isi; i++) {
//            umur[i] = JOptionPane.showInputDialog(null, "MASUKKAN UMUR  ");
//            
//        }
//
//        for (int i = 0; i < status.length; i++) {
//            status[i] = JOptionPane.showInputDialog(null, "MASUKKAN STATUS ");
//        }
        for (int i = 0; i < nama.length; i++) {
            System.out.println("NAMA" + "\t\t" + "umur" + "\t" + "status"
                    + "\n");
            System.out.println(nama[i] + "\t\t" + umur[i] + "\t" + status[i]);
        }

    }

}
