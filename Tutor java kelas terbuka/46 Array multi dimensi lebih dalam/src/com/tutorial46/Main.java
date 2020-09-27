/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial46;
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
        int[][] array2D = {{1,2,3},{3,2,1}};
        System.out.println(Arrays.deepToString(array2D));
        char[] arrayChar1 = {'a','b','c','d'};
        char[] arrayChar2 = {'a','b','c'};
        // didalamnya berisi object oleh karna itu jumlah komponennya bisa berbeda di setiap array di dalamnya
        // karna yang dipanggil itu object dari dalam array 2 dimensi tersebut
        char[][] arrayChar2D = {arrayChar1,arrayChar2};
        System.out.println(Integer.toHexString(System.identityHashCode(arrayChar1)));
        System.out.println(Integer.toHexString(System.identityHashCode(arrayChar2)));
        System.out.println(Arrays.toString(arrayChar2D));
        
    }
    
}
