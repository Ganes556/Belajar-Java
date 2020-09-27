/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial24;
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
        // ternary operator
        int input,x;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("ini adalah masukan nilai: ");
        input = inputUser.nextInt();
        // Variable x = Ekspresi '?'-->Statement_true ':'-->Statement_false
        // jika menggunakan tenary operator 
        x = (input==10) ? input*input : input/3;
        
        // jika menggunakan if else statement
    //        if (input==10){
    //            x = input*input;
    //        }else{
    //            x = input/3;
    //        }
        
        System.out.println("Hasil nyaa adalah: "+x);
    }
    
}
