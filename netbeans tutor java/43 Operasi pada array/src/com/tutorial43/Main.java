/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial43;
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
        int arrayAngka1[] = {1,2,3,4,5};
        // merubah array to string  
        System.out.println("\nMerubah array menjadi string\n=============================");
        printArray(arrayAngka1);
        
        System.out.println("\nMengkopi array \n=============================");
        int arrayAngka2[] = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);

        System.out.println("\nMengkopi array dengan loop (Manual) ");
        for(int i=0; i < arrayAngka1.length;i++){
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);
        
        System.out.println("\nMengkopi array dengan copyOf dari array");
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, arrayAngka1.length);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);
        
        System.out.println("\nMengkopi dengan copyOfRange");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 1, arrayAngka1.length);
        
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);

        System.out.println("\nFill array \n=============================");
        int[] arrayAngka5 = new int[100];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5, 5);
        printArray(arrayAngka5);
        
        // kompirasi array 
        System.out.println("\nKompirasi array \n=============================");
        int[] arrayAngka6 = {1,2,3,5};
        int[] arrayAngka7 = {1,2,3,4};
        
        System.out.println("\nMembandingkan antara dua buah array");
        System.out.println(Arrays.equals(arrayAngka6, arrayAngka7));
        
        if(Arrays.equals(arrayAngka6, arrayAngka7)){
            System.out.println("array sama");
        }else{
            System.out.println("array beda");
        }
        
        System.out.println("\nMengecek mana array yang lebih besar");
        // java versi 10 kebawah tidak ada method compare pada Arrays 
        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));
        //                                     |            |
        //                      jika ini 1 = lebih besar   jika ini -1 = lebih besar
        
        System.out.println("\nMengecek mana index yang berbeda"); // jika tidak ada outputnya -1
        System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));
        
        // sort array
        System.out.println("\nSort array\n=======================");
        int[] arrayAngka8 = {1,3,1,12,4,7,10};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);
        
        
        
        // search array
        System.out.println("\nSearch array\n======================");
        printArray(arrayAngka8);
        int angka = 7;
        // harus di sort terlebih dahulu agar indexnya tidak negatif 
        int posisi = Arrays.binarySearch(arrayAngka8,angka);
        System.out.println("angka "+ angka + " ada di index ke = "+ posisi);
        
        /// TUGAS -> bagaimana caranya sorting reverse, gunakan looping
        /// -> operasi tambah dengan menggunakan 2 buah array, misal menjumlahkan antara 2 buah array
            // |-> cluenya bikin fungsi, kemudian gunakan fungsi copyOf sehingga mendapatkan 2 buah array baru
            // yang merupakan hasil penjumlahan 2 buah array tersebut
        /// -> menggabungkan 2 buah array => clue: pakai copyOf, lalu buat fungsinya buat menggabungkan 2 buah arraynya
    }
    private static void printArray(int[] dataArray){
        System.out.println("Array = " + Arrays.toString(dataArray));
    }
    
}
