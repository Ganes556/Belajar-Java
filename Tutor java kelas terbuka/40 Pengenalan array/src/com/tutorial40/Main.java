/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial40;
import java.util.Arrays;
/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // array adalah kumpulan data yang diletakan dalam satu colection/himpunan
        // primitive
        
        // assignment
        // type data[] nama = {komponen-komponennya};
        System.out.println("Assignment Array");
        //     index =  0 1 2 3
        //              | | | |
        int[] angka  = {1,2,3,4};
        // outputnya itu merupakan address memory si array angka
        // berisi address karna array itu jumlah nya belum pasti/ bisa di tambah maupun di kurangi
        angka[0] = 12;
        
        System.out.println(angka);
        System.out.println(angka[0]);
        System.out.println(angka[1]);
        System.out.println(angka[2]);
        System.out.println(angka[3]);
        
        // Deklarasi
        // tipedata[] nama = new int[jumlah array];
        System.out.println("Deklarasi Array");
        float[] deklarasiAngka = new float[5];
        deklarasiAngka[0] = 16.5f;
        
        System.out.println(deklarasiAngka[0]);
        System.out.println(deklarasiAngka[1]);
        System.out.println(deklarasiAngka[2]);
        System.out.println(deklarasiAngka[3]);
        System.out.println(deklarasiAngka[4]);
        
        System.out.println(Arrays.toString(angka));
        System.out.println(Arrays.toString(deklarasiAngka));
        System.out.println("Sorting dengan Arrays library");
        // sorting arrays use library arrays
        int [] array = {45,12,85,32,89,39,69,44,42,1,6,8};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
    
}
