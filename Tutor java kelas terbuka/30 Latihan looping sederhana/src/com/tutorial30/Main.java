/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial30;
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
        int awal,akhir,total;
        System.out.println("========= Input User =========");        
        System.out.print("Nilai awal = ");
        awal = inputUser.nextInt();
        System.out.print("Nilai akhir = ");
        akhir = inputUser.nextInt();
        
        // variable awal dan akhir untuk do while agar tidak ada pertambahan
        int awalDo,akhirDo;
        awalDo = awal;
        akhirDo = akhir;
        
        // variable awal dan akhir untuk do while agar tidak ada pertambahan
        int awalFor,akhirFor;
        awalFor = awal;
        akhirFor = akhir;
        
        // cara dengan while loop
        total = 0;
        System.out.println("========= While Loop =========");        
        while(awal <= akhir){
            total +=awal;
            System.out.println("ditambah "+awal+" menjadi = "+ total);            
            awal++;
        }
        
        System.out.println("ini adalah total dari while loop = " + total);
        
        // ini cara dengan for loop        
        total = 0;
        System.out.println("========= For Loop =========");
        for (;awalFor<= akhir;awalFor++){
            total += awalFor;
            System.out.println("ditambah "+awalFor+" menjadi = "+ total);
            // awalFor++;
        }
        
        System.out.println("ini adalah total dari for loop = " + total);
        
        
        
       
        // cara dengan do while
        total = 0;
        System.out.println("========= Do While Loop =========");       
        do{
            
            total +=awalDo;
            System.out.println("ditambah "+awalDo+" menjadi = "+ total);                        
            awalDo++;
        }while(awalDo <= akhirDo);
        
        System.out.println("ini adalah total dari do while loop = " + total);

    }
    
}
