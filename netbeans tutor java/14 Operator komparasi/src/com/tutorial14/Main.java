/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial14;

/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // operator komparasi ini akan menghasilkan nilai dalam bentuk boolean
        int a,b;    
        boolean hasilKomparasi;        
        // komparasi equal atau persamaan
        System.out.println("===== persamaan!");
        a = 10;
        b = 10;
        hasilKomparasi = (a==b);
        System.out.printf(" %d == %d --> %s\n",a,b,hasilKomparasi);
        
        // komparasi not equal atau pertidaksamaan
        System.out.println("===== pertidaksamaan!");
        a = 12;
        b = 11;
        hasilKomparasi = (a!=b);
        System.out.printf(" %d != %d --> %s\n",a,b,hasilKomparasi);
        
        // komparasi lest than atau kurang dari
        System.out.println("===== kurang dari!");
        a = 10;
        b = 11;
        hasilKomparasi = (a<b);
        System.out.printf(" %d < %d --> %s\n",a,b,hasilKomparasi);
        
        // komparasi greater than atau lebih dari
        System.out.println("===== lebih dari!");
        a = 14;
        b = 13;
        hasilKomparasi = (a>b);
        System.out.printf(" %d > %d --> %s\n",a,b,hasilKomparasi);
        
        
         // komparasi lest than equal atau kurang dari sama dengan
        System.out.println("===== kurang dari sama dengan!");
        a = 10;
        b = 10;
        hasilKomparasi = (a<=b);
        System.out.printf(" %d < %d --> %s\n",a,b,hasilKomparasi);
        
        // komparasi greater than equal atau lebih dari sama dengan
        System.out.println("===== lebih dari sama dengan!");
        a = 14;
        b = 13;
        hasilKomparasi = (a>=b);
        System.out.printf(" %d > %d --> %s\n",a,b,hasilKomparasi);
        
        // begitu sebaliknya yang false
    }
    
}
