/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutoriall50;

/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // builder ini menambahkan kapasitas sebesar 16 di awal
        // dan tidak menambahkan sebuah memory seperti string   
        StringBuilder builder = new StringBuilder("halo,");
        printData(builder);
        
        // append --> menambahkan ke memory yg sama jika concat menmbahkan ke memory baru
        builder.append(" ini yang kedua !");
        printData(builder);
        
        // insert
        builder.insert(9, " hanya");
        printData(builder);
        
        // delete
        builder.delete(9, 15);
        printData(builder);
        
        // rubah character pada index tertentu
        builder.setCharAt(15, 'T');
        printData(builder);
        
        // replace
        builder.replace(15, 20, "TETUA");
        printData(builder);
        
        // casting menjadi string 
        String kalimat = builder.toString();
        System.out.println("");
        System.out.println("Data = " + kalimat);
        System.out.println("Panjang = " + kalimat.length());
        int addressString = System.identityHashCode(kalimat);
        System.out.println("address = " + Integer.toHexString(addressString));
    }
    private static void printData(StringBuilder dataBuilder){
        System.out.println("");
        System.out.println("Data = " + dataBuilder);
        System.out.println("Panjang = " + dataBuilder.length());
        System.out.println("Kapasitas = " + dataBuilder.capacity());
        
        int addressDataBuilder = System.identityHashCode(dataBuilder);
        System.out.println("address = " + Integer.toHexString(addressDataBuilder));
    }
    
}
