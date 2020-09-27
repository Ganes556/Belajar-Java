/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial25;
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
        // a operator b
        float a,b;
        char operator;
        String hasil;
        System.out.print("Nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("Operator = ");
        operator = inputUser.next().charAt(0); 
        System.out.print("Nilai b = ");
        b = inputUser.nextFloat(); 
        
        if (operator == '+'){
            // penjumlahan
            hasil = "Hasil dari a " + operator + " b = " + (a+b);
        }else if(operator == '-'){
            // pengurangan
            hasil = "Hasil dari a " + operator + " b = " + (a-b);
        }else if(operator == '*'){
            // perkalian
            hasil = "Hasil dari a " + operator + " b = " + (a*b);
        }else if(operator == '/'){
            // pembagian
            if (b == 0){
                hasil = "Pembagi nol menghasilkan tak hingga !";
            }else{
                hasil = "Hasil dari a " + operator + " b = " + (a/b);
            }
            
        }else{
            // tidak ada
            hasil = String.format("Operator '%s' tidak ada !",operator);
        }
        
        System.out.println(hasil);
        
        
    }
    
}
