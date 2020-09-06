/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial42;
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
        // array itu memorynya -> heap -> posisi sembarang sehingga punya lokasi/ address
        // kalau data primitive biasa memorynya -> stack -> akan ditumpuk per setiap data
        int arrayAngka1[] = {1,2,3,4,5};
        int arrayAngka2[] = new int[5];
        System.out.println("Sebelum di samakan");
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);
        arrayAngka2 = arrayAngka1;
        //          |--> tidak mengcopy. ini addressnya menjadi sama
        //        arrayAngka2 = Arrays.copyOf(arrayAngka1,5); --> ini cara copy arraynya
        
        System.out.println("Sesudah di samakan ");
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);
        
        System.out.println("array angka 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("array angka 2 -> " + Arrays.toString(arrayAngka2));
        
     
        
        arrayAngka1[0] = 100;
        arrayAngka2[4] = 400;
        System.out.println("array angka 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("array angka 2 -> " + Arrays.toString(arrayAngka2));
        
        System.out.println("\nUbah array melalui fungsi dari argument reference");
        ubahArray(arrayAngka1);
        System.out.println("array angka 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("array angka 2 -> " + Arrays.toString(arrayAngka2));
        
        
    }
    // method yang argumennya adalah reference, pass by reference
    // bukan pass by value
    private static void ubahArray(int[] dataArray){
        dataArray[0] = 150;
    }
    
}
