/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEARCH_AND_SEARCH;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class aplikasibuah {

    public static void main(String[] args) {
        String[] kodebuah = {"B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10"};
        String[] buah = {"Leci", "Anggur", "Apel", "Mangga", "Pepaya",
            "Salak", "Jeruk", "Nanas", "Nangka", "Pir",};
        //Array Dinamis
        String warna[] = new String[10];
        warna[0] = "Merah";
        warna[1] = "Hitam";
        warna[2] = "Hijau";
        warna[3] = "Kuning";
        warna[4] = "Oranye";
        warna[5] = "Coklat";
        warna[6] = "Kuning";
        warna[7] = "Kuning";
        warna[8] = "Kuning";
        warna[9] = "Hijau";
        int jumlah[] = {10, 20, 10, 30, 10, 30, 20, 15, 15, 10};
        int harga[] = {1000, 2000, 1000, 3000, 1000, 3000, 2000, 1500, 1500, 1000};
        String hargastring[] = {"1000", "2000", "1000", "3000", "1000", "3000", "2000", "1500", "1500", "1000"};

        //vzriabel
        Scanner input = new Scanner(System.in);
        int pil = 0;
        boolean flag = true;

        do {
            System.out.println("MENU APLIKASI \n"
                    + "1 : LIST DATA BUAH \n"
                    + "2 : CARI BUAH \n"
                    + "3 : TRANSAKSI \n"
                    + "4 : LAPORAN \n"
                    + "5 : EXIT \n"
                    + "");
            System.out.print(">> >");
            pil = input.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("================================");
                    System.out.println("LIST NAMA BUAH");
                    System.out.println("================================");
                    System.out.println("KODE\tNAMA\tWARNA\tJUMLAH\tHARGA");
                    for (int i = 0; i < buah.length; i++) {
                        System.out.println(kodebuah[i] + "\t" + buah[i] + "\t" + warna[i] + "\t" + jumlah[i] + "\t" + harga[i]);
                    }
                    System.out.println("================================");
                    System.out.println(" ");
                    break;
                case 2:

                    System.out.println("CARI BUAH");
                    System.out.print("MASUKKAN KODE BUAH >> > ");
                    String cari = input.next();
                    for (int i = 0; i < buah.length; i++) {
                        if(cari.equalsIgnoreCase(kodebuah[i])){
                            System.out.println("KODE BUAH : "+kodebuah[i]);
                            System.out.println("nama buah : "+buah[i]);
                            System.out.println("WARNA BUAH : "+warna[i]);
                            System.out.println("JUMLAH STOK : "+jumlah[i]);
                        }
                        
                    }
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("SALAH INTRUKSI BOS"
                            + "\n");

                    break;
            }

        } while (flag == true);
    }
}
