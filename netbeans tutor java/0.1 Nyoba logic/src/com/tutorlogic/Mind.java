/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorlogic;
import java.util.Scanner;
/**
 *
 * @author Ganes
 */
public class Mind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fn1,fn2,n,b1,b2,fn3,fn4;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Suku ke - : ");
        n = inputUser.nextInt();
        
//        fn1 = 3;
//        fn2 = 7;
//        
//        b = fn2 - fn1;
//        // jika dua tingkat baru butuh 2 variable untuk mencari nilai berikutnya
//        // contoh ini hanya 1 tingkat
//        for (int i=1; i <= n; i++){
//            System.out.println("suku ke-"+ i + " adalah: " + fn1);            
//            fn1= fn1 + b;
//            
//        }
          
          fn1 = 1;
          fn2 = 4;
          fn3 = 3;
          fn4 = 7;
          b1 = fn2 - fn1;
          b2 = fn4 - fn3;
          for (int i=1; i<=n; i++){
              System.out.println("suku ke-"+i + " adalah : " + fn1);
              fn1 = fn1 + fn3;
              fn3 = fn3 + b2;
          }
    }
    
}
