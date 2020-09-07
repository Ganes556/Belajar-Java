/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial44;

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
        // pejumlahan anatara 2 buah array
        int[] arrayAngka1 = {1, 2, 31};
        int[] arrayAngka2 = {1, 0, 31,2,4,5,1};

        int[] arrayHasil = tambahArray(arrayAngka1, arrayAngka2);

        printArray(arrayAngka1, "array 1");
        printArray(arrayAngka2, "array 2");
        printArray(arrayHasil, "array 3");

        // menggabungkan antara 2 buah array
        int[] arrayHasil2 = new int[arrayAngka1.length + arrayAngka2.length];
        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayHasil2[i] = arrayAngka1[i];
        }

        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayHasil2[arrayAngka1.length+i] = arrayAngka2[i];
        }
        printArray(arrayHasil2, "array gabung");
        
        // Sorting reverse, mengurutkan tapi kebalik
        printArray(arrayAngka1,"sorted");
        reverse(arrayAngka1);
        printArray(arrayAngka1,"Reverse sorted");
        
        
        reverse2(arrayAngka2);
        printArray(arrayAngka2,"Reverse2 sorted");
    }
    // reverse dengan cara menukar nilai awal dan nilai akhir dan seterusnya
    private static void reverse2(int[] dataArray){
        Arrays.sort(dataArray);
        int Buffer;
        for(int i = 0; i < dataArray.length/2 ; i++){
            Buffer = dataArray[i]; // nyimpan data awal
            dataArray[i] = dataArray[(dataArray.length-1)-i]; // tukar awal akhir
            dataArray[(dataArray.length-1)-i] = Buffer; // tukar akhir awal
        }
    }
    private static void reverse(int[] dataArray){
        Arrays.sort(dataArray);
        int[] arrayBuffer = Arrays.copyOf(dataArray, dataArray.length);
         for(int i=0; i < dataArray.length;i++){
             dataArray[i] = arrayBuffer[dataArray.length-i-1];
              
        }
    }

    private static int[] tambahArray(int[] dataArray1, int[] dataArray2) {
        int[] arrayHasil = new int[dataArray1.length];
        for (int i = 0; i < dataArray1.length; i++) {
            arrayHasil[i] = dataArray1[i] + dataArray2[i];
        }
        return arrayHasil;
    }

    private static void printArray(int[] dataArray1, String message) {
        System.out.println("Array " + message + " = " + Arrays.toString(dataArray1));
    }
}
