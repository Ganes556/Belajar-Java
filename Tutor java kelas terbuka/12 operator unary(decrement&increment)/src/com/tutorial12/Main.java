/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial12;

/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // unary = operasi yang dilakukan pada satu variable 
        // unary + dan -
        int angka = 1;
        System.out.printf("unary '+', %d menjadi %d\n",angka,+angka);
        System.out.printf("unary '-', %d menjadi %d\n",angka,-angka);
        
        // unary decrement dan increment(merubah nilai)
        
        int angka2 = 10;   
        angka2++;
        System.out.println("nilai dengan ++ menjadi = "+ angka2);
        
        int angka3 = 11;
        angka3--;
        System.out.println("nilai dengan ++ menjadi = "+ angka3);
        
        //tambahkan dulu baru di tampilkan (prefix)
        int a = 4;
        System.out.println("nilai hasi dari prefix = " + ++a);
        //tampilkan dulu baru di tambahkan (postfix)
        int b = 4;
        System.out.println("nilai hasi dari postfix = " + b++);
        
        // unary boolean dengan ! untung negasi(tidak merubah nilai)
        boolean huji = true;
        System.out.println("ini bolean = "+huji);
        System.out.println("ini bolean = "+!huji); 

        

    }
    
}
