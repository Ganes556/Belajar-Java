/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial27;

/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        while (kondisi){
//            aksi
//        }

        int a = 0;
        boolean kondisi = true;
        System.out.println("awal program");
        while (kondisi){
            
            System.out.println(a);
            if (a==10){
                kondisi = false;
            }
            a++;
        }

    }
    
}
