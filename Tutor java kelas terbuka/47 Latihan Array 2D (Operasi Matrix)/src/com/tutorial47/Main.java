/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial47;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Ganes
 */
public class Main {
    public static void main(String[] args){
        // Pertambah matrix 
        int [][] a = {
            {5,6,1},
            {8,9,3},
            {18,19,5}
        };
        int [][] b = {
            {1,2,3},
            {4,5,6},
            {1,3,4}
        };
        printArray(tambah(a,b),"Pertambahan Matrix");
        
        // Perkalian matrix 
        
        int [][] c = {
            {1,2,3},
            {4,5,6}
        };
        int [][] d = {
            {5,6},
            {8,9},
            {18,19}
        };
        // JIKA A . B MAKA JUMLAH BARIS AKAN MENGIKUTI BARIS A DAN JUMLAH KOLOM
        // AKAN MENGUKUTI MATRIX B
        printArray(perkalian(c,d),"Perkalian Matrix");
        
    }
    private static int[][] tambah(int[][] a, int[][] b ){
        int barisA = a.length;
        int kolomA = a[0].length;
        int barisB = b.length;
        int kolomB = b[0].length;
        int [][] hasilTambah = new int[barisA][kolomA];
        if (barisA == barisB && kolomA == kolomB){
            for (int x = 0; x < barisA; x++){
                for (int y = 0; y< kolomA; y++){
                    hasilTambah[x][y] = a[x][y] + b[x][y];
                }

            }
        }
        return hasilTambah;
    }
    // perkalian matrix syaratnya jumlah kolom matrix pertama == baris matrix kedua
    private static int[][] perkalian(int[][] c, int[][] d){
        int barisC = c.length;
        int kolomC = c[0].length;
        int barisD = d.length;
        int kolomD = d[0].length;
        
        int buffer;
        int[][] hasil = new int[barisC][kolomD];
        // konsepnya kolom matrix pertama == baris matrix kedua
        if (kolomC == barisD ){
            for(int i = 0;i < barisC; i++){
                for(int j = 0; j < kolomD;j++){
                    buffer = 0;
                    for (int k = 0; k < kolomC;k++){
                        buffer += c[i][k] * d[k][j];

                    }
                    hasil[i][j] = buffer;

                }
            }
        }
        return hasil;
    }
    private static void printArray(int[][] dataArray,String Operasi){
        System.out.println(Operasi);
        for(int i= 0; i < dataArray.length; i++){
            System.out.print("[");
            for(int j=0; j<dataArray[0].length;j++){
                if(j == dataArray[0].length-1){
                    System.out.print(dataArray[i][j]);
                }else{
                    System.out.print(dataArray[i][j] + ",");
                }
            }
            System.out.println("]");
        }
    }
    
}
