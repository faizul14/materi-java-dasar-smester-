
package alpro.fungsi;

import javax.swing.JOptionPane;


public class kalkulator {

    public static void main(String[] args) {

        kalkulatoralpro(0, 0);
    }

    public static void kalkulatoralpro(double a, double b) {

        int pilih;
        String Y;
        double hasil;
        boolean run = true;

        do {
            pilih = Integer.valueOf(JOptionPane.showInputDialog(null, "=====PILIH BOY====="
                    + "\n 1.PENJUMLAHAN"
                    + "\n 2.PENGURANGAN"
                    + "\n 3.PERKALIAN"
                    + "\n 4.PEMBAGIAN"
                    + "\n 5.HASIL BAGI"));

            switch (pilih) {
                case 1:
                    a = Double.valueOf(JOptionPane.showInputDialog(null, "==PENJUMLAHAN=="
                            + "\n MASUKKAN NILAI A"));
                    b = Double.valueOf(JOptionPane.showInputDialog(null, "==PENJUMLAHAN=="
                            + "\n MASUKKAN NILAI B"));

                    hasil = a + b;
                    JOptionPane.showMessageDialog(null, "HASIL PENJUMLAHAN=" + hasil);
                    break;
                case 2:
                    a = Double.valueOf(JOptionPane.showInputDialog(null, "==PENGURANGAN=="
                            + "\n MASUKKAN NILAI A"));
                    b = Double.valueOf(JOptionPane.showInputDialog(null, "==PENGURANGAN=="
                            + "\n MASUKKAN NILAI B"));

                    hasil = a - b;
                    JOptionPane.showMessageDialog(null, "HASIL PENGURANGAN=" + hasil);
                    break;
                case 3:
                    a = Double.valueOf(JOptionPane.showInputDialog(null, "==PERKALIAN=="
                            + "\n MASUKKAN NILAI A"));
                    b = Double.valueOf(JOptionPane.showInputDialog(null, "==PERKALIAN=="
                            + "\n MASUKKAN NILAI B"));

                    hasil = a * b;
                    JOptionPane.showMessageDialog(null, "HASIL PERKALIAN=" + hasil);
                    break;
                case 4:
                    a = Double.valueOf(JOptionPane.showInputDialog(null, "==PEMBAGIAN=="
                            + "\n MASUKKAN NILAI A"));
                    b = Double.valueOf(JOptionPane.showInputDialog(null, "==PEMBAGIAN=="
                            + "\n MASUKKAN NILAI B"));

                    hasil = a / b;
                    JOptionPane.showMessageDialog(null, "HASIL PEMBAGIAN=" + hasil);
                    break;
                case 5:
                    a = Double.valueOf(JOptionPane.showInputDialog(null, "==HASIL BAGI=="
                            + "\n MASUKKAN NILAI A"));
                    b = Double.valueOf(JOptionPane.showInputDialog(null, "==HASIL BAGI=="
                            + "\n MASUKKAN NILAI B"));

                    hasil = a % b;
                    JOptionPane.showMessageDialog(null, "HASIL BAGI(MODULUS)=" + hasil);
                    break;

            }

            Y = JOptionPane.showInputDialog(null, "Ingin Mencoba lagi (Y/T) ?:");

        } while (Y.equalsIgnoreCase("y"));

    }
}
