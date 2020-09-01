/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial10;

/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        int hasil;
        
        // 1.penjumlahan
        hasil = a+b;
        System.out.printf("%d + %d = %d\n",a,b,hasil);
        // 2.pengurangan
        hasil = a-b;
        System.out.printf("%d - %d = %d\n",a,b,hasil);
        // 3.perkalian
        hasil = a*b;
        System.out.printf("%d x %d = %d\n",a,b,hasil);
        // 4. pembagian
        hasil = a/b;
        System.out.printf("%d : %d = %d\n",a,b,hasil);
        
        float d = 6;
        float e = 5;
        float hasilFloat; 
        hasilFloat= d/e;
        System.out.printf("%f : %f = %f\n",d,e,hasilFloat);   
        System.out.println(d + " : " + e + " = " +  hasilFloat);       
        
        //5. modulus = sisa bagi
        int r=11;
        int g=5;
        int hasilModul= r%g;
        System.out.printf("%d %% %d = %d\n",r,g,hasilModul);
    }
    
}
