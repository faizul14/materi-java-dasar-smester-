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
public class CONTOHLAPORAN {

    public static void main(String[] args) {

        //id, jumlah barang yang di beli,total
        String transaksi[][] = {
            {"tr012", "3", "3", "9000"},
            {"tr013", "3", "1", "5000"},
            {"tr014", "3", "2", "10000"},
            {"tr015", "4", "1", "1000"},
            {"tr016", "4", "12", "5000"},
            {"tr017", "5", "20", "500000"},
            {"tr018", "5", "1", "9000"},};

        System.out.println("LAPORAN PENJUALAN ");//HEADER

        //tabel content
        System.out.println("ID\tTANGGAL\tQTY\tTOTAL");
        for (int i = 0; i < transaksi.length; i++) {
            for (int j = 0; j < transaksi[i].length; j++) {
                System.out.print(transaksi[i][j] + "\t");
            }
            System.out.println(" ");
        }

        //statistic
        //memunculkan jumlah data  trnskasi
        System.out.println(" ");
        System.out.println("JUMLAH DATA TRANSAKSI : " + transaksi.length);

        //menampilkan jumlah penjualan dan pemasukan
        int sumqty = 0, sumtotal = 0;
        for (int i = 0; i < transaksi.length; i++) {
            sumqty += Integer.valueOf(transaksi[i][2]);
            sumtotal += Integer.valueOf(transaksi[i][3]);
        }
        System.out.println(" ");
        System.out.println("JUMLAH BARANG YANG TERJUAL : " + sumqty);
        System.out.println(" ");
        System.out.println("JUMLAH PEMASUKAN BULAN INI : " + sumtotal);

        //melihat jumlah pemasukan dan penjualan berdasarkan tanggal
        Scanner input = new Scanner(System.in);
        int pil;
        boolean flag = true;

        do {
            System.out.println("PILIHAN");
            System.out.println("1 : LIHAT LAPORAN BERDASARKAN TANGGAL");
            System.out.println("2 : KEMBALI");
            System.out.print(">> >");
            pil = input.nextInt();

            switch (pil) {
                case 1:
                    //cari banyak tanggal
                    System.out.print("PILIH TANGGAL >> >");
                    int keytgl = input.nextInt();

                    //pencarian
                    int samqty = 0,
                     samtotal = 0;
                    for (int i = 0; i < transaksi.length; i++) {
                        if (String.valueOf(keytgl).equalsIgnoreCase(transaksi[i][1])) {
                            for (int j = 0; j < transaksi[i].length; j++) {
                                System.out.print(transaksi[i][j] + "\t");

                            }
                            System.out.println("");
                            samqty += Integer.valueOf(transaksi[i][2]);
                            samtotal += Integer.valueOf(transaksi[i][3]);
                        }
                    }
                    System.out.println(" ");
                    System.out.println("JUMLAH BARANG YANG TERJUAL : " + samqty);
                    System.out.println(" ");
                    System.out.println("JUMLAH PEMASUKAN BULAN INI : " + samtotal);
                    break;
                case 2:
                    flag = false;
                    break;
                default:
                    System.out.println("SALAH MASUKKAN BOYY");
                    break;
            }
        } while (flag == true);
    }

}
