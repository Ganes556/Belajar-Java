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
        // Tugas reverse
        int[] arrayAngka1 = {1,6,2,10,0,1};        
        sortArray(arrayAngka1); // --> guna logic buble sort yg easy
        // reverseArray(arrayAngka1); --> guna fungsi
        System.out.println("\nReverse array\n==========================");
        System.out.println("Array = "+ Arrays.toString(arrayAngka1));

        
        // Tugas menjumlahkan antara 2 buah array
        System.out.println("\nMenjumlahkan antara 2 buah array\n====================================");
        int[] arrayAngka2 = {1,2,3,4,6};
        int[] arrayAngka3 = {1,3,6,9,5};
        int[] tambahArray = tambahArray(arrayAngka2,arrayAngka3);
        System.out.println("Array = "+ Arrays.toString(tambahArray));
        
        // Tugaas menggabungkan 2 buah nilai array
        System.out.println("\nMenggabungkan 2 buah nilai array\n====================================");        
        int[] arrayAngka4 = {1,2,3,4,5};
        int[] arrayAngka5 = {6,2,3,2,4,6};
        int[] arrayGabung = gabungArray(arrayAngka4,arrayAngka5);
        System.out.println("Array = "+ Arrays.toString(arrayGabung));

    }
    // reverse sorting array manual use buble sort logic 'easy'
    private static void sortArray(int[] dataArray1){

        for(int i = 0; i < dataArray1.length; i++ ){
            for(int j = i+1; j < dataArray1.length; j++){
                if (dataArray1[i] <  dataArray1[j]){
                    int dataI = dataArray1[i];
                    int dataJ = dataArray1[j];
                    dataArray1[i] = dataJ;
                    dataArray1[j] = dataI;
                }
            }
        }

    }
    // reverse array use function Arrays
    private static void reverseArray(int[] dataArray1){
        Arrays.sort(dataArray1);
        int[] arrayAngka1Copy = Arrays.copyOf(dataArray1, dataArray1.length);        
        for(int i = dataArray1.length-1; i >= 0; i--){
            dataArray1[i] = arrayAngka1Copy[(dataArray1.length-1)-i]; // (dataArray1.length-1)-i --> index2 mulai dari 0-hbis
        }
    }
    
    // Tambah 2 buah array
    private static int[] tambahArray(int[] dataArray1, int[] dataArray2){
        int banyakArray1 = dataArray1.length;
        int banyakArray2 = dataArray2.length;
        int[] penentuArray = new int[banyakArray2];
        // Menambahkan nilai 0 jika jumlah dari kedua array tidak sama
        if (banyakArray1 > banyakArray2){
            penentuArray = Arrays.copyOf(dataArray2,banyakArray1);
            dataArray2 = penentuArray;
        }else if (banyakArray2 > banyakArray1){
            penentuArray = Arrays.copyOf(dataArray1,banyakArray2);
            dataArray1 = penentuArray;
        }
        
        int[] arrayTambah = new int[dataArray1.length];
        for(int i=0;i< dataArray1.length;i++){
            arrayTambah[i] = dataArray1[i]+dataArray2[i];
        }
        return arrayTambah;
    }
    //gabung 2 buah array
    private static int[] gabungArray(int[] dataArray1, int[] dataArray2){
        int totalIndex = dataArray1.length + dataArray2.length;
        int[] arrayGabung = new int[totalIndex];
        arrayGabung = Arrays.copyOf(dataArray1, totalIndex);
        int index2=0;
        for (int i=dataArray2.length-1;i < totalIndex;i++){
            arrayGabung[i] = dataArray2[index2];
            index2++;
        }
        
        return arrayGabung;
    }
}
