/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEARCH_AND_SEARCH;

import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class TUGASKELOMPOK {

    public static void main(String[] args) {

        String keyword;
        int jumlah = 0;
        boolean flag = false;

//        keypass = JOptionPane.showInputDialog(null, "MASUKKAN PASSWORD ANDA");
        String[] user = {
            "MANGGA", "MARKISA", "PEPAYA", "NANAS", "JERUK",
            "NANGKA", "MANGGA", "NANAS", "APEL", "ANGGUR",
            "ANGGUR", "DURIAN", "DURIAN", "JAMBU", "NANAS",
            "LECI", "SIRSAK", "ANGGUR", "JAMBU", "MARKISA",
            "APEL", "MANGGA", "LECI", "NANS", "RAMBUTAN"

        };

        keyword = JOptionPane.showInputDialog(null, "MASUKKAN USER ANDA");
        for (int i = 0; i < 10; i++) {
            if (keyword.equals(user)) {
                flag = true;
                jumlah++;
            }
        }

        if (flag) {
            JOptionPane.showMessageDialog(null, "BUAH DI TEMUKAN");
            JOptionPane.showMessageDialog(null, "NAMA BUAH :" + keyword);
            JOptionPane.showMessageDialog(null, "JUMLAH :" + jumlah);
        } else {
            JOptionPane.showMessageDialog(null, "BUAH TIDAK DI TEMUKAN");

        }
    }

}
