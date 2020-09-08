/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial45;
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
        // cara membuat array 2 dimensi dengan assignment             
        int[][] array_2D = {{2,1,2},{1,6,3}};
        printArray((array_2D));
        
        // cara membuat array 2 dimensi dengan deklarasi
        // int[baris][kolom]
        int[][] arrayD_2D = new int[2][5];
        printArray(arrayD_2D);
        
        //looping lengkap manual
//        for(int i=0; i < arrayD_2D.length;i++){
//
//            System.out.print('[');
//            for (int j = 0; j < arrayD_2D[0].length;j++){               
//                System.out.print(arrayD_2D[i][j] + ",");
//                
//            }
//            System.out.print("]\n");
//        }
//        // looping dngn for each
//        for(int[] baris: arrayD_2D){
//            System.out.print('[');
//            for(int angka: baris){
//                System.out.print(angka + ",");
//            }
//            System.out.println("]\n");
//        }
        // array secara manual, untuk pembuktian
        int[][] array_2D_2 = {
            {1,2,3,4,5},
            {6,7,8,9},
            {11,12,13,14,15}
        };
        printArray(array_2D_2);
        // bisa ambil atau print walau jumlah kolomnya berbeda
        int[][] array_2D_3 = {
            {1,2,3,4,5},
            {6,7,9},
            {11,12,13}
        };
        printArray(array_2D_3);
    }
    private static void printArray(int[][] dataArray_2D){
        System.out.print("{\n");
        for(int[] baris: dataArray_2D){
            System.out.print("{");
            for(int angka: baris){
                System.out.print(angka + ",");
            }
            System.out.print("}\n");
        }
        
    }
    
}
