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
public class ARRAYSTASTIS {
    
    public static void main(String[] args) {
        
        String [] buah = {"apel",
        "leci",
        "anggur",
        "mangga",
        "pwpaya",
        "salak",
        "jeruk",
        "nangka",
        "nanas",
        "pir"};
        
        String [] warna = new String [10 ];
        warna [0] = "merrah";
        warna [1] = "hitam";
        warna [2] = "hijau";
        warna [3] = "kuning";
        warna [4] = "orange";
        warna [5] = "coklat";
        warna [6] = "kuning";
        warna [7] = "kuning";
        warna [8] = "kuning";
        warna [9] = "hijau";
        
        System.out.println(buah.length);
        System.out.println("buah/warna");
        
        for (int i = 0; i < buah.length; i++) {
            System.out.println(buah[i]+"\t"+warna[i]);
        }
    }
    
}
