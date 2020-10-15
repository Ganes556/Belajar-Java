package com.tutorial;

public class Player {
    private static int tambahPlayer;
    // overloading = nama sama spesifikasi dan kelakuan beda
    // opsi 1
    Player(String name){
        this.tambahPlayer++;
        System.out.println(name);
    }
    // opsi2
    Player(){
        this.tambahPlayer++;
        System.out.println("Player " + this.tambahPlayer + " INI BOT\n=========================");
        
    }
    
}
