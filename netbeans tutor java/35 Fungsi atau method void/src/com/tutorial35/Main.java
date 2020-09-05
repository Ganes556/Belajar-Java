/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial35;

/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // void itu hampa atau kosong
        System.out.println(simple());
        fungsiVoid("ini adalah fungsi void !");
        selamatPagi("Ganes");
        selamatPagi("Teteh");
    }
    private static void selamatPagi(String Nama){
        System.out.println("Selamat Pagi "+ Nama);
    }
    
    // fungsi atau method tanpa kembalian
    // hanya melakukan sebuah kegiatan saja
    private static void fungsiVoid(String input){
        System.out.println(input);
    }
    // fungsi atau method dengan kembalian 
    // sehingga menggunakan return untuk 
    // mengembalikan nilainya (10.0f)
    private static float simple(){
        return 10.0f;
    }
}
