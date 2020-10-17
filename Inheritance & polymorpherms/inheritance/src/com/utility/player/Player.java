package com.utility.player;
import com.utility.atribut.Armor;


public class Player {
    // deklarasi string
    protected String name;
    protected String nameArmor;

    // deklarasi int
    protected int health;
    protected int attack;
    
    
    // static variable
    protected static int tambahPlayer;
    // private Armor armor;

    protected void defaultPlayer(){
        Player.tambahPlayer++;
        // name
        this.name = "Player " + tambahPlayer;
        // perkakas
        this.health = 200;
        this.attack = 10;
        
    }
    
    public void setArmor(Armor armor){
        
    }

    public void show(){
        System.out.println(this.name);
        System.out.println(this.health);
    }
}
