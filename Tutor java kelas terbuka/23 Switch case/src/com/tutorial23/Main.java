/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial23;

/**
 *
 * @author Ganes
 */
import java.util.*;
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // switch case 
        String input;
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Ketik Nama: ");
        input= inputUser.next();
        // expresi dari siwtch berupa satuan(int,long,byte,short), String atau enum
        // tidak berupa operator logic
        switch (input){ // atau untuk mengecek isi dari sebuah variable
            case "denis":
                System.out.println("Bayangkan kalau kamu itu ampas saat gacha !");
                break;
            default:
                System.out.println("tolong panggil denis biar di bayangin !");
        }
        System.out.println("Program switch case habis !");
    }
    
}
