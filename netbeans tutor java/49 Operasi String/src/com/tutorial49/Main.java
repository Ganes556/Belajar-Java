/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial49;
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
        String kalimat = "Saya suka kamu !";
        // mengambil komponen string
        System.out.println(kalimat.charAt(5));
        // subtring
        String suka = kalimat.substring(5,9);
        String kamu = kalimat.substring(10,14);
        System.out.println(suka);
        
        // concatenation (concat)
        String kalimat2 = suka + " " +  kamu; // pakai ini bisa membuat memory penuh
                                              // karna setiam pembuaannya di taruh di string pool
        System.out.println(kalimat2);
        
        // concatenation dengan type data yang berbeda
        int a = 2;
        String kalimat3 = suka + " diriku " + a; // casting
        System.out.println(kalimat3);
        
        // lowercase dan uppercase
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());
        
        // replace
        String kalimat4 = kalimat.replace("kamu","aku");
        System.out.println(kalimat4);
        
        // compare berdasarkana alphabeticnya 
        String mobil1 = "Toyota seratus cc";
        String mobil2 = "Kijang seraba kuat";
        System.out.println(mobil1.compareTo(mobil2));
        System.out.println(mobil2.compareTo(mobil1));
        
        String masakan1 = "Nasi goreng";
        String masakan2 = "Nasi bakar"; 
        System.out.println(masakan1.compareTo(masakan2));
        
        // equality ( persamaan )
        // string mengecek address nya jadi jika salah string akan false
        String kataInput = "test"; // ada di string pool
//        String kataInput= new String("test"); // ini bukan string literal, dan tidak berada di string pool
        String kataTest = "test"; // ini juga ada di string pool 
        
        System.out.println("\npersamaan pada lokasi string pool");
        if (kataInput == kataTest){ // ngebandingkan address dari kedua string
            System.out.println("sama");
        }else{
            System.out.println("tidak sama");
        }
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nMengambil input dari user !");
        kataInput = userInput.next();
        System.out.println("ini adalah user input " + kataInput);
        
        // di c++ itu pakai strcmp
        if (kataInput.equals(kataTest)){ // ngebandingkan address dari kedua string
            System.out.println("sama");
        }else{
            System.out.println("tidak sama");
        }
        
        
        
    }
    private static void printAddress(String nama , String data){
        int address = System.identityHashCode(data);
        System.out.println(nama + " = " + data + " || address = " + Integer.toHexString(address));
    }
    
    
}
