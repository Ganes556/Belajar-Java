/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial52;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] array = {0,1,2,3};
       Scanner userInput = new Scanner(System.in);
       FileInputStream fileInput = null;

       System.out.print("Array ke-");
       int index = userInput.nextInt();
       // array err
       System.out.println("Handling out of bound");
       try{
           System.out.printf("index ke-%d adalah %d\n",index,array[index]);
       }catch(ArrayIndexOutOfBoundsException e){
           System.err.println(e);
       }               
       // runtime error jika file tidak ada  
       System.out.println("Handling IO not found");
       try{
           fileInput = new FileInputStream("input.txt"); 
       }catch(IOException e){
           System.err.println(e);
       } 
       
       // Menggabungkan 2 exception
        System.out.println("menggabungkan 2 exception");
       try{
           System.out.printf("index ke-%d adalah %d\n",index,array[index]);
           fileInput = new FileInputStream("input.txt"); 
       }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Index melewati batas array");
       }catch(IOException e){
           System.out.println("File tidak ditemukan");
       }
       // menambahkan finally
       System.out.println("Menambahkan finally");
       try{
           System.out.printf("index ke-%d adalah %d\n",index,array[index]);
       }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Index melewati batas array");
       }finally{ // contoh penggunaan untuk mengclose file setelah membuka file
           System.out.println("Finally");
       }
       System.out.println("akhir program");  
    }
    
}
