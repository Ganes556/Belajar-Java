/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial19;
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
        // membuat input user
        Scanner input = new Scanner(System.in);
        // membuat program sederhana untuk menebak sebuah anggka
        int nilaiBenar = 10;
        int nilaiTebakan;
        boolean statusTebakan;
        System.out.print("Masukan nilai tebakan anda: ");
        nilaiTebakan = input.nextInt();
        System.out.println("Nilai tebakan anda adalah: "+nilaiTebakan);
        // Operasi Logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.printf("Tebakan anda: %s\n",statusTebakan);
        // Operasi aljabar boolean (AND / OR)
        System.out.print("Masukan nilai diantara 4 dan 9: ");
        nilaiTebakan = input.nextInt();
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
        System.out.println("Tebakan anda : " + statusTebakan);
        
    }
    
}
