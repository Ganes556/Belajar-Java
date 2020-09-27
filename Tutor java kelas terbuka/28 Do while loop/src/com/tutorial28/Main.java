/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial28;

/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        do{
//            aksi
//        }while(kondisi);
        int a=0;
        boolean kondisi = true;
        System.out.println("ini awal program !");
        // walau salah tetap dijalankan sekali minimal
        do{
            a++;
            System.out.println("do while ke-"+a);
            if (a==10){
                kondisi=false;
            }
        }while(kondisi);
        System.out.println("ini akhir program");
        
        // tidak di jalankan jika false/di cek dulu kondisinya
        while(false){
            System.out.println("test");
        }
    }
    
}
