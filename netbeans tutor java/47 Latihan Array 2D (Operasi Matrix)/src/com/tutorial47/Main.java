/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial47;
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
//        int[][] array2D = new int[3][5];        
//        int[] array1 = {6,6,6,6,6};
//        int[] array2 = {7,7,7,7,7};
//        array2D[0] = array1;
//        array2D[1] = array2;
//        
//        
//        for(int i = 0; i < array2D[0].length;i++){
//            array2D[2][i] = array1[i] + array2[i];
//        }
//        
//        System.out.println(Arrays.deepToString(array2D));

        
        
    }
    private static void printArray(int[][] dataArray){
        int baris = dataArray.length;
        int kolom = dataArray[0].length;
        for(int i = 0; i < baris; i++){
            System.out.print("[");
            for(int j = 0; j < kolom; j++){
                System.out.print(dataArray[i][j] + ",");
            }
            System.out.print("]\n");
        }
    }
    
}
