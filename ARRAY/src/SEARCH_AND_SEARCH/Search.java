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
public class Search {

    public static void main(String[] args) {

        //ada yang di cari
        String user = "bangun";
        String pass = "1234";

        //ada keyword yang di gunakan
        String key = JOptionPane.showInputDialog(null, "MASUKKAN USER ANDA");
        String keypass = JOptionPane.showInputDialog(null, "MASUKKAN PASSWORD ANDA");

        //ada kondisis
        if (key.equals(user) && keypass.equals(pass)) {
            JOptionPane.showMessageDialog(null, "USER DI TEMUKAN");
        } else {
            JOptionPane.showMessageDialog(null, "USER tidak DI TEMUKAN");

        }
    }
}
