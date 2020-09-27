/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial29;

/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        for(inisialisasi/start nilai; kondisi/stop nilai; step nilai){
//            aksi;
//        }
        // urutannya: start, stop, aksi, step
        System.out.println("========loop pertama");
        for (int nilai=5; nilai <=10; nilai++){
            System.out.println("ini nilai for ke-"+ nilai);
        }
        
        
        
        System.out.println("========loop kedua");
        for (int nilai=2; nilai <10; nilai++){
            System.out.println("ini nilai for ke-"+ nilai);
        }
        
        
        System.out.println("========loop ketiga");
        for (int nilai=10; nilai >= 1 ; nilai--){
            System.out.println("ini nilai for ke-"+ nilai);
        }
        
        
        System.out.println("========loop keempat");
        int nilai = 0;
        // syarat for loop di jalankan minimal berisi kondisinya saja atau stop
        for (; nilai < 10 ;){
            System.out.println("ini nilai for ke-"+ nilai);
            nilai++;
        }
        
        System.out.println("ini adalah akhir program");
    }
    
}
