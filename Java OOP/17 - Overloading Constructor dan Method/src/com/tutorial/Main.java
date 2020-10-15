package com.tutorial;
public class Main {
    public static void main(String[] args) {
     
        // overloading pada constructor
        System.out.println("Overloading pada contructor!");
        Player player1 = new Player(); 
        Player player2 = new Player("ASTRO BOY");
        Player player3 = new Player();
        Player player4 = new Player("BOBOBOY");
        
        // overloading pada method static
        System.out.println("\nOverloading pada method static!");
        int hasil = MathTambah.tambah(12, 8);
        System.out.println(hasil);
        double hasil2 = MathTambah.tambah(12, 8.5);
        System.out.println(hasil2 + "\n");

        // overloading pada method biasa
        System.out.println("Overloading pada method biasa!");
        MathKali kali = new MathKali();
        System.out.println(kali.kali(10, 10));
        System.out.println(kali.kali(10.1,10.0));

        
        
    }
}
