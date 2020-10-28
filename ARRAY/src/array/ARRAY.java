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
public class ARRAY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String namabuah[];
        namabuah = new String[4];
//        namabuah[0] = JOptionPane.showInputDialog(null, "MASUKKAN NAMA  BUAH");
//        namabuah[1] = JOptionPane.showInputDialog(null, "MASUKKAN NAMA  BUAH");
//        namabuah[2] = JOptionPane.showInputDialog(null, "MASUKKAN NAMA  BUAH");
//        namabuah[3] = JOptionPane.showInputDialog(null, "MASUKKAN NAMA  BUAH");

        for (int i = 0; i < 4; i++) {
            namabuah[i] = JOptionPane.showInputDialog(null, "MASUKKAN NAMA  BUAH " + (i + 1));

        }
        
            JOptionPane.showMessageDialog(null, " nama buah = "+namabuah[0]
            +"\n nama buah = "+namabuah[1]
            +"\n nama buah = "+namabuah[2]
            +"\n nama buah = "+namabuah[3] );

    }

}
