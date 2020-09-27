/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial38;
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
        Scanner userInput = new Scanner(System.in);
        int n;
//        pertama = userInput.nextInt();
//        kedua = userInput.nextInt();
        System.out.print("Masukan nilai n- ");
        n = userInput.nextInt();
        int nilaiFibonacci = fibonacci(n," atas");
        System.out.println("nilai fibonacci = " + nilaiFibonacci);
        
    }
    // konsepnya akan pecah seperti akar pohon kebawah dan bercabang
    private static int fibonacci(int n,String daun){
        System.out.println("fibonacci ke - " + n + daun);
        if (n == 1|| n == 0){
            return n;
        }
        return fibonacci(n-1," kiri") + fibonacci(n-2," kanan");
    }
}
