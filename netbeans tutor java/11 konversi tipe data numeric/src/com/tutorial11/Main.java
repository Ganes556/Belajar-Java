/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial11;

/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // urutannya byte,short,int,long,float,char,boolean
        // konversi data
        int nilaiInt = 500;
        System.out.println("nilai int= " + nilaiInt);
        // konversi ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("nilai long = " + nilaiLong);
        // konversi ke tipe data yang lebih kecil misal byte
        byte nilaiByte = (byte) nilaiInt; // masalah jika rentangnya lebih dari rentang type datanya
        System.out.println("nila Byte = " + nilaiByte);
        
    //casting pembagian
        // 1.dengan cara salah satu di ubah jadi float
        float a = 10;
        int b = 4;
        float c = a/b;
        System.out.printf("%f : %d = %f\n",a,b,c);
        
        // 2.dengan cara konversi hasilnya 
        int x = 10;
        int y = 4;
        float z = (float) x/y; // logic nya si x dikonversi lalu di bagi dgn INT
        System.out.printf("%d : %d = %f\n",x,y,z);
    }
    
}
