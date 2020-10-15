package com.utility.player;
import com.utility.atribut.*;
public class Player {
    // deklarasi string
    protected String name;
    protected String nameArmor;

    // deklarasi int
    protected int health;
    protected int attack;
    
    // deklarasi object
    private Armor armor;
    protected Player(){
        this.name = "Player1";
        this.health = 200;
        this.attack = 10;
    }
    // set armor used
    protected void setArmor(Armor armor) {
        
        this.armor = armor;
    }

    public void show(){
        System.out.println(this.name);
        System.out.println(this.health);
        System.out.println(this.nameArmor);
        
    }
}
