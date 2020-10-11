package com.tutorial;

import java.util.Arrays;

import java.util.ArrayList;
class Player{
    private String nama;
    // static variable
    private static int numberOfPlayer;
    // Arrays list bsa menambahkan jumlah anggotanya sesuka hati 
    // beda dengan object array biasa, berisi limit di objectnya
    private static ArrayList<String> nameList = new ArrayList<String>(); 
    Player(String nama){
        this.nama = nama;
        this.numberOfPlayer++;
        nameList.add(this.nama);
    }
    void show(){
        System.out.println(this.nama);
    }
    // static method 
    public static void getNumberOfPlayer(){
        System.out.println("Jumlah player yang ada ---> " + Player.numberOfPlayer);
    }
    public static ArrayList<String> getName(){
        return Player.nameList;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("Saitama");
        Player player2 = new Player("All might");
        Player player3 = new Player("Buroka");
        Player player4 = new Player("Ling-ling");
        
        Player.getNumberOfPlayer();
        System.out.println("Names of Player = "+ Player.getName());
        // System.out.println("Names of Player = "+ player1.getName()); // bisa dilakukan tapi tidak 
                                                                        // tidak dianjurkan karna manggil static 
    }
}
