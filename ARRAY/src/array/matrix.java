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
public class matrix {

    public static void main(String[] args) {

        int baris, kolom;

        baris = Integer.valueOf(JOptionPane.showInputDialog(null, "MASUKKAN BARSINYA"));

        kolom = Integer.valueOf(JOptionPane.showInputDialog(null, "MASUKKAN KOLOMNYA"));

        //DEKLARASI ARRAY 3D
        int[][] matriks = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matriks[i][j] = Integer.valueOf(JOptionPane.showInputDialog(null, " MASUKKAN BARIS KE " + i + " KOLOM KE " + j));
            }
        }

            for (int j = 0; j < baris; j++) {
                for (int k = 0; k < kolom; k++) {
                    System.out.println(matriks[j][k] + " ");
                }
        }
            

    }

}
