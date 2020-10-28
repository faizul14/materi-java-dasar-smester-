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
public class SEARCHINGADV {

    public static void main(String[] args) {

        String keyuser, keypass;
        boolean flag = false;

        keyuser = JOptionPane.showInputDialog(null, "MASUKKAN USER ANDA");
        keypass = JOptionPane.showInputDialog(null, "MASUKKAN PASSWORD ANDA");

        String[][] user = {
            {"FAEZOL", "1234"},
            {"PADLI", "2290"},
            {"EZON", "9090"}

        };

        for (int i = 0; i < user.length; i++) {
            if (keyuser.equalsIgnoreCase(user[i][0])
                    && keypass.equals(user[i][1])) {
                flag = true;

            };

        }

        if (flag) {
            JOptionPane.showMessageDialog(null, "DATA DI TEMUKAN");
        } else {
            JOptionPane.showMessageDialog(null, "DATA TIDAK DI TEMUKAN");

        }
    }
}
