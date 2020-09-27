/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial31;
import java.util.Scanner;
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
        int fn1,fn2,fn,n,i; 
        System.out.print("Mengambil nilai fibonacci ke - : ");
        n = inputUser.nextInt();
        // for loop punya
        System.out.print("Nilai pertama: ");
        fn1= inputUser.nextInt();
        System.out.print("Nilai kedua: ");
        fn2= inputUser.nextInt();       
        // while loop punya
        int fn1_while = fn1;
        int fn2_while= fn2;
        // do while loop punya
        int fn1_do = fn1;
        int fn2_do = fn2;
        // menggunakan for loop
        System.out.println("=======For Loop=======");
//        fn1=0
//        fn2=1
        // setiap ingin menyelesaikan suatu permasalahan yang memiliki pola gunakan looping
        for(i =1; i <= n; i++){
            fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
            System.out.println("nilai ke - "+ i + " adalah " + fn);
        }
        // menggunakan while loop
        System.out.println("=======While Loop=======");
//        fn1=0;
//        fn2=1;
        i = 1;
        while(i <= n){
            fn = fn1_while +fn2_while;
            fn2_while = fn1_while;
            fn1_while = fn;
            System.out.println("nilai ke - "+ i + " adalah " + fn);
            i++;
        }
        // menggunakan do while
        System.out.println("=======Do While Loop=======");   
        
//        fn1=0;
//        fn2=1;
        i = 1;
        do{
            fn = fn1_do +fn2_do;
            fn2_do = fn1_do;
            fn1_do = fn;
            System.out.println("nilai ke - "+ i + " adalah " + fn);
            i++;
        }while(i<=n);
        
        
        
       
        
        
        
    }
    
}
