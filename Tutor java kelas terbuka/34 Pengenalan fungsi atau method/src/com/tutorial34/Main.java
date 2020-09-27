/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial34;

/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // y = (x + 2) * x 
        int x,y;
        x = 10;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);
        
    }
    //penambahan static agar dapat di pakai fungsinya oleh fungsi lain
    // jika ingin jalankan di class yang sama gunakan private saja
    private static int hitung(int input) {
        int hasil;
        hasil = (input + 2)*input;
        return hasil;
    }
    
}
