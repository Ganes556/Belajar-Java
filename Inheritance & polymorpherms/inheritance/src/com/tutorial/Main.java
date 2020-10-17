package com.tutorial;
import com.utility.player.*;
import com.utility.atribut.*;
class Main{
    public static void main(String args[]){
        PlayerStrength player1 = new PlayerStrength("Ucup");
        Armor ArmorPlayer1 = new Armor("Armor kulit",12);


        PlayerStrength player2 = new PlayerStrength();
        player1.show();        
    }
}