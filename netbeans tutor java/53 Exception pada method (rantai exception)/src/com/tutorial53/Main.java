/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial53;
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
        int[] arrayData = {1,2,3};
        Scanner userInput= new Scanner(System.in);
        System.out.print("data ke-:");
        int indexInput = userInput.nextInt();
        // exception biasa
        System.out.println("Exception biasa");
        try{
            System.out.printf("data dari array ke-%d adalah %d",indexInput,arrayData[indexInput]);
        }catch(Exception e){
            System.err.println(e);
        }
        // exception didalam fungsi
        System.out.println("Exception dalam fungsi");
        int data = ambilDataDariArray(arrayData,indexInput);
        System.out.printf("\ndata dari array ke-%d adalah %d",indexInput,data);
        
        // Exception throws by method
        System.out.println("Exception throws by method");
        int data2 = 0;
        try{
            data2 = ambilData(arrayData,indexInput); 
        }catch(Exception e){
            System.err.println(e);
        }
        System.out.printf("data dari array ke-%d adalah %d",indexInput,data2);
        
        
        System.out.println("\n\nakhir dari program");
        
    }
    
    private static int ambilData(int[] array, int index) throws Exception{ // exceptionnya berada di tempat ia di panggil
       int hasil = array[index];
       return hasil;
    }
    
    private static int ambilDataDariArray(int[] array, int index){
        int hasil = 0;   
        try{
            hasil = array[index];
        }catch(Exception e){
            System.err.println(e);;
        }
        return hasil;
    }
   
}
