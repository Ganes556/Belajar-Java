/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial57;
import java.util.Arrays;
import java.io.*;
/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        long waktuStart,waktuFinish;
        
        // membaca dari file
        FileInputStream byteInput = new FileInputStream("input.txt");
        System.out.println(byteInput.available()); // check berapa karakter di dalam file
        
        // menghitung waktu pembacaan dari file
        waktuStart = System.nanoTime();
        System.out.println(byteInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("Waktu = " + (waktuFinish-waktuStart));
        byteInput.close();
        
        // membaca dari memory 
       FileInputStream byteInput2 = new FileInputStream("input.txt");
       BufferedInputStream bufferedInput = new BufferedInputStream(byteInput2);
       
       bufferedInput.mark(1);
       // menghitung waktu pembacaan dari memory
       waktuStart = System.nanoTime();
       System.out.println(bufferedInput.readAllBytes());
       waktuFinish = System.nanoTime();
       System.out.println("Waktu = " + (waktuFinish-waktuStart));
            
       // membaca ulang(digunakan kembali)/ reusable 
       bufferedInput.reset();
       byte[] data = bufferedInput.readAllBytes(); // kalau mau baca address gunakan array!
       String dataString = new String(data); // String bisa membaca byte array
       System.out.println(dataString);
       // close membaca dari memory
       byteInput2.close();
       bufferedInput.close();

       // menulias dengan menggunakan buffered output
       FileOutputStream byteOutput = new FileOutputStream("output.txt");
       BufferedOutputStream bufferedOutput= new BufferedOutputStream(byteOutput);
       
       // write data berupa byte
       bufferedOutput.write(data,0,data.length);
       bufferedOutput.flush();
       
       // close memory write
       bufferedOutput.close();
       byteOutput.close();

    }
    
}
