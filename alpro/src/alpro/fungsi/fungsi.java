/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alpro.fungsi;

/**
 *
 * @author acer
 */
public class fungsi {

    public static void main(String[] args) {
        double p = 7;
        double l = 6.5;
        double hasil = hitungluas(p, l);
        System.out.println("luasnya adalah=" + hasil);

    }

    public static double hitungluas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }

}
