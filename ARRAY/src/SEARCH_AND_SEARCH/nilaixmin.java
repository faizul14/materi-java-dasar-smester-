/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEARCH_AND_SEARCH;

/**
 *
 * @author acer
 */
public class nilaixmin {

    public static void main(String[] args) {
        int data[] = {12, 23, 42, 34, 22, 33, 44, 1, 3, 2, 3};

//        int keyvalue = 0; //ingin mencari nilai terbesar
//
//        for (int i = 0; i < data.length; i++) {
//            if (keyvalue < data[i]) {
//
//                //kalau cari yang terbesar,maka tandanya <
//                //kalau cari yang terkecil,maka tandanya >
//                keyvalue = data[i];
//            }
//
//        }
//        System.out.println(" NILAI TERBESAR ADALAH " + keyvalue);
        String nilai[][] = {
            {"SYUKRON", "79"},
            {"SYAR", "90"},
            {"SUSI", "89"},
            {"SAMI", "80"},
            {"SODO", "20"},
            {"SAA", "100"},};

        //sum (all data / count(all data)
        double sum = 0, count = 0, avg;

        for (int i = 0; i < nilai.length; i++) {
            //proses menghitung jumlah data
            sum += Integer.valueOf(nilai[i][1]);

            //proses menghitung banyak data
            count++;
        }
        avg = sum / count;
        System.out.println("RATA-RAT NILAI MEREKA ADALAH = " + avg);

    }
}
