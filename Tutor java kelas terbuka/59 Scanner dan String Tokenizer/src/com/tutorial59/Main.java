/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial59;
import java.io.*;
import java.util.*;
/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedRead = new BufferedReader(fileInput);
        
        Scanner scanner = new Scanner(bufferedRead);
        // check kata yang ada 
        System.out.println(scanner.hasNext()); //--> true
        
        //  membaca kata, dengan delimeter/pemisah space
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        
        // check kata yang tidak ada 
        System.out.println(scanner.hasNext()); // --> false
        
        // membaca kata dengan delimeter/pemisah koma/custom
        FileReader fileInput2 = new FileReader("input2.txt");
        BufferedReader bufferedRead2 = new BufferedReader(fileInput2);
        bufferedRead2.mark(200);
        
        
        Scanner scanner2 = new Scanner(bufferedRead2);
        scanner2.useDelimiter(",");
        System.out.println("");
        // ini membaca keseluruhan isi dari file tidak per baris 
        while(scanner2.hasNext()){
            System.out.println(scanner2.next());
        }
        
        // membaca per baris dengan tokenizer
        bufferedRead2.reset();
        String data = bufferedRead2.readLine();
        StringTokenizer stringToken = new StringTokenizer(data,",");
        
        System.out.println("Baris 1 tokenizer");
        while(stringToken.hasMoreTokens()){
            System.out.println(stringToken.nextToken());
        }
        
        // baris kedua
        data = bufferedRead2.readLine();
        stringToken = new StringTokenizer(data,",");
        
        System.out.println("Baris dua tokenizer");
        while(stringToken.hasMoreTokens()){
            System.out.println(stringToken.nextToken());
        }
    }
    
}
