/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial22;

/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // nested if atau if bersarang
        int a =5;
        int b =10;
        // program dari tutorialnya !
        System.out.println("awal dari program !");
        if (a==5){
            if(b==10){
                
                System.out.println("ini adalah aksi dimana a=5 dan b=10 !");
                
            }else{
                
                System.out.println("ini adalah default 2 dimana a=5 dan b !=10 !");
            }            
        }else{
            System.out.println("ini adalah default 1 dimana a salah !");
        }
        System.out.println("akhir dari program !");
        
        
        // program dari latihan di tutorialnya
        int c = 60;
        a = 6;
        b = 120;
        // program nested if di latihan tutorial !
        System.out.println("awal program latihan !");
        if (a==5){
            System.out.println("statement 1");
        }else if (b == 10){
            System.out.println("statement 4");
            
        }else if (c == 20){
            System.out.println("statement 2");
        }else{
            System.out.println("statement 3");
        }
        System.out.println("akhir program latihan !");
              
       

    }
    
}
