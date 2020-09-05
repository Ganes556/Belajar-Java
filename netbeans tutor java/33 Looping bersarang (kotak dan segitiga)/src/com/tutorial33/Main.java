/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial33;

/**
 *
 * @author Ganes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Persegi ");
        for(int i = 0;i<5;i++){ 
            for(int j=0;j<5;j++){ 
                System.out.print("* ");
            }
            System.out.println("");
        }
        
      
        
        System.out.println("\nSetengah segitiga bagian bawah kanan + angkanya");
        for(int i = 0;i<9;i++){ 
            for(int j=0;j<9;j++){ 
                if (j == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
                if (i+j == 8){
                    break;
                }
                
            }
            System.out.println("");
        }
        
        
        System.out.println("\nSetengah wajik bagian kanan");
        for(int i =0; i<9;i++){
            for (int j = 0; j < 9; j++) {
                System.out.print("* ");
                if (i==j){
                    break;
                }else if(i+j == 8){
                    break;
                }
            }
            System.out.println("");
        }
        
        
        System.out.println("\nSetengah segitiga bagian kanan atas");
        for(int i = 0;i<5;i++){ 
            for(int j=0;j<5;j++){ 
                System.out.print("* ");
                if (j == i){
                    break;
                }
            }
            System.out.println("");
        }
        
        
        System.out.println("\nWajik dengan menggunakan matriknya");
        int panjang = 9;
	int lebar = 9;
        for(int i = 0;i<9;i++){ 
            for(int j=0;j<9;j++){ 
                if ((j+ i < panjang/2) || (j-i > panjang/2) || (i-j > panjang/2 ) || (j + i > (panjang/2)*3)){
		//              4                    4                    4                         12
                // bagian kiri atas, bagian kanan atas, bagian bawah kiri, bagian bawah kanan 
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            
            System.out.println("");
        }
        
        
        for(int i = 0; i<5; i++){
            for(int j= 0; j < 5; j++){
                
            }
        }

        System.out.println("\nSetengah segitiga bagian kanan terbalik hadap atas")
	for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (j==i){
                    break;
                }
                System.out.print("  ");
            }
            for (int z = 0; z < 5-i; z++ ){
               
                System.out.print("* ");
                
            }

            System.out.println("");
        }
        
	System.out.println("\nSetengah segitiga bagian kiri terbalik hadap atas")
	for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (j==i){
                    break;
                }
                System.out.print("");
            }
            for (int z = 0; z < 5-i; z++ ){
               
                System.out.print("* ");
                
            }

            System.out.println("");
        }
        
        
        /* soalnya:
            Menampilkan bilangan sederet bilangan 1 s.d 100 dengan ketentuan setiap angka kelipatan tiga (3) yang ditampilkan kata “Tiga”, setiap kelipatan lima (5) yang ditampilkan adalah kata “lima” dan setiap angka yang merupakan kelipatan 3 dan 5 yang ditampilkan adalah “Unindra” Output: 1  2  tiga  4  lima  tiga   7  8  tiga  lima  11 unindra  13  14  unindra  ...   
            kalo mau nampilin begitu gimana bang algoritmanya ??? 
        */
        int bilanganAwal, bilanganAkhir;
        bilanganAwal = 1;
        bilanganAkhir = 100;
            
        for(; bilanganAwal <= bilanganAkhir; bilanganAwal++) {
               if(bilanganAwal % 3 == 0) {
                   if(bilanganAwal % 15 == 0) {
                       System.out.print("Unindra ");
                   }
                   else {
                       System.out.print("Tiga ");
                   }
               }
               else if(bilanganAwal % 5 == 0) {
                   System.out.print("Lima ");
               }
               else {
                   System.out.print(bilanganAwal + " ");
               }
           }


    }
    
}
