/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tutorial37;
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
        System.out.print("Masukan nilai = ");
        int nilai = userInput.nextInt();
        System.out.println("anda memasukan nilai = " + nilai);        
        printNilai(nilai);
        // jumlah nilai
        System.out.println("Jumlah parameter = " + jumlah(nilai));
        // jumlah factorial
        System.out.printf("factorial dari %d! = %d\n",nilai,factorial(nilai));
    }
    // menghitung faktorial
    private static int factorial(int parameter){
        if (parameter == 1){
            return parameter;
        }
        // pada saat parameter 1 baru di kali semua nilainya
        System.out.println(parameter * factorial(parameter-1));
        return parameter * factorial(parameter-1);
    }
    
    // recursive ini dia menjalankan dulu 
    // lalu pada saat recursivenya di hentikan maka pada saat itu mulai menghitung fungsi dari setiap data yang ada pada recursive
    private static int jumlah(int parameter){
        System.out.println("Parameter = " + parameter);
        if (parameter == 0){
            // menghentikan looping dan akan mengalokasikan semua return / menghitung
            // dan kemudian mengembalikan hasil hitungannya
            return parameter;
        }
        return parameter + jumlah(parameter-1);
        
    }
    
    // Fungsi recursive sederhana
    private static void printNilai(int parameter ){
        System.out.println("nilai = " + parameter);

        if (parameter == 0){
            return;
        }
        parameter--;
        printNilai(parameter);
        
    }
    
}

