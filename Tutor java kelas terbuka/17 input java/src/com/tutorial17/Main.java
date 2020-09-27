/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial17;
import java.util.Scanner;
/**
 *
 * @author Ganes
 */
public class Main {
    public static void main(String[] args){
        // membuat perhitungan luas!
        Scanner inputInt = new Scanner(System.in);
        int panjang,lebar,luas,tinggi,volume;
        System.out.println("MENGHITUNG LUAS !");
        System.out.print("Panjang >> ");
        panjang = inputInt.nextInt();
        System.out.print("Input Lebar >> ");
        lebar = inputInt.nextInt();  
        
        luas = panjang * lebar;
        System.out.printf("Luas ==> %d\n",luas );
        
        System.out.println("MENGHITUNG VOLUME !");
        System.out.print("Tinggi >> ");
        tinggi = inputInt.nextInt();
        volume = luas * tinggi;
        System.out.println("Volume --> " + volume);
    }
    
}
