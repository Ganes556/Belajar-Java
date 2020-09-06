/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial39;
import java.util.Scanner;
/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);   
        // angka int normal
        int hasilInteger;
        hasilInteger = tambah(5,4);
        printAngka(hasilInteger);
        
        // angka float normal
        float hasilFloat;
        hasilFloat = tambah(5.2f,4);
        printAngka(hasilFloat);
        
        // angka float ditukar
        hasilFloat = tambah(4,9.8f);
        printAngka(hasilFloat);
        
        // pejumlahan 3 angka dari overload fungsi
        hasilInteger = tambah(10,20,30);
        printAngka(hasilInteger);
        
        // print angka
        System.out.println("");
        
        printAngka(10);
        printAngka(10.612341234f);
        printAngka(10.62341234D);
        printAngka(12);
        
        // contoh overlod fungsi pada javanya adalah 'System.out.println()'
        System.out.println();
    }
    // overload => menggunakan fungsi dengan nama yang sama tetapi type argumennya bisa dibuat berubah-ubah
    private static int tambah(int angkaInt1,int angkaInt2,int angkaInt3){
        return angkaInt1 + angkaInt2 + angkaInt3;
    }
    
    private static float tambah(int angkaFloat1,float angkaInt2){
        return angkaFloat1 + angkaInt2;
    }
    
    private static float tambah(float angkaFloat1,int angkaInt2){
        return angkaFloat1 + angkaInt2;
    }
    
    private static int tambah(int angkaInt1,int angkaInt2){
        return angkaInt1 + angkaInt2;
    }

    
    private static void printAngka(int angkaInteger){
        System.out.println("angka ini adalah integer dengan nilai = " + angkaInteger);
    }
    private static void printAngka(float angkaFloat){
        System.out.println("angka ini adalah float dengan nilai = " + angkaFloat);
    }
    private static void printAngka(double angkaDouble){
        System.out.println("angka ini adalah double dengan nilai = " + angkaDouble);
    }
}
