/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial55;
import java.io.FileInputStream;
import java.io.FileOutputStream;
/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;
        // membuka file
        fileInput = new FileInputStream("input.txt");
        // membaca file
        int data= fileInput.read();
        while(data != -1){
            System.out.print((char)data);
            data = fileInput.read();
        }
        System.out.println("");
        // menutup file
        fileInput.close();
        
        // contoh kedua dalam program pembukaan file
        
        try{
            // membuka file
            fileInput= new FileInputStream("input2.txt");
            fileOutput = new FileOutputStream("output2.txt");
            // membaca file
            int buffer = fileInput.read();
            // menulis file
            while(buffer != -1){
                fileOutput.write(buffer);
                buffer = fileInput.read();
            }
            
        }finally{
            if (fileInput != null){
                fileInput.close();
            }
            if (fileOutput != null){
                fileOutput.close();
            }
        }
        
        // terakhir try with resources
        FileInputStream in = new FileInputStream("input.txt");
        FileOutputStream ou = new FileOutputStream("output3.txt");
        try(in;ou){ // bisa yang diatas langsung di tulis di dalam try agar tidak bisa di pakai variable inNya
                // membaca file
                int resources = in.read();
                // menulis file
                while(resources != -1){
                    ou.write(resources);
                    resources = in.read();
            }
            
        }
        System.out.println(in.read());
        
        
        

    }
    
}
