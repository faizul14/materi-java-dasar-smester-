/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author acer
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class HitungGade{
    public static void main(String[] args){
        
        int L;
        JOptionPane.showMessageDialog(null,"selamat datang di program saya");
        String bil1=JOptionPane.showInputDialog(null,"masukkan sisi perseginya"); 
        int s = Integer.parseInt(bil1);
        
        L=s*s;
        
        JOptionPane.showMessageDialog(null,"jadi luas persegi= "+L);
        System.out.println("jadi luals persegi"+L);
       
        
        
        
        String nama,kelas,alamat,nim;
        JOptionPane.showMessageDialog(null,"WELCOME TO MY PROGRAM");
        nama = JOptionPane.showInputDialog(null,"masukkan nama anda");
        kelas = JOptionPane.showInputDialog(null,"masukkan kelas anda");
        alamat = JOptionPane.showInputDialog(null,"masukkan alamat anda");
        nim = JOptionPane.showInputDialog(null,"masukkan nim anda");
        int n = Integer.parseInt(nim);
        
        
        JOptionPane.showMessageDialog(null,"apakah data anda benar"+nama+kelas+alamat+n );
        System.out.println("NAMA:"+nama);
        System.out.println("kelas:"+kelas);
        System.out.println("alamat:"+alamat);
        System.out.println("nim:"+n);
        
        /*membuat variable dan scanner
        int nilai;
        String grade,nama;
        Scanner scan = new Scanner(System.in);
        
        //mengambil input nama
        System.out.print("masukkan nama anda: ");
        nama = scan.nextLine();
        
        //mengambil input
        System.out.print("inputkan nilai: ");
        nilai = scan.nextInt();  */
        
        String grade,nama1;
        int nilai;
        JOptionPane.showMessageDialog(null,"SELAMAT DATANG DI PROGRAM GRADE");
        String anggun = JOptionPane.showInputDialog(null,"masukkan nilai ujian");
        int kode = Integer.parseInt(anggun);
        
        nilai = kode ;
        
        
        
        //hitung gradenya
        if ((nilai >=90 ) && (nilai<=100) ){
        grade ="A";
        } else if ((nilai >= 80) && (nilai<90) ){
            grade = "B+";
        } else if ((nilai >= 70)&&(nilai<80) ){
            grade = "B";
        } else if ((nilai >= 60)&&(nilai<70) ){
            grade = "C+";
        } else if ((nilai >= 50)&&(nilai<60) ){
            grade = "C";
        } else if ((nilai >= 40)&&(nilai<50) ){
            grade = "D+";
        } else if ((nilai >= 30)&&(nilai<40) ){
            grade = "D";
        } else if((nilai>=0)&&(nilai<30)){
            grade = "E+";
        } 
        else{
            grade=("salah enter nilai cuk, coba lagi!");
        }
        JOptionPane.showMessageDialog(null,"Selamat anda garade:"+grade);
        
        //ccetak hasil
        
        System.out.println("nama ="+nama);
        System.out.println("nilai= "+nilai);
        System.out.println("grade= "+grade);
        }
    
    
    
    
    
    
    
    }
    
