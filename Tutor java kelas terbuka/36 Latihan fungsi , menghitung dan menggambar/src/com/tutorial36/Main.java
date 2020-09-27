/*
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
        
        int[] data;
        data = input();
        int tinggi,alas;
        if (data[1] > data[0]){
            System.out.println("Tolong masukan angka dmn Tinggi > alas !");
            data = input();
        }
        
        tinggi = data[0];
        alas = data[1];
        
        gambarSegitiga(tinggi,alas);
        luasSegitiga(tinggi,alas);
        kelilingSegitiga(tinggi,alas);
        
    }
    private static void gambarSegitiga(int tinggi,int alas){
        System.out.println("");
        for (int i = 0; i < tinggi; i++){
            for (int j = 0; j < alas; j++){
                System.out.print("* ");                
                
                if (j == i){
                    break;                    
                }
            }
          
            System.out.println("");
        }
            
               
    }
    private static void luasSegitiga(int tinggi, int alas ){
        float luas;
        
        luas = (float) 1/2  * (float) alas   * (float) tinggi;
        System.out.println("Luas segitiga adalah = "+ luas);
    }
    private static void kelilingSegitiga(double tinggi,double alas){
        double keliling,a,b;
        a =  alas;
        b =  tinggi;
        double c;
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        keliling = a + b + c;
        System.out.println("Keliling segitiga adalah = " + (float) keliling);
    }
    private static int[] input(){
        Scanner inputUser = new Scanner(System.in);
        int tinggi,alas;
        System.out.print("Tinggi = ");
        tinggi = inputUser.nextInt();
        System.out.print("Alas = ");
        alas = inputUser.nextInt();
        int[] data = {tinggi,alas};
        return  data ;
    }
    
    
}
