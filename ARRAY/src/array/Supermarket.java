/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class Supermarket {
    public static void main(String[] args) {
        boolean flag = true;
        String Y;
        int Pilih,i;
        
        ArrayList<String> NB = new ArrayList<String>();
        ArrayList<Integer> HB = new ArrayList<Integer>();
        ArrayList<Integer> JB = new ArrayList<Integer>();
        ArrayList<Integer> KB = new ArrayList<Integer>();
        
        Pilih = Integer.valueOf(JOptionPane.showInputDialog(null, "Menu Utama"
                + "\n 1. Memasukkan Barang"
                + "\n 2. Ruang Kasir"));
        switch (Pilih){
            case 1:
            
      NB.add(JOptionPane.showInputDialog(null, "Masukkan Nama Barang"));
      HB.add(Integer.valueOf(JOptionPane.showInputDialog(null, "Masukkan Nama Barang")));
      KB.add(Integer.valueOf(JOptionPane.showInputDialog(null, "Masukkan Nama Barang")));
      break;
      
            case 2:
                
      i=Integer.valueOf(JOptionPane.showInputDialog(null, "Masukkan Kode Barang"));
                
        }
        
        
    }
    
}
