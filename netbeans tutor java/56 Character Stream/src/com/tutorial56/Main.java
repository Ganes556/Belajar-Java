/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial56;
import java.io.FileInputStream; 
import java.io.IOException;
import java.io.FileReader;
import java.io.FileOutputStream;
/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // membuka file
        // byte stream -> FileInputStream
        // character stream -> FileReader
        
        // in
        FileInputStream byteFile = new FileInputStream("input.txt");
        FileReader      charFile = new FileReader("input.txt");
        // out
        FileOutputStream outByte = new FileOutputStream("outByte.txt");
        FileOutputStream outChar = new FileOutputStream("outChar.txt");

        
        // membaca file
        int Buffer = byteFile.read(); // ini unbufferd i/o

        System.out.println("Byte file");
        // byte fil e / byte stream
        while(Buffer != -1){
            System.out.print((char)Buffer);
            outByte.write(Buffer); // berubah karna bytenya di convert ke characterReader
            Buffer = byteFile.read();
        }
        System.out.println("\n\nChar file");
        // char file / char stream
        Buffer = charFile.read();
        while(Buffer != -1){
            System.out.print((char)Buffer);
            outChar.write(Buffer); // sedangkan ini jadi ngaco karna convert dari characterReader
            Buffer = charFile.read();
        }
        
        // menutup file
        byteFile.close();
        charFile.close();
        outByte.close();
        outChar.close();

    }
    
}
