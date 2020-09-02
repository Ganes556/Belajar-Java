/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial26;
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
        Scanner inputUser = new Scanner(System.in);
        float a,b;
        char operator; // bisa pke string. tidak pkai str biar lbh ringan
        String hasil;
        // input dari user !
        System.out.print("Nilai a = ");
        a = inputUser.nextFloat();
        
        System.out.print("Operator = ");
        operator = inputUser.next().charAt(0);
        
        System.out.print("Nilai b = ");
        b = inputUser.nextFloat();
        
        switch(operator){
            // pejumlahan
            case '+':
                hasil = "Hasil dari a " + operator + " b = " + (a+b);
                break;
            // pengurangan
            case '-':
                hasil = "Hasil dari a " + operator + " b = " + (a-b);                
                break;
            // perkalian
            case '*':
                hasil = "Hasil dari a " + operator + " b = " + (a*b);                
                break;
            // pembagian
            case '/':
                // pembagi nol statement
                switch ((int)b){
                    case 0:
                        hasil = "Pembagi 0 menghasilkan tak hingga !";
                        break;
                }
                
                hasil = "Hasil dari a " + operator + " b = " + (a/b);
                break;
            // tidak ada
            default:
                hasil = String.format("Operator '%s' tidak ada !",operator);

        }
        
        System.out.println(hasil);

    }
    
}
