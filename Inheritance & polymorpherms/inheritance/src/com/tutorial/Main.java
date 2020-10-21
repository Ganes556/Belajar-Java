package com.tutorial;
// import package player dan atributnya 
import com.tutorial.player.*;
import com.tutorial.player.atribut.*;
class Main{
    public static void main(String args[]){
        // player 1 type strength
        PlayerStrength player1 = new PlayerStrength("Ucup");
        Armor armor1 = new Armor("Kulit",10);
        Weapon weapon1 = new Weapon("Katana",100);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);

        // player 2 default
        Player player2 = new Player();
        Armor armor2 = new Armor();
        Weapon weapon2 = new Weapon();
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

        // player 1 type strength
        PlayerAssasins player3 = new PlayerAssasins("Speed");
        Armor armor3 = new Armor("Assasins",2);
        Weapon weapon3 = new Weapon("Blade of Darkness",200);
        player3.setArmor(armor3);
        player3.setWeapon(weapon3);        


        // player attack 
        player3.attack(player2);
        
        player2.attack(player3);
        // player1.attack(player2);
        // player2.attack(player1); 
        // player1.attack(player2); 

        
    }
}