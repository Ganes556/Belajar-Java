/*l
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial36;
import java.util.*;
/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);        
        int panjang,lebar;
        System.out.print("Panjang = ");
        panjang = inputUser.nextInt();
        System.out.print("Lebar = ");
        lebar = inputUser.nextInt();
        
        gambarKotak(panjang,lebar);
        hasilLuasKeliling(panjang,lebar);
        
        
    }
    private static void hasilLuasKeliling(int panjang,int lebar){
        System.out.println("Luas kotak adalah = "+ luasKotak(panjang,lebar));
        System.out.println("Keliling kotak adalah = " + kelilingKotak(panjang,lebar));
    }
    
    private static float luasKotak(int panjang, int lebar ){
        System.out.println("==============================");        
        float luas;
        luas = panjang * lebar;
        return luas;
    }
    
    private static float kelilingKotak(int panjang,int lebar){        
        float keliling = (panjang + lebar)*2;
        
        return keliling;
    }
    
    private static void gambarKotak(int panjang,int lebar){
        System.out.println("");
        for (int i = 0; i < lebar; i++){
            for (int j = 0; j < panjang; j++){
                System.out.print("* ");                
            }
          
            System.out.println("");
        }
            
               
    }
}

