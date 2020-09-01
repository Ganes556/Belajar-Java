/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial18;
import java.util.Scanner;
/**
 *
 * @author Ganes
 */
public class Main {
    public static void main(String[] args){
        int hasil;
        // kali dan bagi bisa yang mana saja lebih dulu di kerjakan !
        hasil = 5*2 + 10/2;
        System.out.println(hasil);
        hasil = 5 + 2 - 10;
        System.out.println(hasil);
        
        hasil = 5 * 2 - (10 + 1);
        System.out.println(hasil);
        
        // perhitungan persamaan kuadrat
        System.out.println("MENGHITUNG PERSAMAAN !");
        Scanner input = new Scanner(System.in);
        int m,x,c;
        m = input.nextInt();
        x = input.nextInt();
        c = input.nextInt();
        int y = m*x*x +c;
        System.out.println("Ini gradiennya --> "+ y);
    }
}
