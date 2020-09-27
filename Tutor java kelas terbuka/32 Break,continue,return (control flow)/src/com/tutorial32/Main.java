/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial32;

/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // break, continue, return
        int a =0;
        while(true){
            a++;
            if (a==10){
                break; 
                // keyword untuk memaksa keluar dari loop
            }else if (a==5){
                continue;
                // keyword ini untuk memulai dari awal
            }else if(a==7){
                return;
                // keyword untuk keluar dari method
            }
            
            System.out.println("looping ke - "+a);
        }
    }
    
}
