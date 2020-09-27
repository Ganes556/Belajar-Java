/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial41;
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
        int arrayAngka[] = {12,14,16,18};
        // looping standar
        System.out.println("Looping standard");
        for(int i = 0; i < 4 ; i++){
            System.out.println("index ke-"+i +" adalah = "+arrayAngka[i]);
        }
        // looping dengan poperti array 
        System.out.println("Looping dengan properti length");
        for(int i = 0; i < arrayAngka.length;i++){
            System.out.println("index ke-"+i +" adalah = "+arrayAngka[i]);           
        }
        //looping khisison untuk collection <= array
        System.out.println("Looping for each");
        for(int angka : arrayAngka){
            System.out.println("angka pada looping ini = " + angka);           
        }
    }
    
}
