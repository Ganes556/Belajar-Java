/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial58;
import java.io.*;
import java.util.Arrays;

/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // membaca file
        FileReader charInput = new FileReader("input.txt");
        BufferedReader bufferedRead = new BufferedReader(charInput);
        bufferedRead.mark(200);
        // membaca ke dalam string / membaca per baris
        String data = bufferedRead.readLine();
        System.out.println(data);

        // membaca ke dalam karakter
        bufferedRead.reset();
        char[] dataChar = new char[39];
        bufferedRead.read(dataChar,0,39);
        System.out.println(Arrays.toString(dataChar));

        // membaca baris
        bufferedRead.reset();
        System.out.println(bufferedRead.readLine()); // read line itu membaca per baris
        System.out.println(bufferedRead.readLine());


        // menulis dengan buffered Reader
        FileWriter fileOutput = new FileWriter("Output.txt");
        BufferedWriter bufferedOutput = new BufferedWriter(fileOutput);

        bufferedRead.reset();
        String baris1 = bufferedRead.readLine();
        bufferedOutput.write(baris1);
        bufferedOutput.flush();
        // menambahkan baris
        bufferedOutput.newLine();
        String baris2 = bufferedRead.readLine();
        bufferedOutput.write(baris2);
        bufferedOutput.flush();

        bufferedRead.close();
        charInput.close();
        fileOutput.close();
        bufferedOutput.close();
    }
    
}
